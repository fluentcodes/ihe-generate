package org.fluentcodes.ihe.ebrs.metafields.classifications;

import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.util.List;
import java.util.stream.Collectors;

public class Classification extends ClassificationCommon<List<String>> {
    public Classification (RegistryObject parentObject) {
        super(parentObject);
    }

    public List<String> get() {
        return getEntries().stream().map(x->x.getNodeRepresentation()).collect(Collectors.toList());
    }
    public void set(List<String> values) {
        reset();
        for (String value: values) {
            add(value);
        }
    }
}
