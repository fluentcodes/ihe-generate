package org.fluentcodes.ihe.ebrs;

import org.fluentcodes.ihe.ebrs.metafields.classifications.ClassificationWrapper;
import org.fluentcodes.ihe.ebrs.metafields.slots.SlotWrapper;
import org.fluentcodes.tools.xpect.IOJsonGson;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class SlotMapTest {

    public static Map<String, SlotWrapper> createExampleSlotMap() {
        Map<String, SlotWrapper> slotWrapperMap = new LinkedHashMap<>();
        slotWrapperMap.put("key1", SlotWrapperTest.createExampleSlotWrapper1());
        slotWrapperMap.put("key2", SlotWrapperTest.createExampleSlotWrapper2());
        slotWrapperMap.put("key3", SlotWrapperTest.createExampleSlotWrapper3());
        return slotWrapperMap;
    }

    @Test
    public void testCreate() {
        Map<String, SlotWrapper> slotMap = createExampleSlotMap();

        ClassificationWrapper classification = new ClassificationWrapper();
        //classification.setSlotMap(slotMap);
        new IOJsonGson()
                .setFileName("src/test/resources/SlotWrapper.json")
                .write(slotMap);
    }
}
