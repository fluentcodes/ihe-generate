package org.fluentcodes.ihe.ebrs;

import org.fluentcodes.ihe.ebrs.ExternalIdentifierWrapper;
import org.fluentcodes.tools.xpect.XpectGson;
import org.junit.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ExternalIdentifierMapTest {

    public static Map<String, ExternalIdentifierListWrapper> createExternalIdentifierMap () {
        return RegistryObject.createExternalIdentifierMap(
                List.of (
                        ExternalIdentifierWrapperTest.createExampleExternalIdentifier1(),
                        ExternalIdentifierWrapperTest.createExampleExternalIdentifier2(),
                        ExternalIdentifierWrapperTest.createExampleExternalIdentifier3()
                ));
    }

    @Test
    public void testExternalIdentifierExample() {
        new XpectGson<>()
                .compareAsString(createExternalIdentifierMap());
    }

}
