package org.fluentcodes.ihe.iti.metafields.registrypackages;

import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.ExternalIdentifierMetaString;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public class PatientId extends ExternalIdentifierMetaString {

    public PatientId(final RegistryObject parentRO) {
        super(parentRO);
    }

    public void set(final String value) {
        reset();
        add(new PatientIdRO(value, this));
    }
}
