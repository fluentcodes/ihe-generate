package org.fluentcodes.ihe.ebrs.metafields.classifications;

import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.util.Optional;

public class ClassificationString extends ClassificationCommon<String> {
    public ClassificationString(RegistryObject parentObject) {
        super(parentObject);
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
