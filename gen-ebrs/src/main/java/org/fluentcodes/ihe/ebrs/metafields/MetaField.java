package org.fluentcodes.ihe.ebrs.metafields;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;

public interface MetaField<RESULT> {
    RESULT get();
    void set(RESULT value);
    void addFromParentType(RegistryObjectType registryObjectType);
    void setFromParentType(RegistryObjectType registryObjectType);
    void addToParentType(RegistryObjectType registryObjectType);
}
