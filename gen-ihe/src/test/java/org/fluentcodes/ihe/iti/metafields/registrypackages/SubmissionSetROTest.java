package org.fluentcodes.ihe.iti.metafields.registrypackages;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryPackageType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.fluentcodes.ihe.ebrs.exceptions.EbXmlException;
import org.fluentcodes.ihe.ebrs.metafields.registrypackages.RegistryPackageRO;
import org.fluentcodes.ihe.ebrs.metafields.slots.SlotWrapper;
import org.fluentcodes.tools.xpect.XpectJackson;
import org.fluentcodes.tools.xpect.XpectJaxb;
import org.junit.Assert;
import org.junit.Test;

public class SubmissionSetROTest {
    private static final Logger LOG = LogManager.getLogger(SubmissionSetRO.class);

    @Test
    public void testAddUnregisteredSlotName_throwException() {
        SubmissionSetRO submissionSet = new SubmissionSetRO();
        submissionSet.setId("submissionSet");
        SlotWrapper slot = new SlotWrapper("slotName", "value");
        try {
            submissionSet.addSlot(slot);
            Assert.fail("Should throw Exception since slotName not in the properties. ");
        }
        catch (EbXmlException e) {
            LOG.debug("Expected Exception: " + e.getMessage());
        }
    }

    @Test
    public void testAddRegisteredSlotName_noException() {
        SubmissionSetRO submissionSet = new SubmissionSetRO();
        submissionSet.setId("submissionSet");
        SlotWrapper slot = new SlotWrapper("submissionTime", "2019010115");
        submissionSet.addSlot(slot);
        compare(submissionSet);
    }


    public static RegistryPackageRO compare(SubmissionSetRO submissionSetRO) {
        RegistryPackageType type = submissionSetRO.createType();
        new XpectJaxb<>()
                .compareAsString(type);

        SubmissionSetRO fromType = new SubmissionSetRO(type, null);
        type = fromType.createType();
        new XpectJaxb<>()
                .compareAsString(type);

        new XpectJackson<>().compareAsString(submissionSetRO);
        SubmissionSetRO submissionSetFromJson = (SubmissionSetRO) new XpectJackson<SubmissionSetRO>()
                .setMappingClass(SubmissionSetRO.class)
                .read();
        new XpectJackson<>().compareAsString(submissionSetFromJson);
        return fromType;
    }
}
