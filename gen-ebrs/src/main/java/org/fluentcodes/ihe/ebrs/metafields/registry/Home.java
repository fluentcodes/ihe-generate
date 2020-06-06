package org.fluentcodes.ihe.ebrs.metafields.registry;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldAttribute;

public class Home extends MetaFieldAttribute {
    public Home(RegistryObject parentObject) {
        super(parentObject);
    }

    public void setFromParentType(RegistryObjectType registryObject) {
        this.set(registryObject.getHome());
    }

    public void addToParentType(RegistryObjectType parentType) {
        parentType.setHome(get());
    }
}
