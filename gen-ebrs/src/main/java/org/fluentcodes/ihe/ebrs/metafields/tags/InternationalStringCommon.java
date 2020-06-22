package org.fluentcodes.ihe.ebrs.metafields.tags;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.InternationalStringType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.LocalizedStringType;
import org.fluentcodes.ihe.ebrs.EbXmlHelper;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldROList;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.util.List;
import java.util.stream.Collectors;

public abstract class InternationalStringCommon<RESULT> extends MetaFieldROList<RESULT, LocalizedStringWrapper, LocalizedStringType> {

    public InternationalStringCommon(final RegistryObject parentRO) {
        super(parentRO);
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
        if (parent == null) {
            return;
        }
        for (LocalizedStringType stringType: parent.getLocalizedString()) {
            add(new LocalizedStringWrapper(stringType));
        }
    }

    public void setFromParentType(InternationalStringType parentRO) {
        reset();
        addFromParentType(parentRO);
    }

    public void addToParentType(InternationalStringType parentType) {
        if (parentType.getLocalizedString() == null) {
            return;
        }
        for (LocalizedStringWrapper wrapper: getEntries()) {
            parentType.getLocalizedString().add(wrapper.getValues());
        }
    }

    public InternationalStringType createType (){
        InternationalStringType type = EbXmlHelper.OF_RIM.createInternationalStringType();
        for (LocalizedStringWrapper wrapper: getEntries()) {
            type.getLocalizedString().add(wrapper.getValues());
        }
        return type;
    }
}
