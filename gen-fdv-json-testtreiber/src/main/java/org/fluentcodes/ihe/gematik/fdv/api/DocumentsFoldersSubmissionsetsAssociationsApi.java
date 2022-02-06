package org.fluentcodes.ihe.gematik.fdv.api;

import org.fluentcodes.ihe.gematik.fdv.model.DocumentsRequestDTO;
import org.fluentcodes.ihe.gematik.fdv.model.FindObjectsRequestDTO;
import org.fluentcodes.ihe.gematik.fdv.model.FindObjectsResponseDTO;
import org.fluentcodes.ihe.gematik.fdv.model.ObjectRequestDTO;
import org.fluentcodes.ihe.gematik.fdv.model.ReplaceDocumentRequestDTO;
import org.fluentcodes.ihe.gematik.fdv.model.ResponseDTO;
import org.fluentcodes.ihe.gematik.fdv.model.RetrieveDocumentsResponseDTO;
import org.fluentcodes.ihe.gematik.fdv.model.StoreDocumentRequestDTO;
import org.fluentcodes.ihe.gematik.fdv.model.UpdateMetadataRequestDTO;

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
public interface DocumentsFoldersSubmissionsetsAssociationsApi  {

    /**
     * Dokumente, Ordner aus dem Aktenkonto löschen
     *
     * Diese Operation führt den Anwendungsfall \&quot;Dokumente löschen\&quot; in einer mit insurantId identifizierten Aktensession aus. löscht die Dokumente, Ordner oder  mit dem im Request angegebenen Ids aus dem Aktenkonto. Die Ids werden mittels findDocuments ermittelt.
     *
     */
    @POST
    @Path("/deleteObjects")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Dokumente, Ordner aus dem Aktenkonto löschen", tags={ "documents, folders, submissionsets, associations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO deleteObjects1(@Valid ObjectRequestDTO objectRequestDTO);

    /**
     * Dokumente, Ordner, Submission Sets und/oder Verknüpfungen in einem Aktenkonto finden
     *
     * Diese Operation führt den Anwendungsfall \&quot;Dokumente / Ordner suchen\&quot; in einer mit insurantId identifizierten Aktensession aus. Die Parameter returnType (Werte sind „LeafClass“ oder „ObjectRef“), startIndex und maxResults werden zum Gruppieren der Ergebnisse für das Blättern verwendet. Die für die Suchoperation zu verwendende Stored Query wird durch den Parameter vorgegeben. Falls dieser nicht angegeben ist, muss eine geeignete Stored Query gewählt werden. Wenn die Suchparameter ein SubmissionSet adressieren, dann soll der Response die Metadaten der im SubmissionSet enthaltenen Dokumente (unter Beachtung ggf. zusätzlich angegebenener Suchkriterien zu Dokumenten) beinhalten. Die Response enthält Metadaten zu Dokumenten aber nicht die Dokumente selbst.
     *
     */
    @POST
    @Path("/findObjects")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Dokumente, Ordner, Submission Sets und/oder Verknüpfungen in einem Aktenkonto finden", tags={ "documents, folders, submissionsets, associations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = FindObjectsResponseDTO.class) })
    public FindObjectsResponseDTO findObjects1(@Valid FindObjectsRequestDTO findObjectsRequestDTO);

    /**
     * Ersetzen eines Dokuments
     *
     * Diese Operation führt den Anwendungsfall \&quot;Ersetzen eines Dokumentes\&quot; in einer mit insurantId identifizierten Aktensession aus.
     *
     */
    @POST
    @Path("/replaceDocument")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Ersetzen eines Dokuments", tags={ "documents, folders, submissionsets, associations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO replaceDocument1(@Valid ReplaceDocumentRequestDTO replaceDocumentRequestDTO);

    /**
     * Dokumente aus Aktenkonto herunterladen
     *
     * Diese Operation führt den Anwendungsfall \&quot;Dokumente herunterladen\&quot; in einer mit insurantId identifizierten Aktensession aus. Lädt die Dokumente mit den im Request angegebenen Ids aus dem Aktenkonto. Die Ids werden mittels findDocuments ermittelt.
     *
     */
    @POST
    @Path("/retrieveDocuments")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Dokumente aus Aktenkonto herunterladen", tags={ "documents, folders, submissionsets, associations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = RetrieveDocumentsResponseDTO.class) })
    public RetrieveDocumentsResponseDTO retrieveDocuments1(@Valid DocumentsRequestDTO documentsRequestDTO);

    /**
     * Dokumente in ein Aktenkonto laden
     *
     * Diese Operation führt den Anwendungsfall \&quot;Dokumente einstellen\&quot; in einer mit insurantId identifizierten Aktensession aus.
     *
     */
    @POST
    @Path("/storeDocuments")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Dokumente in ein Aktenkonto laden", tags={ "documents, folders, submissionsets, associations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO storeDocuments1(@Valid StoreDocumentRequestDTO storeDocumentRequestDTO);

    /**
     * Aktualisierung der Informationen zu einem Dokument, Ordner des Nutzers oder einer Verknüpfung
     *
     * Diese Operation führt den Anwendungsfall \&quot;Änderung der Vertraulichkeit eines Dokumentes\&quot; in einer mit insurantId identifizierten Aktensession aus. Der Nutzer kann die ConfidentialityCode eines Dokumentes ändern.
     *
     */
    @POST
    @Path("/updateMetadata")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Aktualisierung der Informationen zu einem Dokument, Ordner des Nutzers oder einer Verknüpfung", tags={ "documents, folders, submissionsets, associations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = ResponseDTO.class) })
    public ResponseDTO updateMetadata1(@Valid UpdateMetadataRequestDTO updateMetadataRequestDTO);
}
