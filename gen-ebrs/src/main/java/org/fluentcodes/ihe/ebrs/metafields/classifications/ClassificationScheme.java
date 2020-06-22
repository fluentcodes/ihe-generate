package org.fluentcodes.ihe.ebrs.metafields.classifications;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ClassificationType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldAttribute;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public class ClassificationScheme extends MetaFieldAttribute {
    public ClassificationScheme(final RegistryObject parentRO) {
        super(parentRO);
    }
    @Override
    public void setFromParentType(RegistryObjectType parentType) {
        super.set(((ClassificationType)parentType).getClassificationScheme());
    }
    @Override
    public void addToParentType(RegistryObjectType parentType) {
        ((ClassificationType)parentType).setClassificationScheme(get());
    }
}
