package org.fluentcodes.ihe.ebrs.metafields.slots;

import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.util.List;

public class SlotList extends SlotCommon<List<String>> {
    public SlotList (RegistryObject parentObject) {
        super(parentObject);
    }
    public List<String> get() {
        return getFirst().getValues();
    }
    public void set(List<String> values) {
        reset();
        add(new SlotWrapper(getIdentifier(), values));
    }
}
