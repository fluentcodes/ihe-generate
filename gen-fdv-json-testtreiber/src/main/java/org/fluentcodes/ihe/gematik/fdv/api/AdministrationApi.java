package org.fluentcodes.ihe.gematik.fdv.api;

import org.fluentcodes.ihe.gematik.fdv.model.ChangeProviderRequestDTO;
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
@Path("/")
@Api(value = "/", description = "")
public interface AdministrationApi  {

    /**
     * Anbieter wechseln
     *
     * Umsetzung Operation I_FdV::changeProvicer (A_18047)
     *
     */
    @POST
    @Path("/changeProvider")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Anbieter wechseln", tags={ "administration",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO changeProvider1(@Valid ChangeProviderRequestDTO changeProviderRequestDTO);

    /**
     * Benachrichtigungsadresse fuer Geraeteautorisierung aktualisieren
     *
     * Umsetzung Operation I_FdV::putNotificationInformation (A_18063); Hinterlegt eine Benachrichtigungsadresse fuer das Aktenkonto.
     *
     */
    @POST
    @Path("/NotificationInformation")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Benachrichtigungsadresse fuer Geraeteautorisierung aktualisieren", tags={ "administration" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO putNotificationInformation1(@Valid NotificationInformationRequestDTO notificationInformationRequestDTO);
}

