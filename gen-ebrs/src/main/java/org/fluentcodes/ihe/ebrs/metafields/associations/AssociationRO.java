package org.fluentcodes.ihe.ebrs.metafields.associations;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.AssociationType1;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryPackageType;
import org.fluentcodes.ihe.ebrs.EbXmlHelper;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AssociationRO extends RegistryObject<AssociationType1> {
    public static final String TARGET_OBJECT = "targetObject";
    public static final String SOURCE_OBJECT = "sourceObject";
    public static final String ASSOCIATION_TYPE = "associationType";
    public AssociationRO() {
        super();
    }
    public AssociationRO(final AssociationType1 type, RegistryObject parentRO) {
        super();
    }

    public AssociationType1 createType() {
        final AssociationType1 type = EbXmlHelper.OF_RIM.createAssociationType1();
        super.addToParentType(type);
        return type;
    }

    public JAXBElement< AssociationType1> createElement() {
        QName qName = new QName("", " Association");
        return (JAXBElement< AssociationType1>)new JAXBElement(qName,  AssociationType1.class, createElement());
    }
}
