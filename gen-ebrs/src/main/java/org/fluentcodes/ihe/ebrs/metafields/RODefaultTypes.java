package org.fluentcodes.ihe.ebrs.metafields;

import org.fluentcodes.ihe.ebrs.exceptions.EbXmlInternalException;
import org.fluentcodes.ihe.ebrs.metafields.classifications.ClassificationMetaList;
import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.ExternalIdentifierMetaList;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;
import org.fluentcodes.ihe.ebrs.metafields.slots.SlotMetaListList;

import java.lang.reflect.Constructor;

public enum RODefaultTypes {
    SLOT(SlotMetaListList.class), CLASSIFICATION(ClassificationMetaList.class), EXTERNAL_IDENTIFIER(ExternalIdentifierMetaList.class);
    private Constructor<MetaField> namedMetaFieldConstructor;

    RODefaultTypes(final Class<? extends MetaField> metaFieldClass) {
        try {
            namedMetaFieldConstructor =  (Constructor<MetaField>) metaFieldClass.getConstructor(new Class[]{String.class, RegistryObject.class});
        } catch (NoSuchMethodException e) {
            throw new EbXmlInternalException("Could not create constructor for with parameter class 'String' and 'RegistryObject' for '" + metaFieldClass.getSimpleName() + "'.");
        }
    }

    public MetaField  createMetaField(final String name, final RegistryObject parentRO) {
        try {
            return namedMetaFieldConstructor.newInstance(name, parentRO);
        } catch (Exception e) {
            throw new EbXmlInternalException("Could not instantiate constructor for with parameter class 'RegistryObject' for '" + name + "'.");
        }
    }
}
