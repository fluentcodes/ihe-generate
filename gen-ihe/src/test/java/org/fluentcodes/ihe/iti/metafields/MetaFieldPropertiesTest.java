package org.fluentcodes.ihe.iti.metafields;

import org.assertj.core.api.Assertions;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldProperties;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldProperty;
import org.fluentcodes.ihe.iti.metafields.extrinsicobjects.DocumentEntryRO;
import org.fluentcodes.tools.xpect.IOJsonJackson;
import org.junit.Test;

import java.util.List;

public class MetaFieldPropertiesTest {
    @Test
    public void testReadFromClassPath() {
        List<MetaFieldProperty> properties = new IOJsonJackson<List<MetaFieldProperty>>()
                .setMappingClasses(List.of(List.class, MetaFieldProperty.class))
                .setFileName(MetaFieldProperties.FILE_NAME)
                .readList();
        Assertions.assertThat(properties).isNotNull();
        Assertions.assertThat(properties).isNotEmpty();
    }

    @Test
    public void checkClasses() {
        DocumentEntryRO document = new DocumentEntryRO();
        org.fluentcodes.ihe.iti.metafields.extrinsicobjects.FormatCode format = new org.fluentcodes.ihe.iti.metafields.extrinsicobjects.FormatCode(document);
        org.fluentcodes.ihe.iti.metafields.extrinsicobjects.Hash hash = new org.fluentcodes.ihe.iti.metafields.extrinsicobjects.Hash(document);
    }

}
