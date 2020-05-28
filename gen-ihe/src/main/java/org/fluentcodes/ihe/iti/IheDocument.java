package org.fluentcodes.ihe.iti;

import org.fluentcodes.ihe.ebrs.ExtrinsicObjectWrapper;

import static org.fluentcodes.ihe.iti.MetaFields.HASH;

;
public class IheDocument extends ExtrinsicObjectWrapper {
    public String getHash() {
        return getSlotString(HASH.getKey());
    }
    public IheDocument setHash(final String value) {
        setSlot(HASH.getKey(), value);
        return this;
    }
}
