package org.fluentcodes.ihe.iti.metafields.classifications;

import org.fluentcodes.ihe.iti.metafields.valuesets.CodedString;
import org.fluentcodes.ihe.iti.metafields.valuesets.ValueSetProvider;

public interface MetaDataCodes {
    CodedString findValueSet(final String code) ;
    ValueSetProvider getValueSetProvider();
    String getDisplayName();
    String getCode();
    String getCodingScheme();
}
