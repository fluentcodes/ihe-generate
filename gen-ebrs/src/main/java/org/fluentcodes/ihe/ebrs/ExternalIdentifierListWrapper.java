package org.fluentcodes.ihe.ebrs;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExternalIdentifierListWrapper {
    private List<ExternalIdentifierWrapper> values;
    private String scheme;

    public ExternalIdentifierListWrapper(final String scheme) {
        this.values = new ArrayList<>();
        this.scheme = scheme;
    }

    public  List<ExternalIdentifierWrapper> getValues() {
        return this.values;
    }

    public boolean isEmpty() {
        return values==null || values.isEmpty();
    }

    public ExternalIdentifierListWrapper add(final ExternalIdentifierWrapper value) {
        if (value == null) {
            return this;
        }
        values.add(value);
        return this;
    }

    public ExternalIdentifierListWrapper setValues(final Collection<ExternalIdentifierWrapper> values) {
        if (values == null|| values.isEmpty()) {
            return this;
        }
        this.values = new ArrayList<>();
        this.values.addAll(values);
        return this;
    }


    public void addType (RegistryObjectType parentObject){
        for (ExternalIdentifierWrapper externalIdentifierWrapper: this.values) {
            parentObject.getExternalIdentifier().add(externalIdentifierWrapper.createType());
        }
    }
}
