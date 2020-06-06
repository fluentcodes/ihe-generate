package org.fluentcodes.ihe.ebrs.metafields;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;

public interface MetaFieldNamed {
    String getIdentifier();
    void setIdentifier(final String identifier);
}
