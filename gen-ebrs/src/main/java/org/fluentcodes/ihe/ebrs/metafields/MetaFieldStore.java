package org.fluentcodes.ihe.ebrs.metafields;

public interface MetaFieldStore<STORED> {
    void add(STORED registryObject);
}
