package org.fluentcodes.ihe.ebrs.metafields.registry;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldAttribute;

public class Status extends MetaFieldAttribute {
    public Status( final RegistryObject parentRO) {
        super(parentRO);
    }

    public void setFromParentType(RegistryObjectType parentType) {
        this.set(parentType.getStatus());
    }

    public void addToParentType(RegistryObjectType parentType) {
        parentType.setStatus(get());
    }
}
