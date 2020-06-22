package org.fluentcodes.ihe.ebrs.metafields.extrinsicobjects;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ExtrinsicObjectType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectListType;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldContainerList;
import org.fluentcodes.ihe.ebrs.metafields.RegistryRequestWrapper;

public class ExtrinsicObject extends MetaFieldContainerList<ExtrinsicObjectRO, ExtrinsicObjectType> {
    public ExtrinsicObject() {
        super();
    }
    public ExtrinsicObject(final RegistryRequestWrapper parentObject) {
        super(parentObject);
    }
}
