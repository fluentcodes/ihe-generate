package org.fluentcodes.ihe.ebrs.metafields.classifications;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ClassificationType;
import org.fluentcodes.ihe.ebrs.IheHelper;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public class ClassificationWrapper extends RegistryObject {
    public final static String CLASSIFICATION_NODE = "classificationNode";
    public final static String CLASSIFICATION_SCHEME = "classificationScheme";
    public final static String CLASSIFIED_OBJECT = "classifiedObject";
    public final static String NODE_REPRESENTATION = "nodeRepresentation";

    public ClassificationWrapper() {
        super();
    }

    public ClassificationWrapper(final ClassificationType type) {
        super(type);
    }

    public String getClassificationNode() {
        return (String)getMetaFieldValue(CLASSIFICATION_NODE);
    }

    public ClassificationWrapper setClassificationNode(String id) {
        setMetaFieldValue(CLASSIFICATION_NODE, id);
        return this;
    }


    public String getClassificationScheme() {
        return (String)getMetaFieldValue(CLASSIFICATION_SCHEME);
    }

    public ClassificationWrapper setClassificationScheme(String classificationScheme) {
        setMetaFieldValue(CLASSIFICATION_SCHEME, classificationScheme);
        return this;
    }

    public String getClassifiedObject() {
        return (String)getMetaFieldValue(CLASSIFIED_OBJECT);
    }

    public ClassificationWrapper setClassifiedObject(String classifiedObject) {
        setMetaFieldValue(CLASSIFIED_OBJECT, classifiedObject);
        return this;
    }

    public String getNodeRepresentation() {
        return (String)getMetaFieldValue(NODE_REPRESENTATION);
    }

    public ClassificationWrapper setNodeRepresentation(String nodeRepresentation) {
        setMetaFieldValue(NODE_REPRESENTATION, nodeRepresentation);
        return this;
    }

    public ClassificationType createType() {
        ClassificationType classificationType = IheHelper.OF_RIM.createClassificationType();
        super.addToParentType(classificationType);
        return classificationType;
    }
}
