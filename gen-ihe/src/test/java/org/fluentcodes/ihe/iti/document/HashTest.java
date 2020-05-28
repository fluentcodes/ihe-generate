package org.fluentcodes.ihe.iti.document;

import org.assertj.core.api.Assertions;
import org.fluentcodes.ihe.ebrs.SlotWrapper;
import org.fluentcodes.ihe.iti.IheDocument;
import org.fluentcodes.ihe.iti.MetaFields;
import org.junit.Test;

import java.util.List;

public class HashTest {
    @Test
    public void testOk() {
        IheDocument document = new IheDocument();
        document.setHash("value");
        Assertions.assertThat(document.getHash()).isEqualTo("value");
        SlotWrapper slot = document.getSlotWrapper(MetaFields.HASH.getKey());
        Assertions.assertThat(slot).isNotNull();
        Assertions.assertThat(slot.hasErrors()).isFalse();
    }

    @Test
    public void testDoubleValuesNok() {
        IheDocument document = new IheDocument();
        document.setSlot(MetaFields.HASH.getKey(), List.of(List.of("value1", "value2")));
        Assertions.assertThat(document.getHash()).isEqualTo("value1");
        SlotWrapper slot = document.getSlotWrapper(MetaFields.HASH.getKey());
        Assertions.assertThat(slot.hasErrors()).isTrue();
    }
}
