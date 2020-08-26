package org.fluentcodes.ihe.ebrs.metafields.slots;

import org.fluentcodes.ihe.ebrs.metafields.slots.SlotWrapper;
import org.fluentcodes.tools.xpect.XpectJaxb;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SlotWrapperTest {

    public static SlotWrapper createSlot1() {
        return new SlotWrapper("key1", Arrays.asList(new String[]{"value11", "value12", "value13"}));
    }
    public static SlotWrapper createSlot2() {
        return new SlotWrapper("key2", Arrays.asList(new String[]{"value21", "value22", "value23"}));
    }

    @Test
    public void testCreateSlot1() {
        new XpectJaxb<>().compareAsString(createSlot1().createType());
    }
    @Test
    public void testCreateSlot2() {
        new XpectJaxb<>().compareAsString(createSlot2().createType());
    }
}
