package org.fluentcodes.ihe.ebrs.metafields.classifications;

import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.util.List;
import java.util.stream.Collectors;

public class ClassificationMetaList extends ClassificationMetaCommon<List<String>> {
    public ClassificationMetaList(RegistryObject parentRO) {
        super(parentRO);
    }
    public ClassificationMetaList(final String identifier, final RegistryObject parentRO) {
        super(identifier, parentRO);
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
