package org.fluentcodes.ihe.ebrs.metafields.registry;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldAttribute;

public class LID extends MetaFieldAttribute {
    public LID(RegistryObject parentObject) {
        super(parentObject);
    }

    public void setFromParentType(RegistryObjectType registryObject) {
        this.set(registryObject.getLid());
    }

    public void addToParentType(RegistryObjectType parentType) {
        parentType.setLid(get());
    }
}
