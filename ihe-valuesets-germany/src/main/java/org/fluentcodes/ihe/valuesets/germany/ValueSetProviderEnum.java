package org.fluentcodes.ihe.valuesets.germany;

import java.util.Collection;
import java.util.List;

public enum ValueSetProviderEnum {
    AUTHOR_ROLE("AuthorRole", true),
    AUTHOR_SPECIALTY("AuthorSpecialty", true),
    CLASS_CODE("ClassCode"),
    CONFIDENTIALITY_CODE("ConfidentialityCode"),
    CONTENT_TYPE_CODE("ContentTypeCode"),
    EVENT_CODE_LIST("EventCodeList"),
    FORMAT_CODE("FormatCode"),
    HEALTHCARE_FACILITY_TYPE_CODE("HealthcareFacilityTypeCode"),
    PRACTICE_SETTING_CODE("PracticeSettingCode"),
    TYPE_CODE("TypeCode");

    final ValueSetProvider valueSetProvider;
    private ValueSetProviderEnum(final String valueSetKey) {
       this( valueSetKey, false);
    }
    private ValueSetProviderEnum(final String ValueSetKey, final boolean iso) {
        this.valueSetProvider = new ValueSetProvider(ValueSetKey, iso);
    }

    public CodedString findValueSetMild(final String code) {
        return findValueSet(code, false);
    }

    public CodedString findValueSetStrict(final String code) {
        return findValueSet(code, true);
    }

    public CodedString findValueSet(final String code, boolean strict) {
        return valueSetProvider. findValueSet(code,strict);
    }
}
