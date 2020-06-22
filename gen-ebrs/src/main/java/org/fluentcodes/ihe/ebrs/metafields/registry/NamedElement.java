package org.fluentcodes.ihe.ebrs.metafields.registry;

public interface NamedElement {
    String getMetaIdentifier();
    String getMetaName();
    boolean isStrict();
}
