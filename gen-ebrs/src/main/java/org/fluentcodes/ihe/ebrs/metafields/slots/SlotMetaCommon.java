package org.fluentcodes.ihe.ebrs.metafields.slots;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.SlotType1;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldROList;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public abstract  class SlotMetaCommon<STORED> extends MetaFieldROList<STORED, SlotWrapper, SlotType1> {
    public SlotMetaCommon(final String identifier) {
        super(identifier, null);
    }
    public SlotMetaCommon(final String identifier, final RegistryObject parentRO) {
        super(identifier, parentRO);
    }
    protected SlotMetaCommon(RegistryObject  parentRO) {
        super(parentRO);
    }

    public void addFromParentType(RegistryObjectType parentType) {
        for (SlotType1 slotType: parentType.getSlot()) {
            if (!getIdentifier().equals(slotType.getName())) {
                continue;
            }
            addType(slotType);
        }
    }

    public void setFromParentType(RegistryObjectType parentRO) {
        reset();
        addFromParentType(parentRO);
    }

    public void addToParentType(RegistryObjectType parentRO) {
        for (SlotWrapper slot: getEntries()) {
           parentRO.getSlot().add(slot.createType());
        }
    }

    public List<SlotType1> createType (){
        List<SlotType1> slotListType = new ArrayList<>();
        for (SlotWrapper slot: getEntries()) {
            slotListType.add(slot.createType());
        }
        return slotListType;
    }

    protected List<String> getFirstValues() {
        if (!hasFirst()) {
            return new ArrayList<>();
        }
        return getFirst().getValues();
    }

    protected String getFirstValue() {
        if (getFirstValues().isEmpty()) {
            return "";
        }
        return getFirstValues().get(0);
    }
}
