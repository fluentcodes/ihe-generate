package org.fluentcodes.ihe.ebrs;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ClassificationType;

public class ClassificationWrapper extends RegistryObject {
    private String classificationNode;
    private String classificationScheme;
    private String classifiedObject;
    private String nodeRepresentation;

    public ClassificationWrapper() {
        super();
    }

    public ClassificationWrapper(final ClassificationType type) {
        super(type);
        this.classificationNode = type.getClassificationNode();
        this.classificationScheme = type.getClassificationScheme();
        this.classifiedObject = type.getClassifiedObject();
        this.nodeRepresentation = type.getNodeRepresentation();
    }

    public String getClassificationNode() {
        return classificationNode;
    }

    public void setClassificationNode(String classificationNode) {
        this.classificationNode = classificationNode;
    }

    public String getClassificationScheme() {
        return classificationScheme;
    }

    public void setClassificationScheme(String classificationScheme) {
        this.classificationScheme = classificationScheme;
    }

    public String getClassifiedObject() {
        return classifiedObject;
    }

    public void setClassifiedObject(String classifiedObject) {
        this.classifiedObject = classifiedObject;
    }

    public String getNodeRepresentation() {
        return nodeRepresentation;
    }

    public void setNodeRepresentation(String nodeRepresentation) {
        this.nodeRepresentation = nodeRepresentation;
    }

    public ClassificationType createType() {
        ClassificationType classificationType = IheHelper.OF_RIM.createClassificationType();
        classificationType.setClassificationScheme(getClassificationScheme());
        classificationType.setClassificationNode(getClassificationNode());
        classificationType.setNodeRepresentation(getNodeRepresentation());
        classificationType.setClassifiedObject(getClassifiedObject());
        super.addType(classificationType);
        return classificationType;
    }
}
