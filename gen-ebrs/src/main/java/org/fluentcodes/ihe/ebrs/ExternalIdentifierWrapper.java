package org.fluentcodes.ihe.ebrs;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ExternalIdentifierType;

public class ExternalIdentifierWrapper extends RegistryObject {
    private String identificationScheme;
    private String registryObject;
    private String value;

    public ExternalIdentifierWrapper() {
        super();
    }
    public ExternalIdentifierWrapper(final ExternalIdentifierType type) {
        super(type);
        this.identificationScheme = type.getIdentificationScheme();
        this.registryObject = type.getRegistryObject();
        this.value = type.getValue();
    }

    public String getIdentificationScheme() {
        return identificationScheme;
    }

    public void setIdentificationScheme(String identificationScheme) {
        this.identificationScheme = identificationScheme;
    }

    public String getRegistryObject() {
        return registryObject;
    }

    public void setRegistryObject(String registryObject) {
        this.registryObject = registryObject;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ExternalIdentifierType createType() {
        ExternalIdentifierType externalIdentifier = IheHelper.OF_RIM.createExternalIdentifierType();
        externalIdentifier.setIdentificationScheme(getIdentificationScheme());
        externalIdentifier.setValue(getValue());
        externalIdentifier.setRegistryObject(getRegistryObject());
        super.addType(externalIdentifier);
        return externalIdentifier;
    }
}
