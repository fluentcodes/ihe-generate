package org.fluentcodes.ihe.iti.metafields.extrinsicobjects;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDateTime;

public class ServiceStopTimeTest {
    @Test
    public void testOk() {
        DocumentEntryRO document = new DocumentEntryRO().setServiceStopTime(ServiceStartTimeTest.DEFAULT);
        Assertions.assertThat(document.getServiceStopTime()).isEqualTo(ServiceStartTimeTest.DEFAULT.withNano(0));
        DocumentEntryROTest.compare(document);
    }
}
