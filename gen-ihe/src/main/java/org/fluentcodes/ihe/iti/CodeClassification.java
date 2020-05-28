package org.fluentcodes.ihe.iti;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ClassificationType;
import org.fluentcodes.ihe.ebrs.ClassificationWrapper;

public class CodeClassification extends ClassificationWrapper {
    public CodeClassification() {
        super();
    }

    public CodeClassification(final String code, final String codeScheme, final String displayName) {
        super();
        setNodeRepresentation(code);
        setSlot("codingScheme", codeScheme);
    }

    public CodeClassification(final ClassificationType type) {
        super(type);
    }
}
