package org.fluentcodes.ihe.iti;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ClassificationType;

public class FormatCodeClassification extends CodeClassification {
    public static final String CLASSIFICATION_SCHEME = "urn:uuid:a09d5840-386c-46f2-b5ad-9c3699a4309d";
    public FormatCodeClassification() {
        super();
    }
    public FormatCodeClassification(final String code, final String codeScheme, final String displayName) {
        super(code, codeScheme, displayName);
        setClassificationScheme(CLASSIFICATION_SCHEME);
    }
    public FormatCodeClassification(final ClassificationType type) {
        super(type);
    }
}
