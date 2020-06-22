package org.fluentcodes.ihe.ebrs.metafields.tags;

import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public class DescriptionString extends Description<String> {
    public DescriptionString(final RegistryObject parentRO) {
        super(parentRO);
    }

    public String get() {
        return getFirst().getValues().getValue();
    }
    public void set(final String value) {
        reset();
        add(new LocalizedStringWrapper(value));
    }
}
