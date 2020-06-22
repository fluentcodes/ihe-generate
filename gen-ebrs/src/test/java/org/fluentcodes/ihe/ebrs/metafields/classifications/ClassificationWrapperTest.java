package org.fluentcodes.ihe.ebrs.metafields.classifications;

import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.ExternalIdentifierROTest;
import org.fluentcodes.ihe.ebrs.metafields.slots.SlotWrapperTest;
import org.fluentcodes.tools.xpect.XpectJaxb;
import org.junit.Test;

public class ClassificationWrapperTest {

    public static ClassificationRO createClassification_WithSlot_AndClassification_AndExternalIdentifier() {
        ClassificationRO classification = createClassification_WithSlot1();
        classification.addExternalIdentifier(ExternalIdentifierROTest.createExternalIdentifier_WithSlot1());
        classification.addClassification(createClassification_WithSlot1());
        classification.addClassification(createClassification_WithSlot2());
        return classification;
    }

    public static ClassificationRO createClassification1() {
        ClassificationRO classification = new ClassificationRO();
        classification.setClassificationNode("classificationNode1");
        classification.setClassificationScheme("classificationScheme1");
        classification.setClassifiedObject("classifiedObject1");
        classification.setNodeRepresentation("nodeRepresentation1");
        classification.setId("id1");
        return classification;
    }


    public static ClassificationRO createClassification_WithSlot1() {
        ClassificationRO classification = createClassification1();
        classification.addSlot(SlotWrapperTest.createSlot1());
        return classification;
    }

    public static ClassificationRO createClassification2() {
        ClassificationRO classification = new ClassificationRO();
        classification.setClassificationScheme("classificationScheme2");
        classification.setClassifiedObject("classifiedObject2");
        classification.setNodeRepresentation("nodeRepresentation2");
        classification.setId("id2");
        return classification;
    }

    public static ClassificationRO createClassification_WithSlot2() {
        ClassificationRO classification = createClassification2();
        classification.addSlot(SlotWrapperTest.createSlot2());
        return classification;
    }

    @Test
    public void testCreateClassification1() {
        compare(createClassification1());
    }



    @Test
    public void testCreateClassification_WithSlot_AndClassification_AndExternalIdentifier() {
        compare( createClassification_WithSlot_AndClassification_AndExternalIdentifier());
    }

    @Test
    public void testCreateClassification_WithSlot1() {
        compare(createClassification_WithSlot1());
    }

    @Test
    public void testCreateClassification_WithSlot1_AndSlot1() {
        ClassificationRO classication = createClassification_WithSlot1();
        classication.addSlot(SlotWrapperTest.createSlot1());
        compare(classication);
    }

    @Test
    public void testCreateClassification_WithSlot2() {
        compare(createClassification_WithSlot2());
    }


    public static ClassificationRO compare(ClassificationRO classification) {
        new XpectJaxb<>()
                .compareAsString(classification.createType());
        ClassificationRO fromType = new ClassificationRO(classification.createType(), null);
        new XpectJaxb<>()
                .compareAsString(fromType.createType());
        return fromType;
    }
}
