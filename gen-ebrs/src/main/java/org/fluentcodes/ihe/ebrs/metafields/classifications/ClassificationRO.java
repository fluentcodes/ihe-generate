package org.fluentcodes.ihe.ebrs.metafields.classifications;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ClassificationType;
import org.fluentcodes.ihe.ebrs.EbXmlHelper;
import org.fluentcodes.ihe.ebrs.metafields.MetaField;
import org.fluentcodes.ihe.ebrs.metafields.Properties;
import org.fluentcodes.ihe.ebrs.metafields.RODefaultTypes;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public class ClassificationRO extends RegistryObject {
    public static final String OBJECT_TYPE = "urn:oasis:names:tc:ebxml-regrep:ObjectType:RegistryObject:Classification";

    public final static String CLASSIFICATION_NODE = "classificationNode";
    public final static String CLASSIFICATION_SCHEME = "classificationScheme";
    public final static String CLASSIFIED_OBJECT = "classifiedObject";
    public final static String NODE_REPRESENTATION = "nodeRepresentation";

    public ClassificationRO() {
        super();
    }

    public ClassificationRO(final ClassificationMetaCommon meta) {
        super(meta);
        if (hasParentObject()) {
            setClassifiedObject(getParentObject().getId());
        }
        setObjectType(OBJECT_TYPE);
    }

     public ClassificationRO(final ClassificationType type) {
        this(type, null);
    }

    public ClassificationRO(final ClassificationType type, RegistryObject parentRO) {
        super();
        String identifier = type.getClassificationScheme();
        if (identifier == null) {
            identifier = type.getClassificationNode();
            if (identifier == null) {
                identifier = "NOT_SPECIFIED";
            }
        }
        MetaField metaField = null;
        if (parentRO != null) {
            metaField = parentRO.getMetaField(identifier, RODefaultTypes.CLASSIFICATION);
        }
        else {
            if (Properties.list.isMetaFieldProperty(identifier, parentRO)) {
                metaField = Properties.list.createMetaField(identifier, parentRO);
            }
            else {
                if (isStrict()) {
                    addError("Classification with scheme " + identifier + " not found as field for " + parentRO.getClass().getSimpleName());
                }
                metaField = RODefaultTypes.CLASSIFICATION.createMetaField(identifier, parentRO);
            }
        }
        addFromParentType(type, metaField);
    }

    public String getClassificationNode() {
        return (String)getMetaFieldValue(CLASSIFICATION_NODE);
    }

    public ClassificationRO setClassificationNode(String id) {
        setMetaFieldValue(CLASSIFICATION_NODE, id);
        return this;
    }


    public String getClassificationScheme() {
        return (String)getMetaFieldValue(CLASSIFICATION_SCHEME);
    }

    public ClassificationRO setClassificationScheme(String classificationScheme) {
        setMetaFieldValue(CLASSIFICATION_SCHEME, classificationScheme);
        return this;
    }

    public String getClassifiedObject() {
        return (String)getMetaFieldValue(CLASSIFIED_OBJECT);
    }

    public ClassificationRO setClassifiedObject(String classifiedObject) {
        setMetaFieldValue(CLASSIFIED_OBJECT, classifiedObject);
        return this;
    }

    public String getNodeRepresentation() {
        return (String)getMetaFieldValue(NODE_REPRESENTATION);
    }

    public ClassificationRO setNodeRepresentation(String nodeRepresentation) {
        setMetaFieldValue(NODE_REPRESENTATION, nodeRepresentation);
        return this;
    }

    public ClassificationType createType() {
        ClassificationType classificationType = EbXmlHelper.OF_RIM.createClassificationType();
        super.addToParentType(classificationType);
        return classificationType;
    }
}
