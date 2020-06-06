package org.fluentcodes.ihe.ebrs;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ClassificationType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.fluentcodes.ihe.ebrs.metafields.classifications.ClassificationWrapper;
import org.fluentcodes.tools.xpect.IOXmlJaxb;
import org.fluentcodes.tools.xpect.XpectGson;
import org.fluentcodes.tools.xpect.XpectJaxb;
import org.junit.Test;

import java.io.File;

public class ClassificationTest {

    public static ClassificationWrapper createClassification () {
        ClassificationWrapper classification = createExampleClassification1();
        classification.addClassification(createExampleClassification1());
        classification.addClassification(createExampleClassification2());
        classification.addClassification(createExampleClassification3());
        return classification;
    }

    public static ClassificationWrapper createExampleClassification1() {
        ClassificationWrapper classification = new ClassificationWrapper();
        //classification.setSlotMap(SlotMapTest.createExampleSlotMap());
        classification.setClassificationNode("classificationNode1");
        classification.setClassificationScheme("classificationScheme1");
        classification.setClassifiedObject("classifiedObject1");
        classification.setNodeRepresentation("nodeRepresentation1");
        classification.setId("id1");
        return classification;
    }

    public static ClassificationWrapper createExampleClassification2() {
        ClassificationWrapper classification = new ClassificationWrapper();
        //classification.setSlotMap(SlotMapTest.createExampleSlotMap());
        classification.setClassificationScheme("classificationScheme2");
        classification.setClassifiedObject("classifiedObject2");
        classification.setNodeRepresentation("nodeRepresentation2");
        classification.setId("id2");
        return classification;
    }

    public static ClassificationWrapper createExampleClassification3() {
        ClassificationWrapper classification = new ClassificationWrapper();
        //classification.setSlotMap(SlotMapTest.createExampleSlotMap());
        classification.setClassificationNode("classificationNode3");
        classification.setClassifiedObject("classifiedObject3");
        classification.setNodeRepresentation("nodeRepresentation3");
        classification.setId("id3");
        return classification;
    }

    @Test
    public void testCreate() {
        ClassificationWrapper classification = createClassification();
        new XpectJaxb<>()
                .compareAsString(classification.createType());
    }

    @Test
    public void testCreate1() {
        ClassificationWrapper classification = createExampleClassification1();
        new XpectJaxb<>()
                .compareAsString(classification.createType());
    }

    @Test
    public void testCreate1WithClassification2() {
        ClassificationWrapper classification = createExampleClassification1();
        classification.addClassification(createExampleClassification2());
        compare(classification);
    }

    @Test
    public void testCreate1WithExternalIdentifier1() {
        ClassificationWrapper classification = createExampleClassification1();
        classification.addExternalIdentifier(ExternalIdentifierWrapperTest.createExampleExternalIdentifier1());
        compare(classification);
    }

    @Test
    public void testCreate1WithSlot1() {
        ClassificationWrapper classification = createExampleClassification1();
        classification.addSlot(SlotWrapperTest.createExampleSlotWrapper1());
        compare(classification);
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
