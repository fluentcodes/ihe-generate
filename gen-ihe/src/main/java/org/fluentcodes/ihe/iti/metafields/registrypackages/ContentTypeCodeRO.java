package org.fluentcodes.ihe.iti.metafields.registrypackages;

import org.fluentcodes.ihe.ebrs.metafields.classifications.ClassificationMetaCommon;
import org.fluentcodes.ihe.iti.metafields.classifications.CodeClassificationRO;
import org.fluentcodes.ihe.iti.metafields.valuesets.CodedString;
import org.fluentcodes.ihe.iti.metafields.valuesets.ValueSetProvider;

public class ContentTypeCodeRO extends CodeClassificationRO {
    public static final String CODE_NAME = "ContentTypeCode";
    public static final ValueSetProvider VALUE_SET_PROVIDER = new ValueSetProvider(CODE_NAME, false);

    public ContentTypeCodeRO() {
        super();
    }

    public ContentTypeCodeRO(final String code) {
        super(code, new ContentTypeCode(null));
    }

    public ContentTypeCodeRO(final String code, final ClassificationMetaCommon meta) {
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
