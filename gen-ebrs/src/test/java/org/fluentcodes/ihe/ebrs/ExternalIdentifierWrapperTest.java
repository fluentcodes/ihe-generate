package org.fluentcodes.ihe.ebrs;

import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.ExternalIdentifierWrapper;
import org.fluentcodes.tools.xpect.XpectGson;
import org.junit.Test;

public class ExternalIdentifierWrapperTest {

    public static ExternalIdentifierWrapper createExternalIdentifier () {
        ExternalIdentifierWrapper ExternalIdentifier = createExampleExternalIdentifier1();
        //ExternalIdentifier.setExternalIdentifierMap( ExternalIdentifierMapTest.createExternalIdentifierMap());
        return ExternalIdentifier;
    }

    public static ExternalIdentifierWrapper createExampleExternalIdentifier1() {
        ExternalIdentifierWrapper externalIdentifier = new ExternalIdentifierWrapper();
        //externalIdentifier.setSlotMap(SlotMapTest.createExampleSlotMap());
        externalIdentifier.setIdentificationScheme("identificationScheme1");
        externalIdentifier.setRegistryObject("registryObject1");
        externalIdentifier.setValue("value1");
        externalIdentifier.setId("id1");
        return externalIdentifier;
    }

    public static ExternalIdentifierWrapper createExampleExternalIdentifier2() {
        ExternalIdentifierWrapper externalIdentifier = new ExternalIdentifierWrapper();
        //externalIdentifier.setSlotMap(SlotMapTest.createExampleSlotMap());
        externalIdentifier.setIdentificationScheme("identificationScheme2");
        externalIdentifier.setRegistryObject("registryObject2");
        externalIdentifier.setValue("value2");
        externalIdentifier.setId("id2");
        return externalIdentifier;
    }

    public static ExternalIdentifierWrapper createExampleExternalIdentifier3() {
        ExternalIdentifierWrapper externalIdentifier = new ExternalIdentifierWrapper();
        //externalIdentifier.setSlotMap(SlotMapTest.createExampleSlotMap());
        externalIdentifier.setIdentificationScheme("identificationScheme3");
        externalIdentifier.setRegistryObject("registryObject3");
        externalIdentifier.setValue("value3");
        externalIdentifier.setId("id3");
        return externalIdentifier;
    }

    @Test
    public void testCreate() {
        new XpectGson<>()
                .compareAsString(createExternalIdentifier());
    }

}
