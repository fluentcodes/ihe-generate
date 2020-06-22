package org.fluentcodes.ihe.ebrs.metafields.tags;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.LocalizedStringType;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.util.List;

public class NameList extends Name<List<LocalizedStringType>> {
    public NameList(final RegistryObject parentRO) {
        super(parentRO);
    }

    public List<LocalizedStringType> get() {
        return super.getValues();
    }

    public void set(List<LocalizedStringType> values) {
        super.setValues(values);
    }
}
