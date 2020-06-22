package org.fluentcodes.ihe.ebrs.metafields.tags;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.EbXmlHelper;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public abstract class Name<RESULT> extends InternationalStringCommon<RESULT> {
    public Name(final RegistryObject parentRO) {
        super(parentRO);
    }


    public void addFromParentType(RegistryObjectType parentType) {
        super.addFromParentType(parentType.getName());
    }

    public void setFromParentType(RegistryObjectType parentType) {
        reset();
        addFromParentType(parentType);
    }

    public void addToParentType(RegistryObjectType parentType) {
        if (isEmpty()) {
            return;
        }
        if (parentType.getName() == null) {
            parentType.setName(EbXmlHelper.OF_RIM.createInternationalStringType());
        }
        addToParentType(parentType.getName());
    }

}
