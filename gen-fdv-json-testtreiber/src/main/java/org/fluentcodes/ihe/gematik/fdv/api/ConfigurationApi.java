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
@Path("/configuration")
@Api(value = "/", description = "")
public interface ConfigurationApi  {

    /**
     * Gesamte Konfiguration lesen
     *
     * Die Operation liefert eine Liste aller Konfigurationsparameter des FdV mit den eingestellten Werten. Liefert alle Konfigurationseinträge, die dem Filter entsprechen. Als Filter ist configurationEntryId möglich. Wird kein Filter angegeben, dann werden alle Einträge aus der Konfiguration zurückgegeben.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Gesamte Konfiguration lesen", tags={ "configuration" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation; Es werden alle Konfigurationseinträge zurückgegeben.; Wenn nach einer uid gesucht wurde, wird genau dieser Eintrag zurückgegeben.; Falls der Konfigurationseintrag vorab nicht gesetzt wurde, wird ein Leerstring zurückgegeben.", response = ConfigurationEntry.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Entry not found") })
    public List<ConfigurationEntry> getConfigurationEntries1(@QueryParam("uid") String uid);

    /**
     * Konfigurationseintrag ändern
     *
     * Diese Operation setzt ein oder mehrere Werte für eine Liste von Konfigurationsparametern sowie für herstellerspezifische Konfigurationsparameter. Die Liste der herstellerspezifischen Konfigurationsparameter sind in der Betriebsdokumentation zu beschreiben.
     *
     */
    @PUT
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Konfigurationseintrag ändern", tags={ "configuration" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO updateConfigurationEntries1(@Valid ConfigurationEntry configurationEntry);
}
