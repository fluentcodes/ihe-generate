package org.fluentcodes.ihe.iti.metafields.extrinsicobjects;

import org.fluentcodes.ihe.ebrs.metafields.classifications.ClassificationMetaCommon;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;
import org.fluentcodes.ihe.iti.metafields.classifications.AuthorRO;

public class AuthorMetaSingle extends ClassificationMetaCommon<AuthorRO> {
    public AuthorMetaSingle(final RegistryObject parentRO) {
        super(parentRO);
    }
    public AuthorRO get() {
        if (isEmpty()) {
            return null;
        }
        return (AuthorRO)getFirst();
    }
    public void set(final AuthorRO authorRO) {
        add(authorRO);
    }
}
