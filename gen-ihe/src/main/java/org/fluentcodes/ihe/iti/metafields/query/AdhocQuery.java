package org.fluentcodes.ihe.iti.metafields.query;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.AdhocQueryType;
import org.fluentcodes.ihe.ebrs.EbXmlHelper;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

public class AdhocQuery extends RegistryObject<AdhocQueryType> {

    public AdhocQueryType createType() {
        AdhocQueryType type = EbXmlHelper.OF_RIM.createAdhocQueryType();
        addToParentType(type);
        return type;
    }
}

