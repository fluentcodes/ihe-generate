package org.fluentcodes.ihe.ebrs.metafields;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public abstract class MetaFieldROList<RESULT, STORE_WRAPPER, STORE_TYPE> extends MetaFieldCommon<RESULT>  {
    @JsonIgnore
    private List<STORE_WRAPPER> entries;

    public MetaFieldROList(final String identifier, final RegistryObject parentRO) {
        super(identifier, parentRO);
        entries = new ArrayList<>();
    }

    public MetaFieldROList(final RegistryObject parentRO) {
        super(parentRO);
        entries = new ArrayList<>();
    }

    @JsonIgnore
    public boolean isEmpty() {
        return entries == null || entries.isEmpty();
    }

    public List<STORE_WRAPPER> getEntries() {
        return entries;
    }
    public void setEntries(List<STORE_WRAPPER> entries) {
        this.entries = entries;
    }

    public void add(STORE_WRAPPER entry) {
        entries.add(entry);
    }

    public void addType(STORE_TYPE entry) {
        //entries.add(entry);
    }

    @JsonIgnore
    public STORE_WRAPPER getFirst() {
        if (!hasFirst()) {
            return null;
        }
        return entries.get(0);
    }

    public boolean hasFirst() {
        return entries != null && !entries.isEmpty();
    }

    public void reset() {
        entries = new ArrayList<>();
    }
}
