package org.fluentcodes.ihe.iti.metafields.registrypackages;

import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.ExternalIdentifierMetaCommon;
import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.ExternalIdentifierRO;

public class UniqueIdRO extends ExternalIdentifierRO {
    public static final String NAME = "XDSSubmissionSet.uniqueId";
    public UniqueIdRO() {
        super();
    }

    public UniqueIdRO(final String value, final ExternalIdentifierMetaCommon metaField) {
        super(value, metaField);
        super.setName(NAME);
        super.setId(NAME + "_" + metaField.getEntries().size());
    }
}

