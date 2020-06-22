package org.fluentcodes.ihe.iti.metafields.classifications;

import org.fluentcodes.ihe.ebrs.metafields.classifications.ClassificationMetaString;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public abstract class CodeClassificationMetaString extends ClassificationMetaString {
    public CodeClassificationMetaString(final RegistryObject parentRO) {
        super(parentRO);
    }

    public String get() {
        if (isEmpty()) {
            return null;
        }
        return ((CodeClassificationRO)getFirst()).getHl7();
    }
}
