package org.fluentcodes.ihe.ebrs.metafields;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public abstract class MetaFieldAttribute extends MetaFieldCommon<String> {
    public MetaFieldAttribute( final RegistryObject parentRO) {
        super(parentRO);
    }
    private String value;
    public String get() {
        return value;
    }
    public void set(final String value) {this.value = value;}

    public void addFromParentType(RegistryObjectType parent) {
        setFromParentType(parent);
    }
}
