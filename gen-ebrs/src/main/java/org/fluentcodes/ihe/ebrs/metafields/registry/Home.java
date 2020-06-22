package org.fluentcodes.ihe.ebrs.metafields.registry;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldAttribute;

public class Home extends MetaFieldAttribute {
    public Home(final RegistryObject parentRO) {
        super(parentRO);
    }

    public void setFromParentType(RegistryObjectType parentType) {
        this.set(parentType.getHome());
    }

    public void addToParentType(RegistryObjectType parentType) {
        parentType.setHome(get());
    }
}
