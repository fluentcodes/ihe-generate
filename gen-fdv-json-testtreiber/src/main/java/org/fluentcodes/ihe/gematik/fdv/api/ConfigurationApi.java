package org.fluentcodes.ihe.gematik.fdv.api;

import org.fluentcodes.ihe.gematik.fdv.model.ConfigurationEntry;
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
public interface ConfigurationApi  {

    /**
     * Gesamte Konfiguration lesen
     *
     * Umsetzung Operation I_FdV_Management::getConfiguration (A_18067); Liefert alle Konfigurationseintraege, die dem Filter entsprechen. Als Filter ist configurationEntryId moeglich.   Wird kein Filter angegeben, dann werden alle Eintraege aus der Konfiguration zurueckgegeben.
     *
     */
    @GET
    @Path("/configuration")
    @Produces({ "application/json" })
    @ApiOperation(value = "Gesamte Konfiguration lesen", tags={ "configuration",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation; Es werden alle Konfigurationseintraege zurueckgegeben.; Wenn nach einer uid gesucht wurde, wird genau dieser Eintrag zurueckgegeben.; Falls der Konfigurationseintrag vorab nicht gesetzt wurde, wird ein Leerstring zurückgegeben.", response = ConfigurationEntry.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Entry not found") })
    public List<ConfigurationEntry> getConfigurationEntries1(@QueryParam("uid")  String uid);

    /**
     * Konfigurationseintrag aendern
     *
     * Umsetzung Operation I_FdV_Management::setConfiguration (A_18066); Setzt einen Konfigurationseintrag
     *
     */
    @PUT
    @Path("/configuration")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Konfigurationseintrag aendern", tags={ "configuration" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO updateConfigurationEntries1(@Valid ConfigurationEntry configurationEntry);
}

