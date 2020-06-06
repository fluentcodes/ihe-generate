package org.fluentcodes.ihe.ebrs.metafields;

import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;
import org.fluentcodes.ihe.ebrs.metafields.registry.*;
import org.fluentcodes.ihe.ebrs.metafields.classifications.*;
import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.ExternalIdentifierWrapper;
import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.IdentificationScheme;
import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.RegistryObjectAttribute;
import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.Value;
import org.fluentcodes.tools.xpect.IOJsonGson;
import org.fluentcodes.tools.xpect.IOJsonJackson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetaFieldProperties {
    private final static List<MetaFieldProperty> metaFieldProperties = init();
    private final static Map<String, MetaFieldProperty> nameMap = initNameMap();
    private final static Map<Class <? extends RegistryObject>, List<String>> classNameMap = initClassNameMap();
    private final static Map<Class <? extends RegistryObject>, List<MetaFieldProperty>> classPropertyMap = initClassPropertyMap();

    private static final List<MetaFieldProperty> init() {
        List<MetaFieldProperty> metaFieldProperties = new ArrayList<>();
        metaFieldProperties.add(new MetaFieldProperty("id", ID.class));
        metaFieldProperties.add(new MetaFieldProperty("lid", LID.class));
        metaFieldProperties.add(new MetaFieldProperty("home", Home.class));
        metaFieldProperties.add(new MetaFieldProperty("status", Status.class));
        metaFieldProperties.add(new MetaFieldProperty("objectType", ObjectType.class));
        metaFieldProperties.add(new MetaFieldProperty("classificationNode", ClassificationNode.class, ClassificationWrapper.class));
        metaFieldProperties.add(new MetaFieldProperty("classificationScheme", ClassificationScheme.class, ClassificationWrapper.class));
        metaFieldProperties.add(new MetaFieldProperty("nodeRepresentation", NodeRepresentation.class, ClassificationWrapper.class));
        metaFieldProperties.add(new MetaFieldProperty("classifiedObject", ClassifiedObject.class, ClassificationWrapper.class));
        metaFieldProperties.add(new MetaFieldProperty("value", Value.class, ExternalIdentifierWrapper.class));
        metaFieldProperties.add(new MetaFieldProperty("registryObject", RegistryObjectAttribute.class, ExternalIdentifierWrapper.class));
        metaFieldProperties.add(new MetaFieldProperty("identificationScheme", IdentificationScheme.class, ExternalIdentifierWrapper.class));
        List<MetaFieldProperty> properties = new IOJsonJackson<List<MetaFieldProperty>>()
                .setMappingClasses(List.of(List.class, MetaFieldProperty.class))
                .setFileName("MetaFieldProperties.json")
                .readList();
        if (properties!=null) {
            for (MetaFieldProperty property: properties) {
                if (property == null) {
                    continue;
                }
                metaFieldProperties.add(property);
            }
        }
        return metaFieldProperties;
    }

    private static final Map<String, MetaFieldProperty> initNameMap() {
        Map<String, MetaFieldProperty> nameMap = new HashMap<>();
        for (MetaFieldProperty property : metaFieldProperties) {
            nameMap.put(property.getIdentifier(), property);
        }
        return nameMap;
    }

    private static final  Map<Class <? extends RegistryObject>, List<String>> initClassNameMap() {
        Map<Class <? extends RegistryObject>, List<String>> classNameMap = new HashMap<>();
        for (MetaFieldProperty property : metaFieldProperties) {
            if (!classNameMap.containsKey(property.getParentClass())) {
                classNameMap.put(property.getParentClass(), new ArrayList<>());
            }
            classNameMap.get(property.getParentClass()).add(property.getIdentifier());
        }
        for (Class <? extends RegistryObject> registryClass: classNameMap.keySet()) {
            boolean isRegistryRoot = registryClass.getSuperclass() != RegistryObject.class;
            if (!isRegistryRoot) {
                Class <? extends RegistryObject> superClass =  (Class<? extends RegistryObject>) registryClass.getSuperclass();
                while (!isRegistryRoot) {
                    if (classNameMap.containsKey(superClass)) {
                        classNameMap.get(registryClass).addAll(classNameMap.get(superClass));
                    }
                    superClass = (Class<? extends RegistryObject>) superClass.getSuperclass();
                    isRegistryRoot = superClass != RegistryObject.class;

                }
            }

        }
        return classNameMap;
    }

    private static final  Map<Class <? extends RegistryObject>, List<MetaFieldProperty>> initClassPropertyMap() {
        Map<Class <? extends RegistryObject>, List<MetaFieldProperty>> classPropertyMap = new HashMap<>();
        for (Class<? extends RegistryObject> parentClass : classNameMap.keySet()) {
            List<MetaFieldProperty> metaFieldProperties = new ArrayList<>();
            for (String identifier: classNameMap.get(parentClass)) {
                metaFieldProperties.add(nameMap.get(identifier));
            }
            classPropertyMap.put(parentClass, metaFieldProperties);
        }
        return classPropertyMap;
    }

    public static List<MetaFieldProperty> getMetaFieldProperties() {
        return metaFieldProperties;
    }

    public static List<MetaFieldProperty> getMetaFieldProperties(RegistryObject registryObject) {
        return classPropertyMap.get(registryObject.getClass());
    }

    public static boolean isMetaFieldProperty(RegistryObject registryObject, final String identifier) {
        if (!nameMap.containsKey(identifier)) {
            return false;
        }
        return classNameMap.get(registryObject.getClass()).contains(registryObject);
    }

    public static MetaFieldProperty findProperty(final String identifier) {
        return nameMap.get(identifier);
    }

}
