package org.fluentcodes.ihe.iti.metafields.registrypackages;

import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;
import org.fluentcodes.ihe.iti.metafields.classifications.CodeClassificationMetaString;

public class ContentTypeCode extends CodeClassificationMetaString {
    public ContentTypeCode(final RegistryObject parentRO) {
        super(parentRO);
    }

    public void set(final String value) {
        reset();
        super.add(new ContentTypeCodeRO(value, this) );
    }
}
