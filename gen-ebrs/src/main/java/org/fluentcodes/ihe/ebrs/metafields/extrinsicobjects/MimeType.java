package org.fluentcodes.ihe.ebrs.metafields.extrinsicobjects;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ExtrinsicObjectType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldAttribute;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public class MimeType extends MetaFieldAttribute {
    public MimeType(final RegistryObject parentObject) {
        super(parentObject);
    }
    @Override
    public void addToParentType(RegistryObjectType parentType) {
        ((ExtrinsicObjectType)parentType).setMimeType(get());
    }
    @Override
    public void setFromParentType(RegistryObjectType parentType) {
        super.set(((ExtrinsicObjectType)parentType).getMimeType());
    }

}
