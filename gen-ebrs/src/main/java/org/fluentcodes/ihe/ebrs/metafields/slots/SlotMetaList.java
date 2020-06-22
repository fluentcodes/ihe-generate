package org.fluentcodes.ihe.ebrs.metafields.slots;

import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.util.List;

public class SlotMetaList extends SlotMetaCommon<List<String>> {
    public SlotMetaList(final String name) {
        super(name);
    }
    public SlotMetaList(final RegistryObject parentRO) {
        super(parentRO);
    }
    public List<String> get() {
        return getFirstValues();
    }
    public void set(List<String> values) {
        reset();
        add(new SlotWrapper(getIdentifier(), values));
    }
}
