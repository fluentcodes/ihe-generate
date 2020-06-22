package org.fluentcodes.ihe.ebrs.metafields.externalidentifiers;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ExternalIdentifierType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldAttribute;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public class Value extends MetaFieldAttribute {
    public Value(final RegistryObject parentRO) {
        super(parentRO);
    }
    @Override
    public void addToParentType(RegistryObjectType parentType) {
        ((ExternalIdentifierType)parentType).setValue(get());
    }
    @Override
    public void setFromParentType(RegistryObjectType registryType) {
        super.set(((ExternalIdentifierType)registryType).getValue());
    }
}
