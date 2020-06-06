package org.fluentcodes.ihe.ebrs.metafields.classifications;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ClassificationType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.IheException;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldRegistryObjectList;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public abstract class ClassificationCommon<RESULT> extends MetaFieldRegistryObjectList<ClassificationWrapper,RESULT> {

    public ClassificationCommon(RegistryObject parentObject) {
        super(parentObject);
    }

    protected void add(String value) {
        ClassificationWrapper classificationWrapper = new ClassificationWrapper()
                .setNodeRepresentation(value)
                .setClassificationScheme(getIdentifier());
        add(classificationWrapper);
    }


    public void addFromParentType(RegistryObjectType registryObject) {
        if (! (registryObject instanceof ClassificationType)) {
            throw new IheException("No a classification but '" + registryObject.getClass().getSimpleName() + "'");
        }
        add(new ClassificationWrapper((ClassificationType) registryObject));
    }

    public void setFromParentType(RegistryObjectType registryObjectType) {
        reset();
    }

    public void add(ClassificationType classificationType) {
        add(new ClassificationWrapper(classificationType));
    }

    public void addToParentType(RegistryObjectType registryObjectType) {
        for (ClassificationWrapper wrapper: getEntries()) {
            registryObjectType.getClassification().add(wrapper.createType());
        }
    }
}
