package org.fluentcodes.ihe.ebrs.metafields.registry;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldAttribute;

public class ID extends MetaFieldAttribute {
    public ID(final RegistryObject parentRO) {
        super(parentRO);
    }

    public void setFromParentType(RegistryObjectType parentType) {
        this.set(parentType.getId());
    }

    public void addToParentType(RegistryObjectType parentType) {
        parentType.setId(get());
    }
}
