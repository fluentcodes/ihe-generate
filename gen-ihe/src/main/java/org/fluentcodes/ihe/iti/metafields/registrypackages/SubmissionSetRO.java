package org.fluentcodes.ihe.iti.metafields.registrypackages;


import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryPackageType;
import org.fluentcodes.ihe.ebrs.metafields.MetaField;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;
import org.fluentcodes.ihe.ebrs.metafields.registrypackages.RegistryPackage;
import org.fluentcodes.ihe.ebrs.metafields.registrypackages.RegistryPackageRO;

import java.time.LocalDateTime;

public class SubmissionSetRO extends RegistryPackageRO {
    private static final String CONTENT_TYPE_CODE = "ContentTypeCode";
    private static final String PATIENT_ID = "XDSSubmissionSet.patientId";
    private static final String SUBMISSION_TIME = "submissionTime";
    private static final String UNIQUE_ID = "XDSSubmissionSet.uniqueId";
    public SubmissionSetRO() {
        super();
    }
    public SubmissionSetRO(final RegistryPackageType type, final RegistryObject parentRO) {
        super(type, parentRO);
    }

    public boolean isStrict() {
        return true;
    }

    public String getContentTypeCode() {
        return (String)getMetaFieldValue(CONTENT_TYPE_CODE);
    }

    public SubmissionSetRO setContentTypeCode(String code) {
        setMetaFieldValue(CONTENT_TYPE_CODE, code);
        return this;
    }

    public String getPatientId() {
        return (String) getMetaFieldValue(PATIENT_ID);
    }
    public SubmissionSetRO setPatientId(final String uniqueId) {
        setMetaFieldValue(PATIENT_ID, uniqueId);
        return this;
    }

    public LocalDateTime getSubmissionTime() {
        return (LocalDateTime) getMetaFieldValue(SUBMISSION_TIME);
    }

    public SubmissionSetRO setSubmissionTime(LocalDateTime submissionTime) {
        setMetaFieldValue(SUBMISSION_TIME, submissionTime);
        return this;
    }

    public String getUniqueId() {
        return (String) getMetaFieldValue(UNIQUE_ID);
    }
    public SubmissionSetRO setUniqueId(final String uniqueId) {
        setMetaFieldValue(UNIQUE_ID, uniqueId);
        return this;
    }
}
