package org.fluentcodes.ihe.ebrs.metafields.externalidentifiers;

import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class ExternalIdentifierMetaString extends ExternalIdentifierMetaCommon<String> {
    List<ExternalIdentifierRO> list = new ArrayList<>();
    public ExternalIdentifierMetaString(final RegistryObject parentRO) {
        super(parentRO);
    }
    public ExternalIdentifierMetaString(final String identifier, final RegistryObject parentRO) {
        super(identifier, parentRO);
    }

    public String get() {
        return getFirstValue();
    }

    public void set(String value) {
        reset();
        add(value);
    }
}
