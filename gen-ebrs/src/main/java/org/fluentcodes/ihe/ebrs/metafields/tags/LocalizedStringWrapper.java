package org.fluentcodes.ihe.ebrs.metafields.tags;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.LocalizedStringType;
import org.fluentcodes.ihe.ebrs.ErrorListWrapper;
import org.fluentcodes.ihe.ebrs.IheHelper;

public class LocalizedStringWrapper extends ErrorListWrapper {
    private LocalizedStringType values;
    public LocalizedStringWrapper(LocalizedStringType values) {
        super();
        this.values = values;
    }
    public LocalizedStringWrapper(String value) {
        super();
        LocalizedStringType values = IheHelper.OF_RIM.createLocalizedStringType();
        values.setValue(value);
        this.values = values;
    }
    public  LocalizedStringType getValues() {
        return this.values;
    }

    public LocalizedStringWrapper setValues(final LocalizedStringType values) {
        this.values = values ;
        return this;
    }
}
