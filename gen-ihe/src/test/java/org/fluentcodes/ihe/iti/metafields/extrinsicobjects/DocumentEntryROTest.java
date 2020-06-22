package org.fluentcodes.ihe.iti.metafields.extrinsicobjects;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ExtrinsicObjectType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.fluentcodes.ihe.ebrs.exceptions.EbXmlException;
import org.fluentcodes.ihe.ebrs.metafields.extrinsicobjects.ExtrinsicObjectRO;
import org.fluentcodes.ihe.ebrs.metafields.slots.SlotWrapper;
import org.fluentcodes.tools.xpect.XpectJackson;
import org.fluentcodes.tools.xpect.XpectJaxb;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class DocumentEntryROTest {
    private static final Logger LOG = LogManager.getLogger(DocumentEntryRO.class);

    @Test
    public void testAddUnregisteredSlotName_throwException() {
        DocumentEntryRO document = new DocumentEntryRO();
        document.setId("document");
        SlotWrapper slot = new SlotWrapper("slotName", "value");
        try {
            document.addSlot(slot);
            Assert.fail("Should throw Exception since slotName not in the properties. ");
        }
        catch (EbXmlException e) {
            LOG.debug("Expected Exception: " + e.getMessage());
        }
    }

    @Test
    public void testAddRegisteredSlotName_noException() {
        DocumentEntryRO document = new DocumentEntryRO();
        document.setId("document");
        SlotWrapper slot = new SlotWrapper("serviceStartTime", "2019010115");
        document.addSlot(slot);
    }


    public static ExtrinsicObjectRO compare(DocumentEntryRO documentRO) {
        ExtrinsicObjectType type = documentRO.createType();
        new XpectJaxb<>()
                .compareAsString(type);

        ExtrinsicObjectRO fromType = new ExtrinsicObjectRO(type, null);
        type = fromType.createType();
        if ("application/octet-stream".equals(type.getMimeType())) {
            type.setMimeType(null);
        }
        new XpectJaxb<>()
                .compareAsString(type);

        new XpectJackson<>().compareAsString(documentRO);
        DocumentEntryRO documentFromJson = (DocumentEntryRO) new XpectJackson<DocumentEntryRO>()
                .setMappingClass(DocumentEntryRO.class)
                .read();
        new XpectJackson<>().compareAsString(documentFromJson);
        return fromType;
    }
}
