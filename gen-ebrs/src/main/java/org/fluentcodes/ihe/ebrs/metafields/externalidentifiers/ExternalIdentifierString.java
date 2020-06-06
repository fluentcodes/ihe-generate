package org.fluentcodes.ihe.ebrs.metafields.externalidentifiers;

import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class ExternalIdentifierString extends ExternalIdentifierCommon<String> {
    List<ExternalIdentifierWrapper> list = new ArrayList<>();
    public ExternalIdentifierString(RegistryObject parentObject) {
        super(parentObject);
    }

    public String get() {
        return getFirst().getValue();
    }

    public void set(String value) {
        reset();
        add(value);
    }
}
