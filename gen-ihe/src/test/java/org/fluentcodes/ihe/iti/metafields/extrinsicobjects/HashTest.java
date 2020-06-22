package org.fluentcodes.ihe.iti.metafields.extrinsicobjects;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class HashTest {
    @Test
    public void testOk() {
        DocumentEntryRO document = (DocumentEntryRO)new DocumentEntryRO()
                .setHash("value")
                .setId("id");
        Assertions.assertThat(document.getHash()).isEqualTo("value");
        DocumentEntryROTest.compare(document);
    }

    @Test
    public void testDoubleValuesNok() {
        DocumentEntryRO document = new DocumentEntryRO();
        /*document.setSlot(MetaFields.HASH.getKey(), List.of(List.of("value1", "value2")));
        Assertions.assertThat(document.getHash()).isEqualTo("value1");
        SlotWrapper slot = document.getSlotWrapper(MetaFields.HASH.getKey());
        Assertions.assertThat(slot.hasErrors()).isTrue();*/
    }
}
