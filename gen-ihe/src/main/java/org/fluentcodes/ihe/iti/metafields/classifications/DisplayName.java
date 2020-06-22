package org.fluentcodes.ihe.iti.metafields.classifications;

import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;
import org.fluentcodes.ihe.ebrs.metafields.tags.LocalizedStringWrapper;
import org.fluentcodes.ihe.ebrs.metafields.tags.Name;

public class DisplayName extends Name<String> {
    public DisplayName(final RegistryObject parent) {
        super(parent);
    }
    public String get() {
        return getFirst().getValues().getValue();
    }
    public void set(final String value) {
        reset();
        add(new LocalizedStringWrapper(value));
    }
}
