package org.fluentcodes.ihe.ebrs.metafields.classifications;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ClassificationType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldROList;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public abstract class ClassificationMetaCommon<RESULT> extends MetaFieldROList<RESULT, ClassificationRO, ClassificationType> {

    public ClassificationMetaCommon(final RegistryObject parentRO) {
        super(parentRO);
    }

    public ClassificationMetaCommon(final String identifier, final RegistryObject parentRO) {
        super(identifier, parentRO);
    }

    protected void add(String value) {
        ClassificationRO classificationRO = new ClassificationRO()
                .setNodeRepresentation(value)
                .setClassificationScheme(getIdentifier());
        add(classificationRO);
    }

    public void addFromParentType(RegistryObjectType parentType) {
        for (ClassificationType type : parentType.getClassification()) {
            addType(type);
        }
    }

    public void setFromParentType(RegistryObjectType parentRO) {
        reset();
    }

    public void addToParentType(RegistryObjectType parentType) {
        for (ClassificationRO wrapper: getEntries()) {
            parentType.getClassification().add(wrapper.createType());
        }
    }
}
