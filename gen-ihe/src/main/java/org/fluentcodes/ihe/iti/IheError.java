package org.fluentcodes.ihe.iti;

import org.fluentcodes.ihe.ebrs.metafields.ErrorListWrapper;

import java.util.Arrays;
import java.util.List;

public class IheError extends ErrorListWrapper {
    /**
     * Table 4.2.4.1-2: Error Codes (previously Table 4.1-11) IHE_ITI_TF_VOL3
     */
    public enum CODE {
        PartialReplaceContentNotProcessed("An XDR Document Recipient did not process some part of the content. Specifically the parts not processed are Replacement semantics","P"),
        PartialTransformNotProcessed("An XDR Document Recipient did not process some part of the content. Specifically the parts not processed are Transform semantics","P"),
        PartialTransformReplaceNotProcessed("An XDR Document Recipient did not process some part of the content. Specifically the parts not processed are Transform and Replace semantics","P"),
        UnresolvedReferenceException("The recipient cannot resolve an entryUUID reference in the transaction.", "P", "R"),
        XDSDocumentUniqueIdError("The document associated with the uniqueId is not available. This could be because the document is not available, the requestor is not authorized to access that document or the document is no longer available.","RS","XGR"),
        XDSDuplicateUniqueIdInRegistry("UniqueId received was not unique. UniqueId could have been attached to SubmissionSet or Folder. codeContext shall indicate which and the value of the non-unique uniqueId. This error cannot be thrown for DocumentEntry. See XDSNonIdenticalHash and XDSNonIdenticalSize.","P", "R"),
        XDSExtraMetadataNotSaved("This warning is returned if extra metadata was present but not saved.","P", "R"),
        XDSMissingDocument("DocumentEntry exists in metadata with no corresponding attached document","P"),
        MaxDocSizeExceeded("Document Size is too big","P"),
        MaxPkgSizeExceeded("Document size in submissionSet is too big","P"),
        XDSMissingDocumentMetadata("MIME package contains MIME part with Content-Id header not found in metadata","P"),
        XDSMissingHomeCommunityId("A value for the homeCommunityId is required and has not been specified","SQ", "XGQ", "RS","XGR"),
        XDSNonIdenticalHash("Document being registered was a duplicate (uniqueId already in Document Registry) but hash does not match. The codeContext shall indicate uniqueId.","R"),
        XDSNonIdenticalSize("Document being registered was a duplicate (uniqueId already in Document Registry) but size does not match. The codeContextshall indicate uniqueId.","R"),
        XDSPatientIdDoesNotMatch("This error is thrown when the patient Id is required to match and does not. The codeContext shall indicate the value of the Patient Id and the nature of the conflict.","P","R"),
        XDSRegistryBusy("XDSRegistryBusy","P","R","SQ","XGQ"),
        XDSRepositoryBusy("Too much activity","P", "RS", "XGR"),
        XDSRegistryDeprecatedDocumentError("The transaction was rejected because it submitted an Association referencing a deprecated document.","P","R"),
        XDSRegistryDuplicateUniqueIdInMessage("A uniqueId value was found to be used more than once within the submission. The errorCode indicates where the error was detected. The codeContext shall indicate the duplicate uniqueId.","P","R"),
        XDSRepositoryDuplicateUniqueIdInMessage("A uniqueId value was found to be used more than once within the submission. The errorCode indicates where the error was detected. The codeContext shall indicate the duplicate uniqueId.","P","R"),
        XDSRegistryError("Internal Error The error codes XDSRegistryError or XDSRepositoryError shall be returned if and only if a more detailed code is not available from this table for the condition being reported. If one of these error codes is returned, the attribute codeContext shall contain details of the error condition that may be implementation-specific.","P", "R", "SQ", "XGQ"),
        XDSRepositoryError("Internal Error The error codes XDSRegistryError or XDSRepositoryError shall be returned if and only if a more detailed code is not available from this table for the condition being reported. If one of these error codes is returned, the attribute codeContext shall contain details of the error condition that may be implementation-specific.", "P", "RS", "XGR"),
        XDSRegistryMetadataError("Error detected in metadata. Actor name indicates where error was detected. (Document Recipient uses Repository error). codeContext indicates nature of problem.","P", "R"),
        XDSRepositoryMetadataError("Error detected in metadata. Actor name indicates where error was detected. (Document Recipient uses Repository error). codeContext indicates nature of problem.","P", "R"),
        XDSRegistryNotAvailable(" Repository was unable to access the Registry P"),
        XDSRegistryOutOfResources("Resources are low. ","P", "R", "SQ", "XGQ"),
        XDSRepositoryOutOfResources("Resources are low. ","P", "RS", "XGR"),
        XDSReplaceFailed("Note: This error code is deprecated. See ITI TF-2b: 3.42.4.1.3.5. Error detected by the Document Registry during a document replacement.","P", "R"),
        XDSResultNotSinglePatient(" This error signals that a single request would have returned content for multiple Patient Ids", "SQ", "RS", "XGQ", "XGR"),
        XDSStoredQueryMissingParam(" A required parameter to a stored query is missing. ","SQ", "XGQ"),
        XDSStoredQueryParamNumber(" A parameter which only accepts a single value is coded with multiple values","SQ", "XGQ"),
        XDSTooManyResults(" Query resulted in too many results. ","SQ", "XGQ"),
        XDSUnavailableCommunity(" A community which would have been contacted was not available. See Note 2.","SQ", "RS"),
        XDSUnknownCommunity(" A value for the homeCommunityId is not recognized", "SQ", "XGQ", "RS", "XGR"),
        XDSUnknownPatientId ("Patient Id referenced in metadata is not known by the receiving actor. The codeContext shall include the value of patient Id in question. *Note: This error code is not used in the response to RegistryStored Query [IIT-18].","P", "R", "XGQ"),
        XDSUnknownRepositoryId(" The repositoryUniqueId value could not be resolved to a valid document repository or the value does not match the repositoryUniqueId. ","RS", "XGR"),
        XDSUnknownStoredQuery("XDSUnknownStoredQuery The Query Id provided in the request is not recognized. ","SQ", "XGQ");
        private String description;
        public List<String> transactions;
        CODE(final String description, final String... transactions) {
            this.description = description;
            this.transactions = Arrays.asList(transactions);
        }
    }

    public enum TRANSACTION {
        P("Provide and Register-b"),
        R("Retrieve"),
        SQ("Stored Query"),
        RS("Retrieve Document Set"),
        XGQ("Cross Gateway Query"),
        XGR("Cross Gateway Retrieve");
        String description;
        TRANSACTION(final String description) {
            this.description = description;
        }
    }
}
