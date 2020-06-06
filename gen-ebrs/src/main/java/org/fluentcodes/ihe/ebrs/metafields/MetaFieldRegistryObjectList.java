package org.fluentcodes.ihe.ebrs.metafields;

import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public abstract class MetaFieldRegistryObjectList<STORE, RESULT> extends MetaFieldCommon<RESULT> implements MetaFieldNamed {
    private String identifier;
    private List<STORE> entries;
    public MetaFieldRegistryObjectList(RegistryObject parentObject) {
        super(parentObject);
        entries = new ArrayList<>();
    }

    public boolean isEmpty() {
        return entries == null || entries.isEmpty();
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public List<STORE> getEntries() {
        return entries;
    }

    public void setEntries(List<STORE> entries) {
        this.entries = entries;
    }

    public void add(STORE entry) {
        entries.add(entry);
    }

    public STORE getFirst() {
        return entries.get(0);
    }

    public void reset() {
        entries = new ArrayList<>();
    }
}
