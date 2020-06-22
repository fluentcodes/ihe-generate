package org.fluentcodes.ihe.ebrs.metafields.externalidentifiers;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ExternalIdentifierType;
import org.fluentcodes.ihe.ebrs.EbXmlHelper;
import org.fluentcodes.ihe.ebrs.metafields.MetaField;
import org.fluentcodes.ihe.ebrs.metafields.Properties;
import org.fluentcodes.ihe.ebrs.metafields.RODefaultTypes;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public class ExternalIdentifierRO extends RegistryObject {
    public static final String OBJECT_TYPE = "urn:oasis:names:tc:ebxml1090 regrep:ObjectType:RegistryObject:ExternalIdentifier";

    public static final String IDENTIFICATION_SCHEME = "identificationScheme";
    public static final String REGISTRY_OBJECT = "registryObject";
    public static final String VALUE = "value";

    public ExternalIdentifierRO() {
        super();
    }

    public ExternalIdentifierRO(final String value, final ExternalIdentifierMetaCommon metaData) {
        super(metaData);
        setValue(value);
        setIdentificationScheme(getMetaIdentifier());
        if (hasParentObject()) {
            setRegistryObject(getParentObject().getId());
        }
        setObjectType(OBJECT_TYPE);
    }

    public ExternalIdentifierRO(final ExternalIdentifierType type) {
        this(type, null);
    }

    public ExternalIdentifierRO(final ExternalIdentifierType type, RegistryObject parentRO) {
        super();
        String identifier = type.getIdentificationScheme();
        if (identifier == null) {
            identifier = "NOT_SPECIFIED";
        }
        MetaField metaField = null;
        if (parentRO != null) {
            metaField = parentRO.getMetaField(identifier, RODefaultTypes.EXTERNAL_IDENTIFIER);
        }
        else {
            if (Properties.list.isMetaFieldProperty(identifier, parentRO)) {
                metaField = Properties.list.createMetaField(identifier, parentRO);
            }
            else {
                if (isStrict()) {
                    addError("External Identifier with scheme " + identifier + " not found as field for " + parentRO.getClass().getSimpleName());
                }
                metaField = RODefaultTypes.EXTERNAL_IDENTIFIER.createMetaField(identifier, parentRO);
            }
        }
        addFromParentType(type, metaField);
    }

    public ExternalIdentifierRO setIdentificationScheme(String identificationScheme) {
        setMetaFieldValue(IDENTIFICATION_SCHEME, identificationScheme);
        return this;
    }

    public String getIdentificationScheme() {
        return (String)getMetaFieldValue(IDENTIFICATION_SCHEME);
    }


    public String getRegistryObject() {
        return (String)getMetaFieldValue(REGISTRY_OBJECT);
    }

    public ExternalIdentifierRO setRegistryObject(String registryObject) {
        setMetaFieldValue(REGISTRY_OBJECT, registryObject);
        return this;
    }

    public String getValue() {
        return (String)getMetaFieldValue(VALUE);
    }

    public ExternalIdentifierRO setValue(String value) {
        setMetaFieldValue(VALUE, value);
        return this;
    }

    public ExternalIdentifierType createType() {
        ExternalIdentifierType externalIdentifier = EbXmlHelper.OF_RIM.createExternalIdentifierType();
        super.addToParentType(externalIdentifier);
        return externalIdentifier;
    }
}
