package org.fluentcodes.ihe.ebrs.metafields.registry;

import org.fluentcodes.ihe.ebrs.metafields.slots.SlotWrapper;

public interface Identifiable<TYPE> extends Element<TYPE>, NamedElement {

    Identifiable addSlot(final SlotWrapper slot);

    String getHome();
    void setHome(String home);

    String getId();
    Identifiable setId(String id);
}
