package org.fluentcodes.ihe.ebrs;

import org.fluentcodes.ihe.ebrs.metafields.classifications.ClassificationWrapper;
import org.fluentcodes.tools.xpect.XpectJaxb;
import org.junit.Test;

public class ClassificationWrapperTest {

    public static ClassificationWrapper createClassificationExampleWithSlotClassificationAndExternalIdentifier() {
        ClassificationWrapper classification = createClassificationExampleWithSlot1();
        classification.addExternalIdentifier(ExternalIdentifierWrapperTest.createExternalIdentifierExampleWithSlot1());
        classification.addClassification(createClassificationExampleWithSlot1());
        classification.addClassification(createClassificationExampleWithSlot2());
        return classification;
    }

    public static ClassificationWrapper createClassificationExampleWithSlot1() {
        ClassificationWrapper classification = new ClassificationWrapper();
        classification.addSlot(SlotWrapperTest.createSlotExample1());
        classification.setClassificationNode("classificationNode1");
        classification.setClassificationScheme("classificationScheme1");
        classification.setClassifiedObject("classifiedObject1");
        classification.setNodeRepresentation("nodeRepresentation1");
        classification.setId("id1");
        return classification;
    }

    public static ClassificationWrapper createClassificationExampleWithSlot2() {
        ClassificationWrapper classification = new ClassificationWrapper();
        classification.addSlot(SlotWrapperTest.createSlotExample2());
        classification.setClassificationScheme("classificationScheme2");
        classification.setClassifiedObject("classifiedObject2");
        classification.setNodeRepresentation("nodeRepresentation2");
        classification.setId("id2");
        return classification;
    }


    @Test
    public void  testCreateClassificationExampleWithSlotClassificationAndExternalIdentifier() {
        compare( createClassificationExampleWithSlotClassificationAndExternalIdentifier());
    }

    @Test
    public void testCreateClassificationExampleWithSlot1() {
        compare(createClassificationExampleWithSlot1());
    }

    @Test
    public void testCreateClassificationExampleWithSlot1AndSlot1() {
        ClassificationWrapper classication = createClassificationExampleWithSlot1();
        classication.addSlot(SlotWrapperTest.createSlotExample1());
        compare(classication);
    }

    @Test
    public void testCreateClassificationExampleWithSlot2() {
        compare(createClassificationExampleWithSlot2());
    }


    public static ClassificationWrapper compare(ClassificationWrapper classification) {
        new XpectJaxb<>()
                .compareAsString(classification.createType());
        ClassificationWrapper fromType = new ClassificationWrapper(classification.createType());
        new XpectJaxb<>()
                .compareAsString(fromType.createType());
        return fromType;
    }
}
