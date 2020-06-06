package org.fluentcodes.ihe.ebrs.metafields.externalidentifiers;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ExternalIdentifierType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldAttribute;

public class Value extends MetaFieldAttribute {
    public Value(RegistryObject parentObject) {
        super(parentObject);
    }
    @Override
    public void addToParentType(RegistryObjectType parentType) {
        ((ExternalIdentifierType)parentType).setValue(get());
    }
    @Override
    public void setFromParentType(RegistryObjectType registryObject) {
        super.set(((ExternalIdentifierType)registryObject).getValue());
    }
}
