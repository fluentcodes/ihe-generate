package org.fluentcodes.ihe.ebrs.metafields.extrinsicobjects;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ExtrinsicObjectType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.ObjectFactory;
import org.junit.Assert;
import org.junit.Test;

public class ExtrinsicObjectTest {
    @Test
    public void testExtrinsicObject (){
        ExtrinsicObjectType extrinsicObjectType = new ObjectFactory().createExtrinsicObjectType();
        Assert.assertNotNull(extrinsicObjectType);
    }

}
