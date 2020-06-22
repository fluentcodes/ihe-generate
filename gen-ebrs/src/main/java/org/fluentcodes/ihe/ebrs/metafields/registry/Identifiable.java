package org.fluentcodes.ihe.ebrs.metafields.registry;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.LocalizedStringType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.VersionInfoType;
import org.fluentcodes.ihe.ebrs.metafields.classifications.ClassificationRO;
import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.ExternalIdentifierRO;
import org.fluentcodes.ihe.ebrs.metafields.slots.SlotWrapper;

import java.util.List;

public interface Identifiable<PARENT_TYPE, TYPE> extends Element<PARENT_TYPE, TYPE> {
    boolean isStrict();
    Identifiable addSlot(final SlotWrapper slot);

    String getHome();
    void setHome(String home);

    String getId();
    Identifiable setId(String id);
}
