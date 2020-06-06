package org.fluentcodes.ihe.ebrs.metafields.slots;

import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.util.List;

public class SlotString extends SlotCommon<String> {
    public SlotString(RegistryObject parentObject) {
        super(parentObject);
    }
    public String get() {
        return getFirst().getValues().get(0);
    }
    public void set(String value) {
        reset();
        add(new SlotWrapper(getIdentifier(),value));
    }
}
