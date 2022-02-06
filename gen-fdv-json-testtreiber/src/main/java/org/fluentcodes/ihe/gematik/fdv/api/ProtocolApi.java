package org.fluentcodes.ihe.gematik.fdv.api;

import org.fluentcodes.ihe.gematik.fdv.model.ProtocolResponseDTO;
import org.fluentcodes.ihe.gematik.fdv.model.RequestDTO;
import org.fluentcodes.ihe.gematik.fdv.model.SignedProtocolResponseDTO;

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
public interface ProtocolApi  {

    /**
     * Zugriffsprotokolle lesen
     *
     * Diese Operation führt den Anwendungsfall \&quot;Zugriffsprotokoll einsehen\&quot; in einer mit insurantId identifizierten Aktensession aus. Die vom Aktensystem gelieferten Protokolleinträge werden aufgearbeitet und zurückgegeben. Liefert alle Einträge aus dem §291a und Verwaltungsprotokoll für das Aktenkonto.
     *
     */
    @POST
    @Path("/protocol")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Zugriffsprotokolle lesen", tags={ "protocol" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ProtocolResponseDTO.class) })
    public ProtocolResponseDTO getProtocol1(@Valid RequestDTO requestDTO);

    /**
     * Zugriffsprotokolle mit PAdES-Signatur lesen
     *
     * Diese Operation führt den Anwendungsfall \&quot;signiertes Zugriffsprotokoll einsehen\&quot; in einer mit insurantId identifizierten Aktensession aus. Die vom Aktensystem gelieferten Protokolleinträge werden aufgearbeitet und zurückgegeben. Liefert alle Einträge aus getSignedAuditEvents für das Aktenkonto.
     *
     */
    @POST
    @Path("/signedProtocol")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Zugriffsprotokolle mit PAdES-Signatur lesen", tags={ "protocol" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = SignedProtocolResponseDTO.class) })
    public SignedProtocolResponseDTO getSignedProtocol1(@Valid RequestDTO requestDTO);
}
