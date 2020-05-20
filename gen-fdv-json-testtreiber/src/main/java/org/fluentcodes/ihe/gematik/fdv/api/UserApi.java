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
@Path("/")
@Api(value = "/", description = "")
public interface UserApi  {

    /**
     * Login Aktensession
     *
     * Umsetzung Operation I_FdV::login A_18045; Login in zwei Varianten; Falls die insurantID uebergeben wird, dann referenziert die insurantID die AUT-Identitaet des Nutzers, welche ueber eine eGK oder einen Signaturdienst (Konfigurationsparameter UseEGK) verfuegbar ist. Falls keine insurantID übergeben wird, dann wird eine PKCS12-Datei uebergeben. Das C.CH.AUT Zertifikat und der private Schluessel aus der PKCS12-Datei werden im Testtreiber genutzt (bspw. Signatur bei der Authentisierung und der Schluesselerzeugung mit SGD).
     *
     */
    @POST
    @Path("/login")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Login Aktensession", tags={ "user",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ProtocolResponseDTO.class) })
    public ProtocolResponseDTO login1(@Valid RequestDTO requestDTO);

    /**
     * Logout Aktensession
     *
     * Umsetzung Operation I_FdV::logout A_18046; Logout wird fuer eine per InsurantID (KVNR) referenzierte Identitaet ausgeloest.
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

