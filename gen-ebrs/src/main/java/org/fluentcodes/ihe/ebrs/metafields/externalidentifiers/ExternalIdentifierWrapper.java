package org.fluentcodes.ihe.ebrs.metafields.externalidentifiers;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ExternalIdentifierType;
import org.fluentcodes.ihe.ebrs.IheHelper;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public class ExternalIdentifierWrapper extends RegistryObject {
    public static final String IDENTIFICATION_SCHEME = "identificationScheme";
    public static final String REGISTRY_OBJECT = "registryObject";
    public static final String VALUE = "value";
    /*private String identificationScheme;
    private String registryObject;
    private String value;
*/
    public ExternalIdentifierWrapper() {
        super();
    }
    public ExternalIdentifierWrapper(final ExternalIdentifierType type) {
        super(type);
    }

    public String getIdentificationScheme() {
        return (String)getMetaFieldValue(IDENTIFICATION_SCHEME);
    }

    public ExternalIdentifierWrapper setIdentificationScheme(String identificationScheme) {
        setMetaFieldValue(IDENTIFICATION_SCHEME, identificationScheme);
        return this;
    }

    public String getRegistryObject() {
        return (String)getMetaFieldValue(REGISTRY_OBJECT);
    }

    public ExternalIdentifierWrapper setRegistryObject(String registryObject) {
        setMetaFieldValue(REGISTRY_OBJECT, registryObject);
        return this;
    }

    public String getValue() {
        return (String)getMetaFieldValue(VALUE);
    }

    public ExternalIdentifierWrapper setValue(String value) {
        setMetaFieldValue(VALUE, value);
        return this;
    }

    public ExternalIdentifierType createType() {
        ExternalIdentifierType externalIdentifier = IheHelper.OF_RIM.createExternalIdentifierType();
        super.addToParentType(externalIdentifier);
        return externalIdentifier;
    }
}
