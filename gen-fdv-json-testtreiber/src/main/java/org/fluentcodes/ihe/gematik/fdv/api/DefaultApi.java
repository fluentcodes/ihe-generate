package org.fluentcodes.ihe.gematik.fdv.api;

import org.fluentcodes.ihe.gematik.fdv.model.RequestDTO;
import org.fluentcodes.ihe.gematik.fdv.model.ResponsePingDTO;
import org.fluentcodes.ihe.gematik.fdv.model.ResponseProductInformationDTO;
import org.fluentcodes.ihe.gematik.fdv.model.UpdateKeysResponseDTO;

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
public interface DefaultApi  {

    /**
     * Gibt die Informationen zur Produktinformation zurück
     *
     * Die Operation liefert eine Liste mit den Werten der Produktinformation.
     *
     */
    @POST
    @Path("/productinformation")
    @Produces({ "application/json" })
    @ApiOperation(value = "Gibt die Informationen zur Produktinformation zurück", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseProductInformationDTO.class) })
    public ResponseProductInformationDTO getProductInformation1();

    /**
     * Prüft die Erreichbarkeit der Schnittstelle auf Anwendungsebene
     *
     * Ping prüft die Erreichbarkeit der Schnittstelle auf Anwendungsebene. In der Response wird die Schnittstellenversion zurückgegeben, was der Prüfung der Interoberabilität dient.
     *
     */
    @POST
    @Path("/ping")
    @Produces({ "application/json" })
    @ApiOperation(value = "Prüft die Erreichbarkeit der Schnittstelle auf Anwendungsebene", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponsePingDTO.class) })
    public ResponsePingDTO ping1();

    /**
     * Umschlüsselung durchführen
     *
     * Diese Operation führt den Anwendungsfall \&quot;Umschlüsselung\&quot; in einer mit insurantId identifizierten Aktensession aus. Es werden neue Aktenschlüssel, Kontextschlüssel bzw. Dokumentenschlüssel für den Versicherten, die Berechtigten und die Dokumentenverwaltung erzeugt.
     *
     */
    @POST
    @Path("/updateKeys")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Umschlüsselung durchführen", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = UpdateKeysResponseDTO.class) })
    public UpdateKeysResponseDTO updateKeys1(@Valid RequestDTO requestDTO);
}
