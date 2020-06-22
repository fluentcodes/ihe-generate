package org.fluentcodes.ihe.iti.metafields.valuesets;

import org.fluentcodes.ihe.iti.metafields.extrinsicobjects.FormatCodeROTest;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ValueSetProviderTest {
    @Test
    public void testTypeCode() {
        ValueSetProvider provider = new ValueSetProvider("TypeCode", false);
        CodedString typeCode = provider.findValueSet("ABRE", false);
        assertThat(typeCode.getCode()).isEqualTo("ABRE");
}
    @Test
    public void testFormatCode() {
        ValueSetProvider provider = new ValueSetProvider("FormatCode", false);
        CodedString typeCode = provider.findValueSet(FormatCodeROTest.ERKLAERUNG, false);//from test
        assertThat(typeCode.getCode()).isEqualTo(FormatCodeROTest.ERKLAERUNG);
        typeCode = provider.findValueSet(FormatCodeROTest.EDR, false);// from main
        assertThat(typeCode.getCode()).isEqualTo(FormatCodeROTest.EDR);
    }
}
