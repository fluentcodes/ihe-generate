package org.fluentcodes.ihe.ebrs.metafields.tags;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.EbXmlHelper;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public abstract class Description<RESULT> extends InternationalStringCommon<RESULT> {
    public Description(final RegistryObject parentRO) {
        super(parentRO);
    }

    public void addFromParentType(RegistryObjectType parentType) {
        super.addFromParentType(parentType.getDescription());
    }

    public void setFromParentType(RegistryObjectType parentType) {
        reset();
        addFromParentType(parentType);
    }

    public void addToParentType(RegistryObjectType parentRO) {
        if (isEmpty()) {
            return;
        }
        if (parentRO.getDescription() == null) {
            parentRO.setDescription(EbXmlHelper.OF_RIM.createInternationalStringType());
        }
        super.addToParentType(parentRO.getDescription());
    }

}
