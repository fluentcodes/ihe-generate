package org.fluentcodes.ihe.ebrs.metafields.registry;

import org.fluentcodes.ihe.ebrs.metafields.MetaField;

public interface Element<PARENT_TYPE, TYPE> {
    String getMetaIdentifier();
    boolean isStrict();

    RegistryObjectInterface getParentObject();
    boolean hasParentObject();

    void addFromParentType(PARENT_TYPE parentType, MetaField meta);
    void addToParentType(PARENT_TYPE parentType);
    TYPE createType();
}
