package org.fluentcodes.ihe.iti.metafields.classifications;

import org.fluentcodes.ihe.ebrs.metafields.classifications.ClassificationRO;

import java.util.List;

public class AuthorRO extends ClassificationRO {
    private static final String AUTHOR_INSTITUTION = "authorInstitution";

    public boolean isStrict() {
        return true;
    }

    public List<String> getAuthorInstitution() {
        return (List<String>) getMetaFieldValue(AUTHOR_INSTITUTION);
    }

    public AuthorRO setAuthorInstitution(List<String> authorInstitution) {
        setMetaFieldValue(AUTHOR_INSTITUTION, authorInstitution);
        return this;
    }
}
