package org.fluentcodes.ihe.ebrs.metafields.externalidentifiers;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ExternalIdentifierType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.IheException;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExternalIdentifier extends ExternalIdentifierCommon<List<String>> {
    List<ExternalIdentifierWrapper> list = new ArrayList<>();
    public ExternalIdentifier (RegistryObject parentObject) {
        super(parentObject);
    }

    public List<String> get() {
        return list.stream().map(x->x.getValue()).collect(Collectors.toList());
    }

    public void set(List<String> values) {
        for (String value: values) {
            add(value);
        }
    }
}
