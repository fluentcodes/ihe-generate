package org.fluentcodes.ihe.ebrs.metafields.registry;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldAttribute;

public class Status extends MetaFieldAttribute {
    public Status(RegistryObject parentObject) {
        super(parentObject);
    }

    public void setFromParentType(RegistryObjectType registryObject) {
        this.set(registryObject.getStatus());
    }

    public void addToParentType(RegistryObjectType parentType) {
        parentType.setStatus(get());
    }
}
