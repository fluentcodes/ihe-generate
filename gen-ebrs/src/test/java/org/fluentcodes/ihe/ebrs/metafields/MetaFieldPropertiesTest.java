package org.fluentcodes.ihe.ebrs.metafields;

import org.fluentcodes.ihe.ebrs.metafields.classifications.ClassificationRO;
import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.ExternalIdentifierRO;
import org.fluentcodes.ihe.ebrs.metafields.extrinsicobjects.ExtrinsicObjectRO;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MetaFieldPropertiesTest {

    @Test
    public void testMetaFieldProperties() {
        MetaFieldProperties metaFieldProperties = new MetaFieldProperties();
        List<MetaFieldProperty> properties = metaFieldProperties.getMetaFieldProperties(RegistryObject.class);
        Assert.assertEquals(7, properties.size());
        properties = metaFieldProperties.getMetaFieldProperties(ClassificationRO.class);
        Assert.assertEquals(11, properties.size());
        properties = metaFieldProperties.getMetaFieldProperties(ExternalIdentifierRO.class);
        Assert.assertEquals(10, properties.size());
        properties = metaFieldProperties.getMetaFieldProperties(ExtrinsicObjectRO.class);
        Assert.assertEquals(8, properties.size());
    }
}
