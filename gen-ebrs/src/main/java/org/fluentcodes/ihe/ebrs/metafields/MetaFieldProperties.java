package org.fluentcodes.ihe.ebrs.metafields;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.fluentcodes.ihe.ebrs.exceptions.EbXmlException;
import org.fluentcodes.ihe.ebrs.metafields.classifications.*;
import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.ExternalIdentifierRO;
import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.IdentificationScheme;
import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.RegistryObjectAttribute;
import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.Value;
import org.fluentcodes.ihe.ebrs.metafields.extrinsicobjects.ExtrinsicObjectRO;
import org.fluentcodes.ihe.ebrs.metafields.extrinsicobjects.MimeType;
import org.fluentcodes.ihe.ebrs.metafields.registry.*;
import org.fluentcodes.ihe.ebrs.metafields.tags.DescriptionList;
import org.fluentcodes.ihe.ebrs.metafields.tags.NameList;
import org.fluentcodes.tools.xpect.IOJsonJackson;
import org.fluentcodes.tools.xpect.IORuntimeException;

import java.util.*;
import java.util.stream.Collectors;

public class MetaFieldProperties {
    private static final Logger LOG = LogManager.getLogger(MetaFieldProperties.class);
    public static final String FILE_NAME = "MetaFieldProperties.json";

    private final List<MetaFieldProperty> metaFieldProperties;
    private final Map<String, MetaFieldProperty> namePropertyMap;
    private final Map<Class <? extends RegistryObject>, List<String>> roClassNameMap;
    private final Map<Class <? extends RegistryObject>, List<MetaFieldProperty>> roClassPropertyMap ;
    private final Map<Class <? extends MetaField>, MetaFieldProperty> mfClassPropertyMap;

    protected MetaFieldProperties() {
        namePropertyMap = new HashMap<>();
        metaFieldProperties = new ArrayList<>();
        roClassNameMap = new HashMap<>();
        roClassPropertyMap = new HashMap<>();
        mfClassPropertyMap = new HashMap<>();

        metaFieldProperties.add(new MetaFieldProperty("id", ID.class));
        metaFieldProperties.add(new MetaFieldProperty("lid", LID.class));
        metaFieldProperties.add(new MetaFieldProperty("home", Home.class));
        metaFieldProperties.add(new MetaFieldProperty("status", Status.class));
        metaFieldProperties.add(new MetaFieldProperty("objectType", ObjectType.class));
        metaFieldProperties.add(new MetaFieldProperty("name", NameList.class));
        metaFieldProperties.add(new MetaFieldProperty("description", DescriptionList.class));
        metaFieldProperties.add(new MetaFieldProperty("classificationNode", ClassificationNode.class, ClassificationRO.class));
        metaFieldProperties.add(new MetaFieldProperty("classificationScheme", ClassificationScheme.class, ClassificationRO.class));
        metaFieldProperties.add(new MetaFieldProperty("nodeRepresentation", NodeRepresentation.class, ClassificationRO.class));
        metaFieldProperties.add(new MetaFieldProperty("classifiedObject", ClassifiedObject.class, ClassificationRO.class));
        metaFieldProperties.add(new MetaFieldProperty("value", Value.class, ExternalIdentifierRO.class));
        metaFieldProperties.add(new MetaFieldProperty("registryObject", RegistryObjectAttribute.class, ExternalIdentifierRO.class));
        metaFieldProperties.add(new MetaFieldProperty("identificationScheme", IdentificationScheme.class, ExternalIdentifierRO.class));
        metaFieldProperties.add(new MetaFieldProperty("mimeType", MimeType.class, ExtrinsicObjectRO.class));
        try {
            List<MetaFieldPropertyDTO> properties = new IOJsonJackson<List<MetaFieldProperty>>()
                    .setMappingClasses(Arrays.asList(new Class[]{List.class, MetaFieldPropertyDTO.class}))
                    .setFileName(FILE_NAME)
                    .readList();
            if (properties != null) {
                for (MetaFieldPropertyDTO property : properties) {
                    if (property == null) {
                        continue;
                    }
                    metaFieldProperties.add(new MetaFieldProperty(property));
                }
            }
        }
        catch (IORuntimeException e) {
            if (e.getMessage().contains("JsonMappingException")) {
                    throw e;
            }
            LOG.info("No configuration files found");
        }

        final Map<Class <? extends RegistryObject>, List<String>> roTempMap = new HashMap<>();
        for (MetaFieldProperty property : metaFieldProperties) {
            namePropertyMap.put(property.getName(), property);
            mfClassPropertyMap.put(property.getMetaFieldClass(), property);
            if (!roTempMap.containsKey(property.getParentClass())) {
                roTempMap.put(property.getParentClass(), new ArrayList<>());
            }
            roTempMap.get(property.getParentClass()).add(property.getName());
        }
        for (Class <? extends RegistryObject> registryClass: roTempMap.keySet()) {
            boolean isRegistryRoot = registryClass == RegistryObject.class;
            roClassNameMap.put(registryClass, roTempMap.get(registryClass));
            if (isRegistryRoot) {
                continue;
            }
            Class <? extends RegistryObject> superClass =  (Class<? extends RegistryObject>) registryClass.getSuperclass();
            while (!isRegistryRoot) {
                if (roTempMap.containsKey(superClass)) {
                    roClassNameMap.get(registryClass).addAll(roTempMap.get(superClass));
                }
                superClass = (Class<? extends RegistryObject>) superClass.getSuperclass();
                isRegistryRoot = superClass != RegistryObject.class;

            }
        }
        for (Class<? extends RegistryObject> parentClass : roClassNameMap.keySet()) {
            List<MetaFieldProperty> metaFieldProperties = new ArrayList<>();
            for (String identifier: roClassNameMap.get(parentClass)) {
                metaFieldProperties.add(namePropertyMap.get(identifier));
            }
            roClassPropertyMap.put(parentClass, metaFieldProperties);
        }
    }

    public List<MetaFieldProperty> getMetaFieldProperties(RegistryObject registryObject) {
        return  getMetaFieldProperties(registryObject.getClass());
    }

    protected List<MetaFieldProperty> getMetaFieldProperties(Class<? extends RegistryObject> registryObjectClass) {
        if (roClassPropertyMap.get(registryObjectClass) == null) {
            return new ArrayList<>();
        }
        return roClassPropertyMap.get(registryObjectClass).stream().collect(Collectors.toList());
    }

    public boolean isMetaFieldProperty(final String identifier, RegistryObject parentRO) {
        if (!namePropertyMap.containsKey(identifier)) {
            return false;
        }
        Class parentROClass = parentRO.getClass();
        if (roClassNameMap.get(parentROClass) == null) {
            Class superClass = parentROClass.getSuperclass();
            while (superClass != RegistryObject.class && roClassNameMap.get(superClass) == null) {
                superClass = superClass.getSuperclass();
            }
            if ( roClassNameMap.get(superClass) == null) {
                return false;
            }
            roClassNameMap.put(parentROClass, roClassNameMap.get(superClass));
            return roClassNameMap.get(superClass).contains(identifier);
        }
        else {
            return roClassNameMap.get(parentRO.getClass()).contains(identifier);
        }
    }

    protected MetaFieldPropertyInfo createMetaFieldInfo(MetaField metaField) {
        if (metaField == null) {
            throw new EbXmlException("metafield is null.");
        }
        return new MetaFieldPropertyInfo(findProperty(metaField.getClass()));
    }

    protected MetaFieldProperty findProperty(MetaField metaField) {
        if (metaField == null) {
            throw new EbXmlException("metafield is null.");
        }
        return findProperty(metaField.getClass());
    }

    private MetaFieldProperty findProperty(Class<? extends MetaField> mfClass) {
        MetaFieldProperty property = mfClassPropertyMap.get(mfClass);
        if (property == null) {
            throw new EbXmlException("Could not find property for '" + mfClass.getSimpleName() + "'.");
        }
        return property;
    }

    public MetaFieldProperty findProperty(final String identifier) {
        MetaFieldProperty property = namePropertyMap.get(identifier);
        if (property == null) {
            property = new MetaFieldProperty(identifier);
        }
        return property;
    }

    public MetaField createMetaField(final String name, RegistryObject parent) {
        MetaFieldProperty property = namePropertyMap.get(name);
        if (property == null) {
            throw new EbXmlException("Could not find property with name '" + name + "' for parent object '" + parent.getClass().getSimpleName() + "' set to strict naming check.");
        }
        return property.createMetaFieldInstance(parent);
    }

    public String findName(final String identifier) {
        return findProperty(identifier).getName();
    }

    public String findIdentifer(final MetaField metaField) {
        return findProperty(metaField).getIdentifier();
    }

    public String findName(final MetaField metaField) {
        return findProperty(metaField).getName();
    }


}
