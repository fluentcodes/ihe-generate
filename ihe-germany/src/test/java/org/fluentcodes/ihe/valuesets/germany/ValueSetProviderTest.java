package org.fluentcodes.ihe.valuesets.germany;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ValueSetProviderTest {
    @Test
    public void testTypeCode() {
        ValueSetProvider provider = new ValueSetProvider("TypeCode", false);
        CodedString typeCode = provider.findValueSet("ABRE", false);
        assertThat(typeCode.getCode()).isEqualTo("ABRE");
    }
}
