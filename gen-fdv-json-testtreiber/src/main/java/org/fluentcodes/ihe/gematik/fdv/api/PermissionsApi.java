package org.fluentcodes.ihe.gematik.fdv.api;

import org.fluentcodes.ihe.gematik.fdv.model.DeletePermissionDTO;
import org.fluentcodes.ihe.gematik.fdv.model.PermissionHcpoDTO;
import org.fluentcodes.ihe.gematik.fdv.model.PermissionInsuranceDTO;
import org.fluentcodes.ihe.gematik.fdv.model.PermissionRepresentativeDTO;
import org.fluentcodes.ihe.gematik.fdv.model.PermissionsRequestDTO;
import org.fluentcodes.ihe.gematik.fdv.model.PermissionsResponseDTO;
import org.fluentcodes.ihe.gematik.fdv.model.ResponseDTO;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Testtreiber ePA-Frontend des Versicherten
 *
 * <p>REST Schnittstelle einer Test-App fuer das ePA-Modul FdV
 *
 */
@Path("")
@Api(value = "/", description = "")
public interface PermissionsApi  {

    /**
     * Anzeige der auf ein Dokument berechtigten LEI
     *
     * Diese Operation führt den Anwendungsfall \&quot;Vergebene Berechtigungen eines Dokuments auflisten\&quot; in einer mit insurantId identifizierten Aktensession aus. Der Nutzer erhält Informationen darüber, welche Leistungserbringerinstitutionen auf das Dokument Zugriff haben.
     *
     */
    @POST
    @Path("/permissionsForDocument")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Anzeige der auf ein Dokument berechtigten LEI", tags={ "permissions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = PermissionsResponseDTO.class) })
    public PermissionsResponseDTO getDocAuthorized1(@Valid PermissionsRequestDTO permissionsRequestDTO);

    /**
     * Alle Berechtigungen lesen
     *
     * Diese Operation führt den Anwendungsfall \&quot;Vergebene Berechtigungen auflisten\&quot; in einer mit insurantId identifizierten Aktensession aus.
     *
     */
    @GET
    @Path("/permissions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Alle Berechtigungen lesen", tags={ "permissions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = PermissionsResponseDTO.class) })
    public PermissionsResponseDTO getPermissions1();

    /**
     * Berechtigung für LEI erteilen
     *
     * Diese Operation führt den Anwendungsfall \&quot;Berechtigung für LEI vergeben\&quot; in einer mit insurantId identifizierten Aktensession aus.
     *
     */
    @POST
    @Path("/permissionHcpo/add")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Berechtigung für LEI erteilen", tags={ "permissions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO permissionHcpoAdd(@Valid PermissionHcpoDTO permissionHcpoDTO);

    /**
     * Berechtigung für eine LEI löschen
     *
     * Diese Operation führt den Anwendungsfall \&quot;Berechtigung für LEI löschen\&quot; in einer mit insurantId identifizierten Aktensession aus.
     *
     */
    @POST
    @Path("/permissionHcpo/remove")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Berechtigung für eine LEI löschen", tags={ "permissions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO permissionHcpoRemove(@Valid DeletePermissionDTO deletePermissionDTO);

    /**
     * Berechtigung für eine LEI ändern
     *
     * Diese Operation führt den Anwendungsfall \&quot;Berechtigung für LEI ändern\&quot; in einer mit insurantId identifizierten Aktensession aus.
     *
     */
    @POST
    @Path("/permissionHcpo/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Berechtigung für eine LEI ändern", tags={ "permissions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO permissionHcpoUpdate(@Valid PermissionHcpoDTO permissionHcpoDTO);

    /**
     * Berechtigung für einen Kostenträger erteilen
     *
     * Diese Operation führt den Anwendungsfall \&quot;Berechtigung für Kostenträger vergeben\&quot; in einer mit insurantId identifizierten Aktensession aus.
     *
     */
    @POST
    @Path("/permissionInsurance/add")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Berechtigung für einen Kostenträger erteilen", tags={ "permissions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO permissionInsuranceAdd(@Valid PermissionInsuranceDTO permissionInsuranceDTO);

    /**
     * Berechtigung für einen Kostenträger löschen
     *
     * Diese Operation führt den Anwendungsfall \&quot;Berechtigung für Kostenträger löschen\&quot; in einer mit insurantId identifizierten Aktensession aus.
     *
     */
    @POST
    @Path("/permissionInsurance/remove")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Berechtigung für einen Kostenträger löschen", tags={ "permissions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO permissionInsuranceRemove(@Valid DeletePermissionDTO deletePermissionDTO);

    /**
     * Berechtigung für einen Vertreter erteilen
     *
     * Diese Operation führt den Anwendungsfall \&quot;Vertretung einrichten\&quot; in einer mit insurantId identifizierten Aktensession aus.
     *
     */
    @POST
    @Path("/permissionRepresentative/add")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Berechtigung für einen Vertreter erteilen", tags={ "permissions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO permissionRepresentativeAdd(@Valid PermissionRepresentativeDTO permissionRepresentativeDTO);

    /**
     * Berechtigung für einen Vertreter löschen
     *
     * Diese Operation führt den Anwendungsfall \&quot;Berechtigung für Vertreter löschen\&quot; in einer mit insurantId identifizierten Aktensession aus.
     *
     */
    @POST
    @Path("/permissionRepresentative/remove")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Berechtigung für einen Vertreter löschen", tags={ "permissions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO permissionRepresentativeRemove(@Valid DeletePermissionDTO deletePermissionDTO);
}
