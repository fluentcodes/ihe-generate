package org.fluentcodes.ihe.gematik.fdv.api;

import org.fluentcodes.ihe.gematik.fdv.model.ResponsePingDTO;
import org.fluentcodes.ihe.gematik.fdv.model.ResponseProductInformationDTO;

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
public interface DefaultApi  {

    /**
     * Gibt die Informationen zur Produktinformation zurueck
     *
     * Umsetzung Operation I_FdV_Management::getProductInformation (A_18068)
     *
     */
    @POST
    @Path("/productinformation")
    @Produces({ "application/json" })
    @ApiOperation(value = "Gibt die Informationen zur Produktinformation zurueck", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseProductInformationDTO.class) })
    public ResponseProductInformationDTO getProductInformation1();

    /**
     * Prueft die Erreichbarkeit der Schnittstelle auf Anwendungsebene
     *
     * Ping prueft die Erreichbarkeit der Schnittstelle auf Anwendungsebene. In der Response wird die Schnittstellenversion zurueckgegeben, was der Pruefung der Interoberabilitaet dient.
     *
     */
    @POST
    @Path("/ping")
    @Produces({ "application/json" })
    @ApiOperation(value = "Prueft die Erreichbarkeit der Schnittstelle auf Anwendungsebene", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponsePingDTO.class) })
    public ResponsePingDTO ping1();
}

