package org.fluentcodes.ihe.iti.metafields.extrinsicobjects;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDateTime;

public class ServiceStartTimeTest {
    public static final LocalDateTime DEFAULT = LocalDateTime.of(2020, 6, 21,1,0,0);
    @Test
    public void testOk() {
        DocumentEntryRO document = new DocumentEntryRO().setServiceStartTime(DEFAULT);
        Assertions.assertThat(document.getServiceStartTime()).isEqualTo(DEFAULT.withNano(0));
        DocumentEntryROTest.compare(document);
    }
}
