package org.fluentcodes.ihe.ebrs.metafields.registrypackage;

import org.fluentcodes.ihe.ebrs.IheHelper;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public class RegistryPackageWrapper extends RegistryObject {
    public RegistryPackageWrapper() {
        super();
    }
    public RegistryPackageWrapper(final oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryPackageType type) {
        super(type);

    }

    public oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryPackageType createType() {
        oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryPackageType registryPackageType = IheHelper.OF_RIM.createRegistryPackageType();
        super.addToParentType(registryPackageType);
        return registryPackageType;
    }
}
