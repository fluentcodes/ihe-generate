package org.fluentcodes.ihe.ebrs.metafields.externalidentifiers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.ExternalIdentifierType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldROList;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public abstract class ExternalIdentifierMetaCommon<RESULT> extends MetaFieldROList<RESULT, ExternalIdentifierRO, ExternalIdentifierType> {

    protected ExternalIdentifierMetaCommon(final RegistryObject parentRO) {
        super(parentRO);
    }

    protected ExternalIdentifierMetaCommon(final String identifier, final RegistryObject parentRO) {
        super(identifier, parentRO);
    }

    protected void add(String value) {
        ExternalIdentifierRO wrapper = new ExternalIdentifierRO()
                .setValue(value)
                .setIdentificationScheme(getIdentifier());
        add(wrapper);
    }


    public void addFromParentType(RegistryObjectType parentType) {
        for (ExternalIdentifierType type: parentType.getExternalIdentifier()) {
            addType(type);
        }
    }

    public void setFromParentType(RegistryObjectType parentType) {
        reset();
    }

    public void addToParentType(RegistryObjectType parentType) {
        for (ExternalIdentifierRO wrapper: getEntries()) {
            parentType.getExternalIdentifier().add(wrapper.createType());
        }
    }

    @JsonIgnore
    protected String getFirstValue() {
        if (!hasFirst()) {
            return null;
        }
        return getFirst().getValue();
    }
}
