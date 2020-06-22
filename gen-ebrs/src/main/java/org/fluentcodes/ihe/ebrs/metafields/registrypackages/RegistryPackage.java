package org.fluentcodes.ihe.ebrs.metafields.registrypackages;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ExtrinsicObjectType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryPackageType;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldContainerList;
import org.fluentcodes.ihe.ebrs.metafields.RegistryRequestWrapper;
import org.fluentcodes.ihe.ebrs.metafields.extrinsicobjects.ExtrinsicObjectRO;

public class RegistryPackage extends MetaFieldContainerList<RegistryPackageRO, RegistryPackageType> {
    public RegistryPackage() {
        super();
    }
    public RegistryPackage(final RegistryRequestWrapper parentObject) {
        super(parentObject);
    }
}
