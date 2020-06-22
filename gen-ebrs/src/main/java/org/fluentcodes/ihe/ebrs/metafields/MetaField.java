package org.fluentcodes.ihe.ebrs.metafields;

public interface MetaField<RESULT, PARENT, PARENT_TYPE> {
    RESULT get();
    void set(RESULT value);
    void addFromParentType(PARENT_TYPE parentType);
    void setFromParentType(PARENT_TYPE parentType);
    void addToParentType(PARENT_TYPE parentType);
    String getName();
    String getIdentifier();
    PARENT getParentObject();
}
