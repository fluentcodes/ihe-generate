package org.fluentcodes.ihe.gematik.fdv.api;

import org.fluentcodes.ihe.gematik.fdv.model.DeletePermissionDTO;
import org.fluentcodes.ihe.gematik.fdv.model.PermissionHcpoDTO;
import org.fluentcodes.ihe.gematik.fdv.model.PermissionInsuranceDTO;
import org.fluentcodes.ihe.gematik.fdv.model.PermissionRepresentativeDTO;
import org.fluentcodes.ihe.gematik.fdv.model.PermissionsResponseDTO;
import org.fluentcodes.ihe.gematik.fdv.model.RequestDTO;
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
@Path("/")
@Api(value = "/", description = "")
public interface PermissionsApi  {

    /**
     * Berechtigung fuer LEI erteilen
     *
     * Umsetzung Operation I_FdV::grantPermissionHcp (A_18049)
     *
     */
    @POST
    @Path("/permissionHcpo")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Berechtigung fuer LEI erteilen", tags={ "permissions",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO addPermissionHcpo1(@Valid PermissionHcpoDTO permissionHcpoDTO);

    /**
     * Berechtigung fuer einen Kostentraeger erteilen
     *
     * Umsetzung Operation I_FdV::grantPermissionInsurance (A_18052)
     *
     */
    @POST
    @Path("/permissionInsurance")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Berechtigung fuer einen Kostentraeger erteilen", tags={ "permissions",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO addPermissionInsurance1(@Valid PermissionInsuranceDTO permissionInsuranceDTO);

    /**
     * Berechtigung fuer einen Vertreter erteilen
     *
     * Umsetzung Operation I_FdV::grantPermissionRepresentative (A_18050)
     *
     */
    @POST
    @Path("/permissionRepresentative")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Berechtigung fuer einen Vertreter erteilen", tags={ "permissions",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO addPermissionRepresentative1(@Valid PermissionRepresentativeDTO permissionRepresentativeDTO);

    /**
     * Berechtigung fuer eine LEI aendern
     *
     * Umsetzung Operation I_FdV::changePermissionHcp (A_18054)
     *
     */
    @PUT
    @Path("/permissionHcpo")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Berechtigung fuer eine LEI aendern", tags={ "permissions",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO changePermissionHcpo1(@Valid PermissionHcpoDTO permissionHcpoDTO);

    /**
     * Berechtigung fuer eine LEI loeschen
     *
     * Umsetzung Operation I_FdV::deletePermissionHcp (A_18055)
     *
     */
    @DELETE
    @Path("/permissionHcpo")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Berechtigung fuer eine LEI loeschen", tags={ "permissions",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Entry not found") })
    public void deletePermissionHcpo1(@Valid DeletePermissionDTO deletePermissionDTO);

    /**
     * Berechtigung fuer einen Kostentraeger loeschen
     *
     * Umsetzung Operation I_FdV::deletePermissionInsurance (A_18057)
     *
     */
    @DELETE
    @Path("/permissionInsurance")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Berechtigung fuer einen Kostentraeger loeschen", tags={ "permissions",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Entry not found") })
    public void deletePermissionInsurance1(@Valid DeletePermissionDTO deletePermissionDTO);

    /**
     * Berechtigung fuer einen Vertreter loeschen
     *
     * Umsetzung Operation I_FdV::deletePermissionRepresentative (A_18056)
     *
     */
    @DELETE
    @Path("/permissionRepresentative")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Berechtigung fuer einen Vertreter loeschen", tags={ "permissions",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Entry not found") })
    public void deletePermissionRepresentative1(@Valid DeletePermissionDTO deletePermissionDTO);

    /**
     * Alle Berechtigungen lesen
     *
     * Umsetzung Operation I_FdV::getPermissions (A_18053)
     *
     */
    @POST
    @Path("/permissions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Alle Berechtigungen lesen", tags={ "permissions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = PermissionsResponseDTO.class) })
    public PermissionsResponseDTO getPermissions1(@Valid RequestDTO requestDTO);
}

