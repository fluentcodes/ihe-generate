package org.fluentcodes.ihe.ebrs.metafields.extrinsicobject;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ExtrinsicObjectType;
import org.fluentcodes.ihe.ebrs.IheHelper;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public class ExtrinsicObjectWrapper extends RegistryObject {
    public static String MIME_TYPE = "mimeType";
    public static final String CONTENT_VERSION_INFO = "contentVersionInfo";

    public ExtrinsicObjectWrapper() {
        super();
    }
    public ExtrinsicObjectWrapper(final ExtrinsicObjectType type) {
        super(type);
    }

    @Override
    public ExtrinsicObjectType createType() {
        ExtrinsicObjectType extrinsicObjectType = IheHelper.OF_RIM.createExtrinsicObjectType();
        super.addToParentType(extrinsicObjectType);
        return extrinsicObjectType;
    }
}
