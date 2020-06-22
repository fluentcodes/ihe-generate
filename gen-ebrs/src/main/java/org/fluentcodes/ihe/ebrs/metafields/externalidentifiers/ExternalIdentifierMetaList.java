package org.fluentcodes.ihe.ebrs.metafields.externalidentifiers;

import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.util.List;
import java.util.stream.Collectors;

public class ExternalIdentifierMetaList extends ExternalIdentifierMetaCommon<List<String>> {
    public ExternalIdentifierMetaList(final RegistryObject parentRO) {
        super(parentRO);
    }
    public ExternalIdentifierMetaList(final String identifier, final RegistryObject parentRO) {
        super(identifier, parentRO);
    }

    public List<String> get() {
        return getEntries().stream().map(x->x.getValue()).collect(Collectors.toList());
    }

    public void set(List<String> values) {
        for (String value: values) {
            add(value);
        }
    }
}
