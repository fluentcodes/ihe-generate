package org.fluentcodes.ihe.ebrs;

import org.fluentcodes.tools.xpect.XpectGson;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class ClassificationMapTest {

    public static Map<String, ClassificationListWrapper> createClassificationMap () {
        return RegistryObject.createClassificationMap(List.of(
                ClassificationTest.createExampleClassification1(),
                ClassificationTest.createExampleClassification2(),
                ClassificationTest.createExampleClassification3()));
    }

    @Test
    public void testClassificationExample() {
        new XpectGson<>()
                .compareAsString(createClassificationMap());
    }

}
