package org.fluentcodes.ihe.iti.metafields.extrinsicobjects;

import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;
import org.fluentcodes.ihe.iti.metafields.classifications.CodeClassificationMetaString;

public class FormatCode extends CodeClassificationMetaString {
    public FormatCode(final RegistryObject parentRO) {
        super(parentRO);
    }

    public void set(final String value) {
        reset();
        super.add(new FormatCodeRO(value, this) );
    }
}
