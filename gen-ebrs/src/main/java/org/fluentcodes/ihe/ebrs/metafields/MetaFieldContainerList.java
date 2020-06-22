package org.fluentcodes.ihe.ebrs.metafields;

import com.fasterxml.jackson.annotation.JsonIgnore;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectListType;
import org.fluentcodes.ihe.ebrs.metafields.extrinsicobjects.ExtrinsicObjectRO;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public abstract class MetaFieldContainerList<STORE_WRAPPER, STORE_TYPE> extends ErrorListWrapper implements MetaField<List<STORE_WRAPPER>, RegistryRequestWrapper, RegistryObjectListType>  {
    @JsonIgnore
    private List<STORE_WRAPPER> entries;
    private RegistryRequestWrapper parentObject;

    public MetaFieldContainerList() {
        entries = new ArrayList<>();
    }

    public MetaFieldContainerList(final RegistryRequestWrapper parentObject) {
        this.parentObject = parentObject;
        entries = new ArrayList<>();
    }

    public RegistryRequestWrapper getParentObject() {
        return parentObject;
    }

    @JsonIgnore
    public String getName() {
        return "NO_NAME";
    }

    @JsonIgnore
    public String getIdentifier() {
        return "IDENTIFIER";
    }

    public void addFromParentType(RegistryObjectListType parentType) {
    }

    public void setFromParentType(RegistryObjectListType parentType) {
        reset();
    }

    public void addToParentType(RegistryObjectListType parentType) {
    }

    @JsonIgnore
    protected STORE_WRAPPER getFirstValue() {
        return getFirst();
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

    public List<STORE_WRAPPER> get() {
        return entries;
    }

    public void set(List<STORE_WRAPPER> entries) {
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
