package org.fluentcodes.ihe.ebrs.metafields.externalidentifiers;

import org.fluentcodes.ihe.ebrs.metafields.classifications.ClassificationWrapperTest;
import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.ExternalIdentifierRO;
import org.fluentcodes.ihe.ebrs.metafields.slots.SlotWrapperTest;
import org.fluentcodes.tools.xpect.XpectJaxb;
import org.junit.Test;

public class ExternalIdentifierROTest {

    public static ExternalIdentifierRO createExternalIdentifier1() {
        ExternalIdentifierRO externalIdentifier = new ExternalIdentifierRO();
        externalIdentifier.setIdentificationScheme("identificationScheme1");
        externalIdentifier.setRegistryObject("registryObject1");
        externalIdentifier.setValue("value1");
        externalIdentifier.setId("id1");
        return externalIdentifier;
    }

    public static ExternalIdentifierRO createExternalIdentifier2() {
        ExternalIdentifierRO externalIdentifier = new ExternalIdentifierRO();
        externalIdentifier.setIdentificationScheme("identificationScheme2");
        externalIdentifier.setRegistryObject("registryObject2");
        externalIdentifier.setValue("value2");
        externalIdentifier.setId("id2");
        return externalIdentifier;
    }

    public static ExternalIdentifierRO createExternalIdentifier1_WithExternalIdentifier2() {
        ExternalIdentifierRO externalIdentifier = new ExternalIdentifierRO();
        externalIdentifier.addExternalIdentifier(createExternalIdentifier2());
        return externalIdentifier;
    }

    public static ExternalIdentifierRO createExternalIdentifier1_WithExternalIdentifier_AndClassification_AndSlot() {
        ExternalIdentifierRO externalIdentifier = createExternalIdentifier1();
        externalIdentifier.addSlot(SlotWrapperTest.createSlot1());
        externalIdentifier.addClassification(ClassificationWrapperTest.createClassification_WithSlot2());
        externalIdentifier.addExternalIdentifier(createExternalIdentifier_WithSlot1());
        externalIdentifier.addExternalIdentifier(createExternalIdentifier2());
        return externalIdentifier;
    }

    public static ExternalIdentifierRO createExternalIdentifier_WithSlot1() {
        ExternalIdentifierRO externalIdentifier = createExternalIdentifier1();
        externalIdentifier.addSlot(SlotWrapperTest.createSlot1());
        return externalIdentifier;
    }

    @Test
    public void testCreateExternalIdentifier1() {
        compare(createExternalIdentifier1());
    }

    @Test
    public void testCreateExternalIdentifier2() {
        compare(createExternalIdentifier2());
    }

    @Test
    public void testCreateExternalIdentifier1_WithExternalIdentifier2() {
        compare(createExternalIdentifier1_WithExternalIdentifier2());
    }

    @Test
    public void testCreateExternalIdentifier1_WithExternalIdentifier_AndClassification_AndSlot() {
       compare(createExternalIdentifier1_WithExternalIdentifier_AndClassification_AndSlot());
    }

    @Test
    public void testCreateExternalIdentifier_WithSlot1() {
        compare(createExternalIdentifier_WithSlot1());
    }


    public static ExternalIdentifierRO compare(ExternalIdentifierRO externalIdentifier) {
        new XpectJaxb<>()
                .compareAsString(externalIdentifier.createType());
        ExternalIdentifierRO fromType = new ExternalIdentifierRO(externalIdentifier.createType());
        new XpectJaxb<>()
                .compareAsString(fromType.createType());
        return fromType;
    }

}
