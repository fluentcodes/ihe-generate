package org.fluentcodes.ihe.ebrs.metafields.slots;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.SlotType1;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.ValueListType;
import oasis.names.tc.ebxml_regrep.xsd.rs._3.RegistryError;
import org.fluentcodes.ihe.ebrs.ErrorListWrapper;
import org.fluentcodes.ihe.ebrs.IheHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SlotWrapper extends ErrorListWrapper {
    private List<String> values;
    private String name;
    public SlotWrapper(SlotType1 slotType) {
        super();
        this.name = slotType.getName();
        if (slotType.getValueList()!=null) {
            this.values = slotType.getValueList().getValue();
        }
        else {
            this.values = new ArrayList<>();
        }
    }

    public SlotWrapper() {
        super();
        this.values = new ArrayList<>();
    }

    public SlotWrapper(final String name) {
        this();
        this.name = name;
    }

    public SlotWrapper(final String name, String value) {
        this(name);
        this.values.add(value);
    }

    public SlotWrapper(final String name, Set<String> value) {
        this(name);
        this.values = value.stream().collect(Collectors.toList());
    }


    public SlotWrapper(final String name, final List<String> values) {
        this(name);
        this.values.addAll(values);
    }

    public boolean isEmpty() {
        return values==null || values.isEmpty();
    }

    public SlotType1 createType (){
        final SlotType1 slotType1 = IheHelper.OF_RIM.createSlotType1();
        final ValueListType valueList = IheHelper.OF_RIM.createValueListType();
        slotType1.setValueList(valueList);
        slotType1.setName(name);
        valueList.getValue().addAll(values);
        return slotType1;
    }

    public SlotWrapper add(final List<String> value) {
        if (value == null|| value.isEmpty()) {
            return this;
        }
        values.addAll(value);
        return this;
    }

    public  List<String> getValues() {
        return this.values;
    }

    public SlotWrapper setValues(final List<String> values) {
        if (values == null|| values.isEmpty()) {
            return this;
        }
        this.values = new ArrayList<>();
        this.values.addAll(values);
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
