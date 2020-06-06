package org.fluentcodes.ihe.ebrs.metafields.registry;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldAttribute;

public class ObjectType extends MetaFieldAttribute {
    public ObjectType(RegistryObject parentObject) {
        super(parentObject);
    }

    public void setFromParentType(RegistryObjectType registryObject) {
        this.set(registryObject.getObjectType());
    }

    public void addToParentType(RegistryObjectType parentType) {
        parentType.setObjectType(get());
    }
}
