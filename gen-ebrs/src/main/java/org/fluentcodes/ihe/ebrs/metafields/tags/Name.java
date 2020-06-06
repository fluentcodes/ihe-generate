package org.fluentcodes.ihe.ebrs.metafields.tags;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.LocalizedStringType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.IheHelper;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public abstract class Name<RESULT> extends InternationalStringCommon<RESULT> {
    public Name(RegistryObject parentObject) {
        super(parentObject);
    }

    public void addFromParentType(RegistryObjectType registryObject) {
        super.addFromParentType(registryObject.getName());
    }

    public void setFromParentType(RegistryObjectType parentObject) {
        reset();
        addFromParentType(parentObject);
    }

    public void addToParentType(RegistryObjectType parentObject) {
        if (isEmpty()) {
            return;
        }
        if (parentObject.getName() == null) {
            parentObject.setName(IheHelper.OF_RIM.createInternationalStringType());
        }
        addToParentType(parentObject.getName());
    }

}
