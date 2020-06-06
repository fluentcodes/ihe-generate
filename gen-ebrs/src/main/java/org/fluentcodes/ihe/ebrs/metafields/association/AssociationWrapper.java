package org.fluentcodes.ihe.ebrs.metafields.association;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.AssociationType1;
import org.fluentcodes.ihe.ebrs.IheHelper;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public class AssociationWrapper extends RegistryObject {
    public static final String TARGET_OBJECT = "targetObject";
    public static final String SOURCE_OBJECT = "sourceObject";
    public static final String ASSOCIATION_TYPE = "associationType";
    private String targetObject;
    private String sourceObject;
    private String associationType;
    public AssociationWrapper() {
        super();
    }
    public AssociationWrapper(final AssociationType1 type) {
        super(type);
    }

    public AssociationType1 createType() {
        AssociationType1 associationType1 = IheHelper.OF_RIM.createAssociationType1();
        super.addToParentType(associationType1);
        return associationType1;
    }
}
