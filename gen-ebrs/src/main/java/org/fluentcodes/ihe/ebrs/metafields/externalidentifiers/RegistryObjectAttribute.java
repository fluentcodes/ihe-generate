package org.fluentcodes.ihe.ebrs.metafields.externalidentifiers;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ExternalIdentifierType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldAttribute;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public class RegistryObjectAttribute extends MetaFieldAttribute {
    public RegistryObjectAttribute(final RegistryObject parentRO) {
        super( parentRO);
    }
    @Override
    public void addToParentType(RegistryObjectType parentType) {
        ((ExternalIdentifierType)parentType).setRegistryObject(get());
    }
    @Override
    public void setFromParentType(RegistryObjectType parentType) {
        super.set(((ExternalIdentifierType)parentType).getRegistryObject());
    }
}
