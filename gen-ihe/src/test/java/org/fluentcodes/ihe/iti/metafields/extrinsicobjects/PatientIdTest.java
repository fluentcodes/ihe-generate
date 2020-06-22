package org.fluentcodes.ihe.iti.metafields.extrinsicobjects;

import org.assertj.core.api.Assertions;
import org.fluentcodes.tools.xpect.XpectJackson;
import org.fluentcodes.tools.xpect.XpectJaxb;
import org.junit.Test;

public class PatientIdTest {
    @Test
    public void testWithDocumentNoId() {
        DocumentEntryRO document = new DocumentEntryRO();
        PatientId patientId = new PatientId(document);
        patientId.set("test");
        Assertions.assertThat(patientId.get()).isEqualTo("test");
        PatientIdRO ro = (PatientIdRO)patientId.getFirst();
        new XpectJackson<>().compareAsString(ro);
        new XpectJaxb<>().compareAsString(ro.createType());
    }

    @Test
    public void testWithDocumentAndId() {
        DocumentEntryRO document = new DocumentEntryRO();
        document.setId("document");
        PatientId patientId = new PatientId(document);
        patientId.set("test");
        Assertions.assertThat(patientId.get()).isEqualTo("test");
        DocumentEntryROTest.compare(document);
    }
}
