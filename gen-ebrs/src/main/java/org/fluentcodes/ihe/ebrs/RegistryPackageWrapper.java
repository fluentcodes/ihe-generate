package org.fluentcodes.ihe.ebrs;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryPackageType;

public class RegistryPackageWrapper extends RegistryObject {
    public RegistryPackageWrapper() {
        super();
    }
    public RegistryPackageWrapper(final oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryPackageType type) {
        super(type);

    }

    public oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryPackageType createType() {
        oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryPackageType registryPackageType = IheHelper.OF_RIM.createRegistryPackageType();
        super.addType(registryPackageType);
        return registryPackageType;
    }
}
