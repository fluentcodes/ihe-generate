package org.fluentcodes.ihe.gematik.fdv.api;

import org.fluentcodes.ihe.gematik.fdv.model.ProtocolResponseDTO;
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
@Path("")
@Api(value = "/", description = "")
public interface UserApi  {

    /**
     * Login Aktensession
     *
     * Diese Operation führt ein explizites Login für ein Aktenkonto mit dem RecordIdenfier für insurantId aus. Für die Verwendung einer eGK können die zu verwendende PIN sowie die CAN (für NFC) übergeben werden. Für die Verwendung einer alvi-Identität kann der zu verwendende Authentisierungstoken übergeben werden. Falls die insurantID übergeben wird, dann referenziert die insurantID die AUT-identität des Nutzers, welche über eine eGK oder einen Signaturdienst (Konfigurationsparameter UseEGK) verfügbar ist. Falls keine insurantID übergeben wird, dann wird eine PKCS12-Datei übergeben. Das C.CH.AUT Zertifikat und der private Schlüssel aus der PKCS12-Datei werden im Testtreiber genutzt (bspw. Signatur bei der Authentisierung und der Schlüsselerzeugung mit SGD).
     *
     */
    @POST
    @Path("/login")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Login Aktensession", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ProtocolResponseDTO.class) })
    public ProtocolResponseDTO login1(@Valid RequestDTO requestDTO);

    /**
     * Logout Aktensession
     *
     * Diese Operation führt ein Logout für eine mit insurantId identifizierte Aktensession aus.
     *
     */
    @POST
    @Path("/logout")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Logout Aktensession", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO logout1(@Valid RequestDTO requestDTO);
}
