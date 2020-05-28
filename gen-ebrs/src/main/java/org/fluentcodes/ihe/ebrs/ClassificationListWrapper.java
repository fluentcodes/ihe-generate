package org.fluentcodes.ihe.ebrs;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ClassificationListWrapper {
    private List<ClassificationWrapper> values;
    private String scheme;

    public ClassificationListWrapper(final String scheme) {
        this.values = new ArrayList<>();
        this.scheme = scheme;
    }

    public  List<ClassificationWrapper> getValues() {
        return this.values;
    }

    public boolean isEmpty() {
        return values==null || values.isEmpty();
    }

    public void addType (RegistryObjectType parentObject){
        for (ClassificationWrapper classificationWrapper: this.values) {
            parentObject.getClassification().add(classificationWrapper.createType());
        }
    }

    public ClassificationListWrapper add(final ClassificationWrapper value) {
        if (value == null) {
            return this;
        }
        values.add(value);
        return this;
    }

    public ClassificationListWrapper setValues(final Collection<ClassificationWrapper> values) {
        if (values == null|| values.isEmpty()) {
            return this;
        }
        this.values = new ArrayList<>();
        this.values.addAll(values);
        return this;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }
}
