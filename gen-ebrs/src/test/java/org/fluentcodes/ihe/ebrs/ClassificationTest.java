package org.fluentcodes.ihe.ebrs;

import org.fluentcodes.ihe.ebrs.ClassificationWrapper;
import org.fluentcodes.tools.xpect.XpectGson;
import org.fluentcodes.tools.xpect.XpectJaxb;
import org.junit.Test;

public class ClassificationTest {

    public static ClassificationWrapper createClassification () {
        ClassificationWrapper classification = createExampleClassification1();
        classification.setClassificationMap( ClassificationMapTest.createClassificationMap());
        return classification;
    }

    public static ClassificationWrapper createExampleClassification1() {
        ClassificationWrapper classification = new ClassificationWrapper();
        classification.setSlotMap(SlotMapTest.createExampleSlotMap());
        classification.setClassificationNode("classificationNode1");
        classification.setClassificationScheme("classificationScheme1");
        classification.setClassifiedObject("classifiedObject1");
        classification.setNodeRepresentation("nodeRepresentation1");
        classification.setId("id1");
        return classification;
    }

    public static ClassificationWrapper createExampleClassification2() {
        ClassificationWrapper classification = new ClassificationWrapper();
        classification.setSlotMap(SlotMapTest.createExampleSlotMap());
        classification.setClassificationScheme("classificationScheme2");
        classification.setClassifiedObject("classifiedObject2");
        classification.setNodeRepresentation("nodeRepresentation2");
        classification.setId("id2");
        return classification;
    }

    public static ClassificationWrapper createExampleClassification3() {
        ClassificationWrapper classification = new ClassificationWrapper();
        classification.setSlotMap(SlotMapTest.createExampleSlotMap());
        classification.setClassificationNode("classificationNode3");
        classification.setClassifiedObject("classifiedObject3");
        classification.setNodeRepresentation("nodeRepresentation3");
        classification.setId("id3");
        return classification;
    }

    @Test
    public void testCreate() {
        ClassificationWrapper classification = createClassification();
        new XpectGson<>()
                .compareAsString(classification);
        new XpectJaxb<>()
                .compareAsString(classification.createType());
    }
}
