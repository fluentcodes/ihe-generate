package org.fluentcodes.ihe.iti.metafields.extrinsicobjects;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * {@link CreationTime}
 */
public class CreationTimeTest {
    @Test
    public void testOk() {
        DocumentEntryRO document = new DocumentEntryRO().setCreationTime(ServiceStartTimeTest.DEFAULT);
        Assertions.assertThat(document.getCreationTime()).isEqualTo(ServiceStartTimeTest.DEFAULT.withNano(0));
        DocumentEntryROTest.compare(document);
    }
}
