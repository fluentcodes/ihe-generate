package org.fluentcodes.ihe.ebrs.metafields.classifications;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ClassificationType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldAttribute;

public class NodeRepresentation extends MetaFieldAttribute {
    public NodeRepresentation(RegistryObject parentObject) {
        super(parentObject);
    }
    @Override
    public void addToParentType(RegistryObjectType parentType) {
        ((ClassificationType)parentType).setNodeRepresentation(get());
    }
    @Override
    public void setFromParentType(RegistryObjectType registryObject) {
        super.set(((ClassificationType)registryObject).getNodeRepresentation());
    }

}
