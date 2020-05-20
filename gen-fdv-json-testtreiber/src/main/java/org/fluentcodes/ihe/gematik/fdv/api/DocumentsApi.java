package org.fluentcodes.ihe.gematik.fdv.api;

import org.fluentcodes.ihe.gematik.fdv.model.DocumentsRequestDTO;
import org.fluentcodes.ihe.gematik.fdv.model.FindDocumentsRequestDTO;
import org.fluentcodes.ihe.gematik.fdv.model.FindDocumentsResponseDTO;
import org.fluentcodes.ihe.gematik.fdv.model.ResponseDTO;
import org.fluentcodes.ihe.gematik.fdv.model.RetrieveDocumentsResponseDTO;
import org.fluentcodes.ihe.gematik.fdv.model.StoreDocumentRequestDTO;

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
public interface DocumentsApi  {

    /**
     * Dokumente aus dem Aktenkonto loeschen
     *
     * Umsetzung Operation I_FdV::deleteDocuments (A_18061); Loescht die Dokumente mit dem im Request angegebenen Ids aus dem Aktenkonto. Die Ids werden mittels findDocuments ermittelt.
     *
     */
    @POST
    @Path("/deleteDocuments")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Dokumente aus dem Aktenkonto loeschen", tags={ "documents",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO deleteDocuments1(@Valid DocumentsRequestDTO documentsRequestDTO);

    /**
     * Dokumente und Submission Sets in einem Aktenkonto finden
     *
     * Umsetzung Operation I_FdV::findDocuments (A_18059); Die fuer die Suchoperation zu verwendende Stored Query wird durch den Parameter vorgegeben. Falls dieser nicht angegeben ist, muss eine geeignete Stored Query gewaehlt werden.; Wenn die Suchparameter ein SubmissionSet adressieren, dann soll der Response die Metadaten der im SubmissionSet enthaltenen Dokumente (unter Beachtung ggf. zusätzlich angegebenener Suchkriterien zu Dokumenten) beinhalten.; Der Response enthält Metadaten zu Dokumenten aber nicht die Dokumente selbst.
     *
     */
    @POST
    @Path("/findDocuments")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Dokumente und Submission Sets in einem Aktenkonto finden", tags={ "documents",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = FindDocumentsResponseDTO.class) })
    public FindDocumentsResponseDTO findDocuments1(@Valid FindDocumentsRequestDTO findDocumentsRequestDTO);

    /**
     * Dokumente aus Aktenkonto herunterladen
     *
     * Umsetzung Operation I_FdV::getDocuments (A_18060); Laedt die Dokumente mit den im Request angegebenen Ids aus dem Aktenkonto. Die Ids werden mittels findDocuments ermittelt.
     *
     */
    @POST
    @Path("/retrieveDocuments")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Dokumente aus Aktenkonto herunterladen", tags={ "documents",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = RetrieveDocumentsResponseDTO.class) })
    public RetrieveDocumentsResponseDTO retrieveDocuments1(@Valid DocumentsRequestDTO documentsRequestDTO);

    /**
     * Dokumente in ein Aktenkonto laden
     *
     * Umsetzung Operation I_FdV::putDocuments (A_18058)
     *
     */
    @POST
    @Path("/storeDocuments")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Dokumente in ein Aktenkonto laden", tags={ "documents" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO storeDocuments1(@Valid StoreDocumentRequestDTO storeDocumentRequestDTO);
}

