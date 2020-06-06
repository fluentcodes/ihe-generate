package org.fluentcodes.ihe.ebrs.metafields.slots;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.SlotType1;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldRegistryObjectList;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public abstract  class SlotCommon<STORED> extends MetaFieldRegistryObjectList<SlotWrapper, STORED> {
    public SlotCommon(RegistryObject parentObject) {
        super(parentObject);
    }

    public void addFromParentType(RegistryObjectType registryObject) {
        for (SlotType1 slotType: registryObject.getSlot()) {
            add(new SlotWrapper(slotType));
        }
    }

    public void setFromParentType(RegistryObjectType parentObject) {
        reset();
        addFromParentType(parentObject);
    }

    public void addToParentType(RegistryObjectType parentObject) {
        if (parentObject.getSlot() == null) {
            //parentObject.setSlot() = new ArrayList<>();
        }
        for (SlotWrapper slot: getEntries()) {
           parentObject.getSlot().add(slot.createType());
        }
    }

    public List<SlotType1> createType (){
        List<SlotType1> slotListType = new ArrayList<>();
        for (SlotWrapper slot: getEntries()) {
            slotListType.add(slot.createType());
        }
        return slotListType;
    }
}
