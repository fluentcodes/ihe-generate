package org.fluentcodes.ihe.iti;

public enum MetaFields {

    //https://gazelle.ihe.net/XDStarClient/docum/templates/templateDescriptor.seam;jsessionid=wgLxoY-N9nTnLw5XNu4R48xU?templateId=urn%3Auuid%3Aa7058bb9-b4e4-4307-ba5b-e3f0ab85e12d&pack=rimihe

    /*ID("id", IheDocument.class, SubmissionSet.class, CodeClassification.class, ClassificationWrapper.class, Author.class, ExternalIdentifierWrapper.class, AssociationWrapper.class ),
    LID("lid", IheDocument.class, SubmissionSet.class),
    HOME("home", IheDocument.class, SubmissionSet.class, ExternalIdentifierWrapper.class),
    STATUS("status", IheDocument.class, SubmissionSet.class),
    NAME("Name", ExternalIdentifierWrapper.class, CodeClassification.class),
    DESCRIPTION("Description",  ExternalIdentifierWrapper.class, ClassificationWrapper.class, Author.class, CodeClassification.class),
    OBJECT_TYPE("objecttype", IheDocument.class, ClassificationWrapper.class, CodeClassification.class, Author.class, SubmissionSet.class, ExternalIdentifierWrapper.class),

    // submissionSet
    S_AUTHOR("urn:uuid:a7058bb9-b4e4-4307-ba5b-e3f0ab85e12d", "author", SubmissionSet.class),
    CONTENT_TYPE("urn:uuid:aa543740-bdda-424e-8c96-df4873be8500", "contentType", SubmissionSet.class),
    INTENDED_RECIPIENT("intendedRecipient", SubmissionSet.class),
    SUBMISSION_TIME ("submissionTime", SubmissionSet.class),
    SUBMISSION_SET("urn:uuid:a54d6aa5-d40d-43f9-88c5-b4633d873bdd", SubmissionSet.class),
    SOURCE_ID("urn:uuid:554ac39e-e3fe-47fe-b233-965d2a147832", "sourceId", SubmissionSet.class),
    S_PATIENT_ID("urn:uuid:6b5aea1a-874d-4603-a4bc-96a0a7b38446", "patientId", SubmissionSet.class),
    S_UNIQUE_ID("urn:uuid:96fdda7c-d067-4183-912e-bf5ee74998a8", "uniqueId", SubmissionSet.class),

    // associations
    SOURCE_OBJECT("sourceObject", AssociationWrapper.class),
    TARGET_OBJECT("targetObject", AssociationWrapper.class),
    ASSOCIATION_TYPE("associationType", AssociationWrapper.class),
    SUBMISSION_SET_STATUS("SubmissionSetStatus", AssociationWrapper.class),
    PREVIOUS_VERSION("PreviousVersionSlot", AssociationWrapper.class),
    ASSOCIATION_PROPAGATION("AssociationWrapperPropagationSlot", AssociationWrapper.class),

    // externalidentifier
    IDENTIFICATION_SCHEME("identificationScheme", ExternalIdentifierWrapper.class),
    VALUE("value", ExternalIdentifierWrapper.class),
    REGISTRY_OBJECT("registryObject", ExternalIdentifierWrapper.class),

    // classification
    CLASSIFIED_OBJECT("classifiedObject", ClassificationWrapper.class, CodeClassification.class, Author.class),
    CLASSIFICATION_SCHEME("classificationScheme", ClassificationWrapper.class, CodeClassification.class, Author.class),
    CLASSIFICATION_NODE("classificationNode", ClassificationWrapper.class, CodeClassification.class, Author.class),
    NODE_REPRESENTATION("nodeRepresentation", ClassificationWrapper.class, CodeClassification.class, Author.class),
    // codeClassification
    CODING_SCHEME ("codingScheme", CodeClassification.class),

    // author
    AUTHOR_ROLE("authorRole", Author.class),
    AUTHOR_SPECIALTY("authorSpecialty", Author.class),
    AUTHOR_INSTITUTION("authorInstitution", Author.class),
    AUTHOR_TELECOMMUNICATION("authorTelecommunication", Author.class),
    AUTHOR_PERSON("authorPerson", Author.class) ,

    //documents
    //attributes
    MIME_TYPE("mimetype", IheDocument.class),
    //classifications
    CLASS_CODE("urn:uuid:41a5887f-8865-4c09-adf7-e362475b143a", IheDocument.class),
    CONVIDENTIALITY_CODE("urn:uuid:f4f85eac-e6cb-4883-b524-f2705394840f", IheDocument.class),
    EVENT_CODE_LIST("urn:uuid:2c6b8cb7-8b2a-4051-b291-b1ae6a575ef4", IheDocument.class),
    FORMAT_CODE("urn:uuid:a09d5840-386c-46f2-b5ad-9c3699a4309d", IheDocument.class),
    HEALTHCARE_FACILITY_TYPE_CODE("urn:uuid:f33fb8ac-18af-42cc-ae0e-ed0b0bdb91e1", IheDocument.class),
    PRACTICE_SETTING_CODE("urn:uuid:cccf5598-8b07-4b77-a05e-ae952c785ead", IheDocument.class),
    TYPE_CODE("urn:uuid:f0306f51-975f-434e-a61c-c59651d33983", IheDocument.class),
    D_AUTHOR("urn:uuid:93606bcf-9494-43ec-9b4e-a7748d1a838d", IheDocument.class),
    LIMITED_META_DATA("urn:uuid:5003a9db-8d8d-49e6-bf0c-990e34ac7707", IheDocument.class, SubmissionSet.class),
    //slots
    CREATION_TIME("creationTime", IheDocument.class),
    HASH("hash", IheDocument.class),
    LANGUAGE_CODE ("languageCode", IheDocument.class),
    LEGAL_AUTHENTICATOR ("legalAuthenticator", IheDocument.class),
    REPOSITORY_UNIQUE_ID ("repositoryUniqueId", IheDocument.class),
    REFERENCE_ID_LIST("urn:ihe:iti:xds:2013:referenceIdList", IheDocument.class),
    SIZE("size", IheDocument.class),

    SOURCE_PATIENT_ID ("sourcePatientId", IheDocument.class),
    SOURCE_PATIENT_INFO ("sourcePatientInfo", IheDocument.class),
    URI ("URI", IheDocument.class),
    // externals
    D_PATIENT_ID("urn:uuid:58a6f841-87b3-4a3e-92fd-a8ffeff98427", IheDocument.class),
    D_UNIQUE_ID("urn:uuid:2e82c1f6-a085-4c72-9da3-8640a32e42ab", IheDocument.class),

    // adhocquery
    X_ID("id", AdhocQuery.class),
    //slot
    XS_AUTHOR_PERSON("$XDSSubmissionSetAuthorPerson", AdhocQuery.class),
    XS_TIME_FROM("$XDSSubmissionSetSubmissionTimeFrom", AdhocQuery.class),
    XS_TIME_TO("$XDSSubmissionSetSubmissionTimeTo", AdhocQuery.class),
    XS_ID("$XDSSubmissionSetEntryUUID", AdhocQuery.class),
    XS_UNIQUE_ID("$XDSSubmissionSetUniqueId", AdhocQuery.class),
    XS_STATUS("$XDSSubmissionSetStatus", AdhocQuery.class),
    XS_PATIENT_ID("$XDSSubmissionSetPatientId", AdhocQuery.class),

    XD_AUTHOR_PERSON("$XDSDocumentEntryAuthorPerson", AdhocQuery.class),
    XD_AUTHOR_INSTITUTION("$XDSDocumentEntryAuthorInstitution", AdhocQuery.class),
    XD_CLASS_CODE("$XDSDocumentEntryClassCode", AdhocQuery.class),
    XD_CONFIDENTIALITY_CODE ("$XDSDocumentEntryConfidentialityCode", AdhocQuery.class),
    XD_CREATION_TIME_FROM ("$XDSDocumentEntryCreationTimeFrom", AdhocQuery.class),
    XD_CREATION_TIME_TO ("$XDSDocumentEntryCreationTimeTo", AdhocQuery.class),
    //$XDSDocumentEntryEntryType (),
    XD_UNIQUE_ID("$XDSDocumentEntryUniqueId", AdhocQuery.class),
    XD_EVENT_CODE_LIST ("$XDSDocumentEntryEventCodeList", AdhocQuery.class),
    XD_FORMAT_CODE("$XDSDocumentEntryFormatCode", AdhocQuery.class),
    XD_HEALTHCARE_FACILITY_TYPE_CODE ("$XDSDocumentEntryHealthcareFacilityTypeCode", AdhocQuery.class),
    XD_PATIENT_ID ("$XDSDocumentEntryPatientId", AdhocQuery.class),
    XD_PRACTICE_SETTING_CODE("$XDSDocumentEntryPracticeSettingCode", AdhocQuery.class),
    XD_REFERENCE_ID("$XDSDocumentEntryReferenceIdList", AdhocQuery.class),
    XD_STATUS("$XDSDocumentEntryStatus", AdhocQuery.class),
    SERVICE_START_TIME("serviceStartTime", IheDocument.class),
    XD_SERVICE_START_TIME_FROM ("$XDSDocumentEntryServiceStartTimeFrom", AdhocQuery.class),
    XD_SERVICE_START_TIME_TO  ("$XDSDocumentEntryServiceStartTimeTo", AdhocQuery.class),
    SERVICE_STOP_TIME("serviceStopTime", IheDocument.class),
    XD_SERVICE_STOP_TIME_FROM ("$XDSDocumentEntryServiceStopTimeFrom", AdhocQuery.class),
    XD_SERVICE_STOP_TIME_TO ("$XDSDocumentEntryServiceStopTimeTo", AdhocQuery.class),
    XD_TITLE("$XDSDocumentEntryTitle", AdhocQuery.class),
    XD_TYPE_CODE("$XDSDocumentEntryTypeCode", AdhocQuery.class),
    XD_ID("$XDSDocumentEntryEntryUUID", AdhocQuery.class);

    private final String key;
    private final String name;
    private final Class<? extends RegistryObject> [] registryClasses;

    MetaFields(final String key, final Class<? extends RegistryObject>... registryClasses) {
        this.key = key;
        this.name = key;
        this.registryClasses = registryClasses;
    }
    MetaFields(final String key, final String name, final Class<? extends RegistryObject>... registryClasses) {
        this.key = key;
        this.name = key;
        this.registryClasses = registryClasses;
    }

    public String getKey() {
        return key;
    }
    public String getName() {
        return name;
    }
    */

}
