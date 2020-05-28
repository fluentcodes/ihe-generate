package org.fluentcodes.ihe.ebrs;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ExtrinsicObjectType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.VersionInfoType;

public class ExtrinsicObjectWrapper extends RegistryObject {
    public ExtrinsicObjectWrapper() {
        super();
    }
    private String mimeType;
    private VersionInfoType contentVersionInfo;
    public ExtrinsicObjectWrapper(final ExtrinsicObjectType type) {
        super(type);
        this.mimeType = type.getMimeType();
        this.contentVersionInfo = type.getContentVersionInfo();
    }

    public ExtrinsicObjectType createType() {
        ExtrinsicObjectType extrinsicObjectType = IheHelper.OF_RIM.createExtrinsicObjectType();
        extrinsicObjectType.setMimeType(mimeType);
        extrinsicObjectType.setContentVersionInfo(contentVersionInfo);
        super.addType(extrinsicObjectType);
        return extrinsicObjectType;
    }
}
