package org.fluentcodes.ihe.ebrs.metafields;

import org.fluentcodes.ihe.ebrs.ErrorListWrapper;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public abstract class MetaFieldCommon<RESULT> extends ErrorListWrapper implements MetaField<RESULT> {
    private final RegistryObject parentObject;
    public MetaFieldCommon (RegistryObject parentObject) {
        super();
        this.parentObject = parentObject;
    }

    public RegistryObject getParentObject() {
        return parentObject;
    }
}
