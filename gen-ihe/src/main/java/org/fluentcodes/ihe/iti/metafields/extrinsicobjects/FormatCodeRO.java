package org.fluentcodes.ihe.iti.metafields.extrinsicobjects;

import org.fluentcodes.ihe.ebrs.metafields.classifications.ClassificationMetaCommon;
import org.fluentcodes.ihe.iti.metafields.classifications.CodeClassificationRO;
import org.fluentcodes.ihe.iti.metafields.valuesets.CodedString;
import org.fluentcodes.ihe.iti.metafields.valuesets.ValueSetProvider;

public class FormatCodeRO extends CodeClassificationRO {
    public static final String CODE_NAME = "FormatCode";
    public static final ValueSetProvider VALUE_SET_PROVIDER = new ValueSetProvider(CODE_NAME, false);

    public FormatCodeRO() {
        super();
    }

    public FormatCodeRO(final String code) {
        super(code, new FormatCode(null));
    }

    public FormatCodeRO(final String code, final ClassificationMetaCommon meta) {
        super(code, meta);
    }

    @Override
    public CodedString findValueSet(final String code) {
        return VALUE_SET_PROVIDER.findValueSet(code, false);
    }

    @Override
    public ValueSetProvider getValueSetProvider() {
        return VALUE_SET_PROVIDER;
    }
}
