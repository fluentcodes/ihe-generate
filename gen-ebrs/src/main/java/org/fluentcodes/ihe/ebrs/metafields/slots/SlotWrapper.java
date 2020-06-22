package org.fluentcodes.ihe.ebrs.metafields.slots;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.SlotType1;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.ValueListType;
import org.fluentcodes.ihe.ebrs.EbXmlHelper;
import org.fluentcodes.ihe.ebrs.metafields.*;
import org.fluentcodes.ihe.ebrs.metafields.registry.Element;
import org.fluentcodes.ihe.ebrs.metafields.registry.NamedElement;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SlotWrapper extends ErrorListWrapper implements Element<RegistryObjectType, SlotType1>, NamedElement {
    private List<String> values;
    private MetaField metaField;

    public SlotWrapper(final SlotType1 type) {
        this(type, null);
    }

    public SlotWrapper(final SlotType1 type, RegistryObject parentRO) {
        super();
        String identifier = type.getName();
        if (identifier == null) {
            identifier = "NOT_SPECIFIED";
        }
        MetaField metaField = null;
        if (parentRO != null) {
            metaField = parentRO.getMetaField(identifier);
        }
        else {
            if (Properties.list.isMetaFieldProperty(identifier, parentRO)) {
                metaField = Properties.list.createMetaField(identifier, parentRO);
            }
            else {
                if (isStrict()) {
                    addError("Slot Identifier " + identifier + " not found as field for " + parentRO.getClass().getSimpleName());
                }
                metaField = RODefaultTypes.SLOT.createMetaField(identifier, parentRO);
            }
        }

        if (type.getValueList() != null) {
            this.values = type.getValueList().getValue();
            ((SlotMetaCommon)metaField).add(this);
            this.metaField = metaField;
        }
    }

    public SlotWrapper() {
        super();
        this.values = new ArrayList<>();
    }

    public void addFromParentType(RegistryObjectType registryObjectType, MetaField meta) {

    }

    public void addToParentType(RegistryObjectType registryObjectType) {

    }

    public SlotWrapper(final String name, String value) {
       this(name, List.of(value));
    }

    public SlotWrapper(final String name, Set<String> value) {
        this(name, value.stream().collect(Collectors.toList()));
    }

    public SlotWrapper(final String name, final List<String> values) {
        super();
        this.values = values;
        metaField = new SlotMetaList(name);
    }

    public SlotWrapper(SlotMetaCommon metaField, final List<String> values) {
        super();
        this.values = values;
        this.metaField = metaField;
    }

    public boolean isStrict() {
        return false;
    }

    public boolean isEmpty() {
        return values==null || values.isEmpty();
    }

    public String getMetaIdentifier() {
        if (metaField == null) {
            return null;
        }
        return metaField.getIdentifier();
    }
    public String getMetaName() {
        getMetaIdentifier();
    }

    public boolean hasParentObject() {
        return getParentObject() != null;
    }

    public RegistryObjectType getParentObject() {
        if (metaField == null) {
            return null;
        }
        return (RegistryObject)metaField.getParentObject();
    }

    public SlotType1 createType (){
        final SlotType1 slotType1 = EbXmlHelper.OF_RIM.createSlotType1();
        final ValueListType valueList = EbXmlHelper.OF_RIM.createValueListType();
        slotType1.setValueList(valueList);
        slotType1.setName(getMetaIdentifier());
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
}
