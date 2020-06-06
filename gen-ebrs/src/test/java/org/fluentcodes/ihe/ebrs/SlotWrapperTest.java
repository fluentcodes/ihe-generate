package org.fluentcodes.ihe.ebrs;

import org.fluentcodes.ihe.ebrs.metafields.slots.SlotWrapper;
import org.fluentcodes.tools.xpect.XpectGson;
import org.fluentcodes.tools.xpect.XpectJaxb;
import org.junit.Test;

import java.util.List;

public class SlotWrapperTest {

    public static SlotWrapper createExampleSlotWrapper1() {
        return new SlotWrapper("key1").add(List.of("value11", "value12", "value13"));
    }
    public static SlotWrapper createExampleSlotWrapper2() {
        return new SlotWrapper("key2").add(List.of("value21", "value22", "value23"));
    }
    public static SlotWrapper createExampleSlotWrapper3() {
        return new SlotWrapper("key3").setValues(List.of("value31", "value32", "value33"));
    }

    @Test
    public void test1() {
        new XpectGson<>().compareAsString(createExampleSlotWrapper1());
        new XpectJaxb<>().compareAsString(createExampleSlotWrapper1().createType());
    }
    @Test
    public void test2() {
        new XpectGson<>().compareAsString(createExampleSlotWrapper2());
    }
    @Test
    public void test3() {
        new XpectGson<>().compareAsString(createExampleSlotWrapper3());
    }

}
