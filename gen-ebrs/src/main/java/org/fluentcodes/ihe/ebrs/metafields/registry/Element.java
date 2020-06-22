package org.fluentcodes.ihe.ebrs.metafields.registry;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.metafields.MetaField;

public interface Element< TYPE> {
    String getMetaIdentifier();
    boolean isStrict();

    RegistryObjectInterface getParentObject();
    boolean hasParentObject();

    void addFromParentType(RegistryObjectType parentType, MetaField meta);
    void addToParentType(RegistryObjectType parentType);
    TYPE createType();
}
