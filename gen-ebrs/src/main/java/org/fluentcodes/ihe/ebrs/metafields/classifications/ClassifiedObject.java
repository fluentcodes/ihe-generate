package org.fluentcodes.ihe.ebrs.metafields.classifications;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ClassificationType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldAttribute;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public class ClassifiedObject extends MetaFieldAttribute {
    public ClassifiedObject(final RegistryObject parentRO) {
        super(parentRO);
    }
    @Override
    public void addToParentType(RegistryObjectType parentType) {
        ((ClassificationType)parentType).setClassifiedObject(get());
    }
    @Override
    public void setFromParentType(RegistryObjectType parentType) {
        super.set(((ClassificationType)parentType).getClassifiedObject());
    }

}
