package org.fluentcodes.ihe.ebrs.metafields.registrypackages;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryPackageType;
import org.fluentcodes.ihe.ebrs.EbXmlHelper;
import org.fluentcodes.ihe.ebrs.metafields.MetaField;
import org.fluentcodes.ihe.ebrs.metafields.extrinsicobjects.ExtrinsicObject;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RegistryPackageRO extends RegistryObject {
    public RegistryPackageRO() {
        super();
    }
    public RegistryPackageRO(final RegistryPackageType type, final RegistryObject parentRO) {
        super();
        MetaField metaField = new RegistryPackage();
        addFromParentType(type, metaField);
    }

    public oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryPackageType createType() {
        oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryPackageType registryPackageType = EbXmlHelper.OF_RIM.createRegistryPackageType();
        super.addToParentType(registryPackageType);
        return registryPackageType;
    }


    public JAXBElement<RegistryPackageType> createElement() {
        QName qName = new QName("", "RegistryPackage");
        return (JAXBElement<RegistryPackageType>)new JAXBElement(qName, RegistryPackageType.class, createElement());
    }
}
