package org.fluentcodes.ihe.ebrs.metafields.registry;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldAttribute;

public class ObjectType extends MetaFieldAttribute {
    public ObjectType(final RegistryObject parentRO) {
        super(parentRO);
    }

    public void setFromParentType(RegistryObjectType parentType) {
        this.set(parentType.getObjectType());
    }

    public void addToParentType(RegistryObjectType parentType) {
        parentType.setObjectType(get());
    }
}
