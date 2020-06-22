package org.fluentcodes.ihe.iti.metafields.extrinsicobjects;

import org.fluentcodes.ihe.ebrs.metafields.extrinsicobjects.ExtrinsicObjectRO;

import java.time.LocalDateTime;

public class DocumentEntryRO extends ExtrinsicObjectRO {
    private static final String CREATION_TIME = "creationTime";
    private static final String HASH = "hash";
    private static final String FORMAT_CODE = "FormatCode";
    private static final String PATIENT_ID = "XDSDocumentEntry.patientId";
    private static final String SERVICE_START_TIME = "serviceStartTime";
    private static final String SERVICE_STOP_TIME = "serviceStopTime";
    private static final String UNIQUE_ID = "XDSDocumentEntry.uniqueId";
    public DocumentEntryRO() {
        super();
    }
    public boolean isStrict() {
        return true;
    }

    public LocalDateTime getCreationTime() {
        return (LocalDateTime) getMetaFieldValue(CREATION_TIME);
    }

    public DocumentEntryRO setCreationTime(LocalDateTime serviceStopTime) {
        setMetaFieldValue(CREATION_TIME, serviceStopTime);
        return this;
    }


    public String getFormatCode() {
        return (String)getMetaFieldValue(FORMAT_CODE);
    }

    public DocumentEntryRO setFormatCode(String code) {
        setMetaFieldValue(FORMAT_CODE, code);
        return this;
    }

    public String getHash() {
        return (String)getMetaFieldValue(HASH);
    }

    public DocumentEntryRO setHash(String hash) {
        setMetaFieldValue(HASH, hash);
        return this;
    }

    public String getPatientId() {
        return (String) getMetaFieldValue(PATIENT_ID);
    }
    public DocumentEntryRO setPatientId(final String uniqueId) {
        setMetaFieldValue(PATIENT_ID, uniqueId);
        return this;
    }

    public LocalDateTime getServiceStartTime() {
        return (LocalDateTime) getMetaFieldValue(SERVICE_START_TIME);
    }

    public DocumentEntryRO setServiceStartTime(LocalDateTime serviceStartTime) {
        setMetaFieldValue(SERVICE_START_TIME, serviceStartTime);
        return this;
    }

    public LocalDateTime getServiceStopTime() {
        return (LocalDateTime) getMetaFieldValue(SERVICE_STOP_TIME);
    }

    public DocumentEntryRO setServiceStopTime(LocalDateTime serviceStopTime) {
        setMetaFieldValue(SERVICE_STOP_TIME, serviceStopTime);
        return this;
    }

    public String getUniqueId() {
        return (String) getMetaFieldValue(UNIQUE_ID);
    }
    public DocumentEntryRO setUniqueId(final String uniqueId) {
        setMetaFieldValue(UNIQUE_ID, uniqueId);
        return this;
    }
}
