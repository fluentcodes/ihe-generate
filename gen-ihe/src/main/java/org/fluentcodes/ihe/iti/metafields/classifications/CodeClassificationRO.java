package org.fluentcodes.ihe.iti.metafields.classifications;

import org.fluentcodes.ihe.ebrs.metafields.classifications.ClassificationMetaCommon;
import org.fluentcodes.ihe.ebrs.metafields.classifications.ClassificationRO;
import org.fluentcodes.ihe.iti.metafields.valuesets.CodedString;

public abstract class CodeClassificationRO extends ClassificationRO implements MetaDataCodes {
    private static final String CODING_SCHEME = "codingScheme";
    private static final String DISPLAY_NAME = "displayName";

    public CodeClassificationRO() {
        super();
    }

    public CodeClassificationRO(final String code, final ClassificationMetaCommon meta) {
        super(meta);
        CodedString codedString = findValueSet(code);
        setNodeRepresentation(codedString.getCode());
        setCodingScheme(codedString.getCodeSystem());
        setDisplayName(codedString.getDisplayName());
    }

    public String getHl7() {
        if (getCodingScheme() == null) {
            return getCode();
        }
        return getCode() + "^^" + getCodingScheme();
    }

    public String getCode() {
        return getNodeRepresentation();
    }

    public String getCodingScheme() {
        return (String)getMetaFieldValue(CODING_SCHEME);
    }

    public CodeClassificationRO setCodingScheme(String codingScheme) {
        setMetaFieldValue(CODING_SCHEME, codingScheme);
        return this;
    }

    public String getDisplayName() {
        return (String)getMetaFieldValue(DISPLAY_NAME);
    }

    public CodeClassificationRO setDisplayName(String displayName) {
        setMetaFieldValue(DISPLAY_NAME, displayName);
        return this;
    }
}
