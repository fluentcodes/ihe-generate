package org.fluentcodes.ihe.ebrs;

import com.google.gson.annotations.Expose;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.SlotType1;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.ValueListType;
import oasis.names.tc.ebxml_regrep.xsd.rs._3.RegistryError;

import java.beans.Transient;
import java.util.*;
import java.util.stream.Collectors;

public class SlotWrapper {
    @Expose(serialize = true, deserialize = true)
    private List<List<String>> values;
    @Expose(serialize = true, deserialize = true)
    private String name;
    @Expose(serialize = false, deserialize = false)
    private ErrorListWrapper errors;

    public SlotWrapper() {
        this.errors = new ErrorListWrapper();
        this.values = new ArrayList<>();
    }

    public SlotWrapper(final String name) {
        this();
        this.name = name;
    }

    public SlotWrapper(final String name, String value) {
        this(name);
        this.values.add(List.of(value));
    }

    public SlotWrapper(final String name, Set<String> value) {
        this(name);
        this.values.add(value.stream().collect(Collectors.toList()));
    }


    public SlotWrapper(final String name, final List<List<String>> values) {
        this(name);
        this.values.addAll(values);
    }

    public SlotWrapper(final String name, final RegistryObjectType parentObject) {
        this(name);
        List<SlotType1> slotList = parentObject.getSlot();
        for (SlotType1 slot: slotList) {
            if (slot.getValueList() == null) {
                continue;
            }
            if (name.equals(slot.getName())) {
                add(slot.getValueList().getValue());
            }
        }
    }

    public boolean isEmpty() {
        return values==null || values.isEmpty();
    }

    public List<SlotType1> createType (){
        List<SlotType1> slotListType = new ArrayList<>();
        for (Collection<String> values: this.values) {
            final SlotType1 slotType1 = IheHelper.OF_RIM.createSlotType1();
            final ValueListType valueList = IheHelper.OF_RIM.createValueListType();
            slotType1.setValueList(valueList);
            slotType1.setName(name);
            valueList.getValue().addAll(values);
            slotListType.add(slotType1);
        }
        return slotListType;
    }

    public SlotWrapper add(final List<String> value) {
        if (value == null|| value.isEmpty()) {
            return this;
        }
        values.add(value);
        return this;
    }

    public  List<List<String>> getValues() {
        return this.values;
    }

    public SlotWrapper setValues(final List<List<String>> values) {
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

    public ErrorListWrapper getErrors() {
        return errors;
    }

    public void setErrors(ErrorListWrapper errors) {
        this.errors = errors;
    }

    public boolean hasErrors() {
        return errors.hasErrors();
    }

    public List<RegistryError> getErrorList() {
        return errors.getErrorList();
    }

    public String getString() {
        List<String> row = getList();
        if (row.isEmpty()) {
            return "";
        }
        if (row.size()>1) {
            errors.addError(name + ": More than one value in slot is set.");
        }
        return row.get(0);
    }

    public List<String> getList() {
        errors.resetErrorList();
        if (this.isEmpty()) {
            return new ArrayList<>();
        }
        if (this.getValues() == null || this.getValues().isEmpty()) {
            return new ArrayList<>();
        }
        if (this.getValues().get(0) == null) {
            return new ArrayList<>();
        }
        if (this.getValues().size()>1) {
            errors.addError(name + ": More than one slot is set with the same name.");
        }
        return this.getValues().get(0);
    }

    public Set<String> getSet() {
        Set<String> result = new LinkedHashSet<>();
        for (String value: getList()) {
            result.add(value);
        }
        return result;
    }
}
