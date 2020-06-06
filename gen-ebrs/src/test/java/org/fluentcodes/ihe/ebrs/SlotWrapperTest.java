package org.fluentcodes.ihe.ebrs;

import org.fluentcodes.ihe.ebrs.metafields.slots.SlotWrapper;
import org.fluentcodes.tools.xpect.XpectJaxb;
import org.junit.Test;

import java.util.List;

public class SlotWrapperTest {

    public static SlotWrapper createSlotExample1() {
        return new SlotWrapper("key1").add(List.of("value11", "value12", "value13"));
    }
    public static SlotWrapper createSlotExample2() {
        return new SlotWrapper("key2").add(List.of("value21", "value22", "value23"));
    }

    @Test
    public void testCreateSlotExample1() {
        new XpectJaxb<>().compareAsString(createSlotExample1().createType());
    }
    @Test
    public void testCreateSlotExample() {
        new XpectJaxb<>().compareAsString(createSlotExample2().createType());
    }
}
