package org.fluentcodes.ihe.iti.metafields.extrinsicobjects;

import org.assertj.core.api.Assertions;
import org.fluentcodes.tools.xpect.XpectJackson;
import org.fluentcodes.tools.xpect.XpectJaxb;
import org.junit.Test;

public class UniqueIdTest {
    @Test
    public void testWithDocumentNoId() {
        DocumentEntryRO document = new DocumentEntryRO();
        UniqueId uniqueId = new UniqueId(document);
        uniqueId.set("test");
        Assertions.assertThat(uniqueId.get()).isEqualTo("test");
        UniqueIdRO ro = (UniqueIdRO)uniqueId.getFirst();
        new XpectJackson<>().compareAsString(ro);
        new XpectJaxb<>().compareAsString(ro.createType());
    }

    @Test
    public void testWithDocumentAndId() {
        DocumentEntryRO document = new DocumentEntryRO();
        document.setId("document");
        UniqueId uniqueId = new UniqueId(document);
        uniqueId.set("test");
        Assertions.assertThat(uniqueId.get()).isEqualTo("test");
        DocumentEntryROTest.compare(document);
    }
}
