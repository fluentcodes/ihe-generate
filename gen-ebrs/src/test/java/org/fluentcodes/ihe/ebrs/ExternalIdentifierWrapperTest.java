package org.fluentcodes.ihe.ebrs;

import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.ExternalIdentifierWrapper;
import org.fluentcodes.tools.xpect.XpectJaxb;
import org.junit.Test;

public class ExternalIdentifierWrapperTest {

    public static ExternalIdentifierWrapper createExternalIdentifierExampleWithExternalIdentifiersClassificationAndSlot() {
        ExternalIdentifierWrapper externalIdentifier = new ExternalIdentifierWrapper();
        externalIdentifier.addSlot(SlotWrapperTest.createSlotExample1());
        externalIdentifier.addClassification(ClassificationWrapperTest.createClassificationExampleWithSlot2());
        externalIdentifier.addExternalIdentifier(createExternalIdentifierExampleWithSlot1());
        externalIdentifier.addExternalIdentifier(createExternalIdentifierExampleWithSlot2());
        externalIdentifier.setIdentificationScheme("identificationScheme1");
        externalIdentifier.setRegistryObject("registryObject1");
        externalIdentifier.setValue("value1");
        externalIdentifier.setId("id1");
        return externalIdentifier;
    }
    public static ExternalIdentifierWrapper createExternalIdentifierExampleWithSlot1() {
        ExternalIdentifierWrapper externalIdentifier = new ExternalIdentifierWrapper();
        externalIdentifier.addSlot(SlotWrapperTest.createSlotExample1());
        externalIdentifier.setIdentificationScheme("identificationScheme1");
        externalIdentifier.setRegistryObject("registryObject1");
        externalIdentifier.setValue("value1");
        externalIdentifier.setId("id1");
        return externalIdentifier;
    }

    public static ExternalIdentifierWrapper createExternalIdentifierExampleWithSlot2() {
        ExternalIdentifierWrapper externalIdentifier = new ExternalIdentifierWrapper();
        externalIdentifier.addSlot(SlotWrapperTest.createSlotExample1());
        externalIdentifier.setIdentificationScheme("identificationScheme2");
        externalIdentifier.setRegistryObject("registryObject2");
        externalIdentifier.setValue("value2");
        externalIdentifier.setId("id2");
        return externalIdentifier;
    }

    @Test
    public void testCreateExternalIdentifierExampleWithExternalIdentifiersClassificationAndSlot() {
       compare(createExternalIdentifierExampleWithExternalIdentifiersClassificationAndSlot());
    }

    @Test
    public void testCreateExternalIdentifierExampleWithSlot1() {
        compare(createExternalIdentifierExampleWithSlot1());
    }

    @Test
    public void testCreateExternalIdentifierExampleWithSlot2() {
        compare(createExternalIdentifierExampleWithSlot2());
    }

    public static ExternalIdentifierWrapper compare(ExternalIdentifierWrapper externalIdentifier) {
        new XpectJaxb<>()
                .compareAsString(externalIdentifier.createType());
        ExternalIdentifierWrapper fromType = new ExternalIdentifierWrapper(externalIdentifier.createType());
        new XpectJaxb<>()
                .compareAsString(fromType.createType());
        return fromType;
    }

}
