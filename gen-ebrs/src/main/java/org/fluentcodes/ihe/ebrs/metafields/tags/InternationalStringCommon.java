package org.fluentcodes.ihe.ebrs.metafields.tags;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.InternationalStringType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.LocalizedStringType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.SlotType1;
import org.fluentcodes.ihe.ebrs.IheHelper;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldRegistryObjectList;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;
import org.fluentcodes.ihe.ebrs.metafields.slots.SlotWrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class InternationalStringCommon<RESULT> extends MetaFieldRegistryObjectList<LocalizedStringWrapper, RESULT> {
    public InternationalStringCommon(RegistryObject parentObject) {
        super(parentObject);
    }

    public void setValues(List<LocalizedStringType> values) {
        for (LocalizedStringType value:values) {
            add(new LocalizedStringWrapper(value));
        }
    }
    public List<LocalizedStringType> getValues() {
        return getEntries().stream().map(x->x.getValues()).collect(Collectors.toList());
    }

    public void addFromParentType(InternationalStringType parent) {
        for (LocalizedStringType stringType: parent.getLocalizedString()) {
            add(new LocalizedStringWrapper(stringType));
        }
    }

    public void setFromParentType(InternationalStringType parentObject) {
        reset();
        addFromParentType(parentObject);
    }

    public void addToParentType(InternationalStringType parentObject) {
        if (parentObject.getLocalizedString() == null) {
            return;
        }
        for (LocalizedStringWrapper wrapper: getEntries()) {
            parentObject.getLocalizedString().add(wrapper.getValues());
        }
    }

    public InternationalStringType createType (){
        InternationalStringType type = IheHelper.OF_RIM.createInternationalStringType();
        for (LocalizedStringWrapper wrapper: getEntries()) {
            type.getLocalizedString().add(wrapper.getValues());
        }
        return type;
    }
}
