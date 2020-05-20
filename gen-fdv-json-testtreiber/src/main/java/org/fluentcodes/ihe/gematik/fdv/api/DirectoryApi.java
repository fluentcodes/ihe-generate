package org.fluentcodes.ihe.gematik.fdv.api;

import org.fluentcodes.ihe.gematik.fdv.model.FindDirectoryRequestDTO;
import org.fluentcodes.ihe.gematik.fdv.model.FindDirectoryResponseDTO;

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
public interface DirectoryApi  {

    /**
     * Suche nach Leistungserbringerinstitutionen im Verzeichnisdienst
     *
     * Umsetzung Operation I_FdV::findHcp (A_18048)
     *
     */
    @POST
    @Path("/findHcpos")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Suche nach Leistungserbringerinstitutionen im Verzeichnisdienst", tags={ "directory",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = FindDirectoryResponseDTO.class) })
    public FindDirectoryResponseDTO findHcpos1(@Valid FindDirectoryRequestDTO findDirectoryRequestDTO);

    /**
     * Suche nach Kostentraegern im Verzeichnisdienst
     *
     * Umsetzung Operation I_FdV::findInsurance (A_18051)
     *
     */
    @POST
    @Path("/findInsurances")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Suche nach Kostentraegern im Verzeichnisdienst", tags={ "directory" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = FindDirectoryResponseDTO.class) })
    public FindDirectoryResponseDTO findInsurances1(@Valid FindDirectoryRequestDTO findDirectoryRequestDTO);
}

