package org.fluentcodes.ihe.iti.metafields.extrinsicobjects;

import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.ExternalIdentifierMetaCommon;
import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.ExternalIdentifierRO;

public class PatientIdRO extends ExternalIdentifierRO {
    public static final String NAME = "XDSDocumentEntry.patientId";
    public PatientIdRO() {
        super();
    }

    public PatientIdRO(final String value, final ExternalIdentifierMetaCommon metaField) {
        super(value, metaField);
        super.setName(NAME);
        super.setId(NAME + "_" + metaField.getEntries().size());
    }
}

