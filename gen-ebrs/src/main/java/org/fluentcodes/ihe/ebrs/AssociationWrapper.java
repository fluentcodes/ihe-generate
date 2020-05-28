package org.fluentcodes.ihe.ebrs;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.AssociationType1;

public class AssociationWrapper extends RegistryObject {
    private String targetObject;
    private String sourceObject;
    private String associationType;
    public AssociationWrapper() {
        super();
    }
    public AssociationWrapper(final AssociationType1 type) {
        super(type);
        sourceObject = type.getSourceObject();
        targetObject = type.getTargetObject();
        associationType = type.getAssociationType();


    }

    public AssociationType1 createType() {
        AssociationType1 associationType1 = IheHelper.OF_RIM.createAssociationType1();
        super.addType(associationType1);
        associationType1.setAssociationType(associationType);
        associationType1.setTargetObject(targetObject);
        associationType1.setSourceObject(sourceObject);
        return associationType1;
    }
}
