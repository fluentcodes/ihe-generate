package org.fluentcodes.ihe.gematik.fdv.api;

import org.fluentcodes.ihe.gematik.fdv.model.ChangeProviderRequestDTO;
import org.fluentcodes.ihe.gematik.fdv.model.GetNotificationInformationRequestDTO;
import org.fluentcodes.ihe.gematik.fdv.model.GetNotificationInformationResponseDTO;
import org.fluentcodes.ihe.gematik.fdv.model.NotificationInformationRequestDTO;
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
public interface AdministrationApi  {

    /**
     * Anbieter wechseln
     *
     * Diese Operation führt den Anwendungsfall \&quot;Anbieter wechseln\&quot; in einer mit insurantId identifizierten Aktensession aus.
     *
     */
    @POST
    @Path("/changeProvider")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Anbieter wechseln", tags={ "administration" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO changeProvider1(@Valid ChangeProviderRequestDTO changeProviderRequestDTO);

    /**
     * Hinterlegte Benachrichtigungsadressen abfragen
     *
     * Diese Operation führt den Anwendungsfall \&quot;Benachrichtigungsadresse für Geräteautorisierung abfragen\&quot; in einer mit insurantId identifizierte Aktensession aus.
     *
     */
    @POST
    @Path("/getNotificationInfoList")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Hinterlegte Benachrichtigungsadressen abfragen", tags={ "administration" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = GetNotificationInformationResponseDTO.class) })
    public GetNotificationInformationResponseDTO getNotificationInformation1(@Valid GetNotificationInformationRequestDTO getNotificationInformationRequestDTO);

    /**
     * Benachrichtigungsadresse für Geräteautorisierung aktualisieren
     *
     * Diese Operation führt den Anwendungsfall \&quot;Benachrichtigungsadresse für Geräteautorisierung aktualisieren\&quot; in einer mit insurantId identifizierte Aktensession aus. Hinterlegt eine Benachrichtigungsadresse für das Aktenkonto.
     *
     */
    @POST
    @Path("/notificationInformation")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Benachrichtigungsadresse für Geräteautorisierung aktualisieren", tags={ "administration" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO putNotificationInformation1(@Valid NotificationInformationRequestDTO notificationInformationRequestDTO);
}
