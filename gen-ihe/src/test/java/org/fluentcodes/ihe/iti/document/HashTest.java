package org.fluentcodes.ihe.iti.document;

import org.assertj.core.api.Assertions;
import org.fluentcodes.ihe.iti.documents;
import org.junit.Test;

public class HashTest {
    @Test
    public void testOk() {
        documents.IheDocument document = new documents.IheDocument();
        document.setHash("value");
        Assertions.assertThat(document.getHash()).isEqualTo("value");
        /*SlotWrapper slot = document(MetaFields.HASH.getKey());
        Assertions.assertThat(slot).isNotNull();
        Assertions.assertThat(slot.hasErrors()).isFalse();*/
    }

    @Test
    public void testDoubleValuesNok() {
        documents.IheDocument document = new documents.IheDocument();
        /*document.setSlot(MetaFields.HASH.getKey(), List.of(List.of("value1", "value2")));
        Assertions.assertThat(document.getHash()).isEqualTo("value1");
        SlotWrapper slot = document.getSlotWrapper(MetaFields.HASH.getKey());
        Assertions.assertThat(slot.hasErrors()).isTrue();*/
    }
}
