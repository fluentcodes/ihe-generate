package org.fluentcodes.ihe.ebrs;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ExtrinsicObjectType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.ObjectFactory;
import org.junit.Assert;
import org.junit.Test;

public class IheTest {
    @Test
    public void testExtrinsicObject (){
        ExtrinsicObjectType extrinsicObjectType = new ObjectFactory().createExtrinsicObjectType();
        Assert.assertNotNull(extrinsicObjectType);
    }

}
