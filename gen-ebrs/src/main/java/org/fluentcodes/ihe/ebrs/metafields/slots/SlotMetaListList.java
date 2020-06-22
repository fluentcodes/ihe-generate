package org.fluentcodes.ihe.ebrs.metafields.slots;

import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class SlotMetaListList extends SlotMetaCommon<List<List<String>>> {
    public SlotMetaListList(final String identifier, final RegistryObject parentRO) {
        super(identifier, parentRO);
    }
    public SlotMetaListList(final RegistryObject parentRO) {
        super(parentRO);
    }

    public List<List<String>> get() {
        List<List<String>> result = new ArrayList<>();
        for (SlotWrapper entry: getEntries()) {
            result.add(entry.getValues());
        }
        return result;
    }

    public void set(List<List<String>> values) {
        reset();
        for (List<String> value: values) {
            add(new SlotWrapper(getIdentifier(), value));
        }
    }
}
