package org.fluentcodes.ihe.ebrs.metafields.extrinsicobjects;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ExtrinsicObjectType;
import org.fluentcodes.ihe.ebrs.EbXmlHelper;
import org.fluentcodes.ihe.ebrs.metafields.MetaField;
import org.fluentcodes.ihe.ebrs.metafields.Properties;
import org.fluentcodes.ihe.ebrs.metafields.RODefaultTypes;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ExtrinsicObjectRO extends RegistryObject<ExtrinsicObjectType> {
    public static final String MIME_TYPE = "mimeType";
    public static final String CONTENT_VERSION_INFO = "contentVersionInfo";

    public ExtrinsicObjectRO() {
        super();
    }
    public ExtrinsicObjectRO(final  ExtrinsicObjectType type, final RegistryObject parentRO) {
        super();
        MetaField metaField = new ExtrinsicObject();
        addFromParentType(type, metaField);
    }

    @Override
    public boolean isStrict() {
        return false;
    }

    @Override
    public ExtrinsicObjectType createType() {
        ExtrinsicObjectType extrinsicObjectType = EbXmlHelper.OF_RIM.createExtrinsicObjectType();
        super.addToParentType(extrinsicObjectType);
        return extrinsicObjectType;
    }

    public JAXBElement<ExtrinsicObjectType> createElement() {
        QName qName = new QName("", "ExtrinsicObject");
        return (JAXBElement<ExtrinsicObjectType>)new JAXBElement(qName, ExtrinsicObjectType.class, createElement());
    }
}
