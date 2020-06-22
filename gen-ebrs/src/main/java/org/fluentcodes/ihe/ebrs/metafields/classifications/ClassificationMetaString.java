package org.fluentcodes.ihe.ebrs.metafields.classifications;

import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.util.Optional;

public class ClassificationMetaString extends ClassificationMetaCommon<String> {

    public ClassificationMetaString(final RegistryObject parentRO) {
        super(parentRO);
    }
    public String get() {
        Optional<String> value = getEntries().stream().map(x->x.getNodeRepresentation()).findFirst();
        if (value.isPresent()) {
            return value.get();
        }
        return null;
    }
    public void set(final String value) {
        reset();
        add(value);
    }


}
