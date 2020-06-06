package org.fluentcodes.ihe.ebrs.metafields.classifications;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ClassificationType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldAttribute;

public class ClassifiedObject extends MetaFieldAttribute {
    public ClassifiedObject(RegistryObject parentObject) {
        super(parentObject);
    }
    @Override
    public void addToParentType(RegistryObjectType parentType) {
        ((ClassificationType)parentType).setClassifiedObject(get());
    }
    @Override
    public void setFromParentType(RegistryObjectType registryObject) {
        super.set(((ClassificationType)registryObject).getClassifiedObject());
    }

}
