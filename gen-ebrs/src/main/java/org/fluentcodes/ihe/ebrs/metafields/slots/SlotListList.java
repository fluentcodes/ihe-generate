package org.fluentcodes.ihe.ebrs.metafields.slots;

import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class SlotListList extends SlotCommon<List<List<String>>> {
    public SlotListList(RegistryObject parentObject) {
        super(parentObject);
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
