package org.fluentcodes.ihe.iti.metafields.extrinsicobjects;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ClassificationType;
import org.assertj.core.api.Assertions;
import org.fluentcodes.ihe.ebrs.metafields.classifications.ClassificationRO;
import org.fluentcodes.ihe.iti.metafields.valuesets.CodedString;
import org.fluentcodes.tools.xpect.XpectJaxb;
import org.junit.Test;

public class FormatCodeROTest {
    public static final String ERKLAERUNG = "urn:gematik:ig:DatensatzPersoenlicheErklaerungen:r3.1";
    public static final String EDR = "urn:ihe:pcc:edr:2007";
    public static final CodedString ERKLAERUNG_CODE = FormatCodeRO.VALUE_SET_PROVIDER.findValueSet(ERKLAERUNG,false);
    public static final CodedString EDR_CODE = FormatCodeRO.VALUE_SET_PROVIDER.findValueSet(EDR,false);

    @Test
    public void testErklarung() {
        FormatCodeRO classification = new FormatCodeRO(ERKLAERUNG);
        Assertions.assertThat(classification.getCode()).isEqualTo(ERKLAERUNG);
        Assertions.assertThat(classification.getDisplayName()).isEqualTo(ERKLAERUNG_CODE.getDisplayName());
        compare(classification);
    }

    @Test
    public void testEdr() {
        FormatCodeRO classification = new FormatCodeRO(EDR);
        Assertions.assertThat(classification.getCode()).isEqualTo(EDR);
        compare(classification);
    }

    @Test
    public void testWithDocumentAndId() {
        DocumentEntryRO document = new DocumentEntryRO();
        document.setId("document");
        FormatCode formatCode = new FormatCode(document);
        formatCode.set(EDR);
        Assertions.assertThat(document.getFormatCode()).isEqualTo("urn:ihe:pcc:edr:2007^^1.3.6.1.4.1.19376.1.2.3");
        DocumentEntryROTest.compare(document);
    }

    public static ClassificationRO compare(ClassificationRO classification) {
        ClassificationType type = classification.createType();
        new XpectJaxb<>()
                .compareAsString(type);
        ClassificationRO fromType = new ClassificationRO(type, null);
        new XpectJaxb<>()
                .compareAsString(fromType.createType());
        return fromType;
    }
}
