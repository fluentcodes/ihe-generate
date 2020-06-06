package org.fluentcodes.ihe.ebrs.metafields.externalidentifiers;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ClassificationType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.ExternalIdentifierType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.IheException;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldRegistryObjectList;
import org.fluentcodes.ihe.ebrs.metafields.classifications.ClassificationWrapper;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public abstract class ExternalIdentifierCommon<RESULT> extends MetaFieldRegistryObjectList<ExternalIdentifierWrapper,RESULT> {

    public ExternalIdentifierCommon(RegistryObject parentObject) {
        super(parentObject);
    }

    protected void add(String value) {
        ExternalIdentifierWrapper wrapper = new ExternalIdentifierWrapper()
                .setValue(value)
                .setIdentificationScheme(getIdentifier());
        add(wrapper);
    }


    public void addFromParentType(RegistryObjectType registryObject) {
        if (! (registryObject instanceof ClassificationType)) {
            throw new IheException("No a classification but '" + registryObject.getClass().getSimpleName() + "'");
        }
        add(new ExternalIdentifierWrapper((ExternalIdentifierType) registryObject));
    }

    public void setFromParentType(RegistryObjectType registryObjectType) {
        reset();
    }

    public void add(ExternalIdentifierType classificationType) {
        add(new ExternalIdentifierWrapper(classificationType));
    }

    public void addToParentType(RegistryObjectType registryObjectType) {
        for (ExternalIdentifierWrapper wrapper: getEntries()) {
            registryObjectType.getExternalIdentifier().add(wrapper.createType());
        }
    }
}
