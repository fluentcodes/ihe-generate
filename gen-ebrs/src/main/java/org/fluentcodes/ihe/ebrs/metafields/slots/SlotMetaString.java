package org.fluentcodes.ihe.ebrs.metafields.slots;

import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public class SlotMetaString extends SlotMetaCommon<String> {
    public SlotMetaString(final RegistryObject parentRO) {
        super(parentRO);
    }
    public String get() {
        return getFirstValue();
    }
    public void set(String value) {
        reset();
        add(new SlotWrapper(getIdentifier(),value));
    }
}
