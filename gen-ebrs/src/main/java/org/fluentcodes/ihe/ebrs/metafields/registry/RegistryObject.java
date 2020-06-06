package org.fluentcodes.ihe.ebrs.metafields.registry;

import com.google.gson.annotations.Expose;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.fluentcodes.ihe.ebrs.IheException;
import org.fluentcodes.ihe.ebrs.metafields.MetaField;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldNamed;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldProperties;
import org.fluentcodes.ihe.ebrs.metafields.MetaFieldProperty;
import org.fluentcodes.ihe.ebrs.metafields.classifications.Classification;
import org.fluentcodes.ihe.ebrs.metafields.classifications.ClassificationWrapper;
import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.ExternalIdentifier;
import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.ExternalIdentifierWrapper;
import org.fluentcodes.ihe.ebrs.metafields.slots.SlotList;
import org.fluentcodes.ihe.ebrs.metafields.slots.SlotWrapper;

import java.util.*;

public class RegistryObject {
    private static final Logger LOG = LogManager.getLogger(RegistryObject.class);
    private static final MetaFieldProperties properties = new MetaFieldProperties();
    private static final String HOME = "home";
    private static final String ID = "id";
    private static final String LID = "lid";
    private static final String NAME = "name";
    private static final String DESCRIPTION = "description";
    private static final String STATUS = "status";
    private static final String OBJECT_TYPE = "objectType";
    private static final String VERSION_INFO = "versionInfo";

    @Expose(serialize = false, deserialize = false)
    Map<String, MetaField> metaFields = new LinkedHashMap<>();


    public RegistryObject() {
    }

    public RegistryObject(RegistryObjectType parentObject) {
        List<MetaFieldProperty> propertiesList = properties.getMetaFieldProperties(this);
        for (MetaFieldProperty property: propertiesList) {
            setMetaField(property, parentObject);
        }
        this.checkType(parentObject);
    }

    private static final Map<String, Class<? extends MetaField>> init() {
        Map<String, Class<? extends MetaField>> metaFieldClasses  = new LinkedHashMap<>();
        metaFieldClasses.put("id", ID.class);
        return metaFieldClasses;
    }

    protected boolean hasMetaField (final String key) {
        return metaFields.containsKey(key);
    }

    protected boolean hasMetaField (final MetaFieldProperty property) {
        return metaFields.containsKey(property.getIdentifier());
    }

    private void setMetaField(final MetaFieldProperty property) {
        if (!metaFields.containsKey(property.getIdentifier())) {
            MetaField metaField = property.createMetaField(this);
            metaFields.put(property.getIdentifier(), metaField);
        }
    }

    private void setMetaField(final String identifier) {
        setMetaField(identifier, true);
    }

    private void setMetaField(final String identifier, final boolean check) {
        if (!metaFields.containsKey(identifier)) {
            MetaFieldProperty property = properties.findProperty(identifier);
            if (property == null && check) {
                throw new IheException("No property found for '" + identifier + "'.");
            }
            MetaField metaField = property.createMetaField(this);
            if (metaField instanceof MetaFieldNamed) {
                ((MetaFieldNamed) metaField).setIdentifier(identifier);
            }
            metaFields.put(property.getIdentifier(), metaField);
        }
    }

    private MetaField getMetaField(final String identifier) {
        setMetaField(identifier);
        return metaFields.get(identifier);

    }

    protected Object getMetaFieldValue(final String identifier) {
        return getMetaField(identifier).get();
    }

    protected void setMetaField(final String identifier, final Object value) {
        try {
            setMetaField(identifier);
            metaFields.get(identifier).set(value);
        }
        catch (Exception e) {
            LOG.error("Could set value on a metafield without entry properties.", e);
        }
    }

    private void setMetaField(final MetaFieldProperty property, final RegistryObjectType parent) {
        setMetaField(property);
        metaFields.get(property.getIdentifier()).setFromParentType(parent);
    }

    private void setMetaField(final MetaFieldProperty property, final Object value) {
        setMetaField(property);
        metaFields.get(property.getIdentifier()).set(value);
    }

    public boolean hasName() {
        return hasMetaField(NAME);
    }

    public boolean hasDescription() {
        return hasMetaField(DESCRIPTION);
    }

    public String getHome() {
        return (String)getMetaFieldValue(HOME);
    }

    public void setHome(String home) {
        setMetaField(HOME, home);
    }

    public VersionInfoType getVersionInfo() {
        return (VersionInfoType) getMetaField(VERSION_INFO);
    }

    public RegistryObject setVersionInfo(VersionInfoType versionInfo) {
        setMetaField(VERSION_INFO, versionInfo);
        return this;
    }


    public List<LocalizedStringType> getName() {
        return (List<LocalizedStringType>)getMetaFieldValue(NAME);
    }

    public RegistryObject setName(List<LocalizedStringType> name) {
        setMetaField(NAME, name);
        return this;
    }

    public List<LocalizedStringType> getDescription() {
        return (List<LocalizedStringType>)getMetaFieldValue(DESCRIPTION);
    }

    public RegistryObject setDescription(List<LocalizedStringType> description) {
        setMetaField(DESCRIPTION, description);
        return this;
    }

    public String getId() {
        return (String)getMetaFieldValue(ID);
    }

    public RegistryObject setId(String id) {
        setMetaField(ID, id);
        return this;
    }

    public String getStatus() {
        return (String) getMetaFieldValue(STATUS);
    }

    public RegistryObject setStatus(String status) {
        setMetaField(STATUS, status);
        return this;
    }

    public String getObjectType() {
        return (String) getMetaFieldValue(OBJECT_TYPE);
    }

    public RegistryObject setObjectType(String objectType) {
        setMetaField(OBJECT_TYPE, objectType);
        return this;
    }

    public String getLid() {
        return (String)getMetaFieldValue(LID);
    }

    public RegistryObject setLid(String lid) {
        setMetaField(LID, lid);
        return this;
    }

    private void checkType(RegistryObjectType parentType) {
        if (parentType.getClassification()!=null) {
            for (ClassificationType classificationType : parentType.getClassification()) {
                String identifier = classificationType.getClassificationScheme();
                if (identifier == null) {
                    identifier = classificationType.getClassificationNode();
                }
                if (identifier == null) {
                    identifier = "NOT_SPECIFIED";
                }
                if (hasMetaField(identifier)) {  // already set by properties..
                    continue;
                }
                if (properties.isMetaFieldProperty(this, identifier)) {
                    continue;
                }
                addClassification(identifier, new ClassificationWrapper(classificationType));
            }
        }
        if (parentType.getExternalIdentifier()!=null) {
            for (ExternalIdentifierType externalIdentifier : parentType.getExternalIdentifier()) {
                String identifier = externalIdentifier.getIdentificationScheme();
                if (identifier == null) {
                    identifier = "NOT_SPECIFIED";
                }
                if (hasMetaField(identifier)) {  // already set by properties..
                    continue;
                }
                if (properties.isMetaFieldProperty(this, identifier)) {
                    continue;
                }
                addExternalIdentifier(identifier, new ExternalIdentifierWrapper(externalIdentifier));
            }
        }
        if (parentType.getSlot()!=null ) {
            for (SlotType1 slotType1 : parentType.getSlot()) {
                String identifier = slotType1.getName();
                if (identifier == null) {
                    identifier = "NOT_SPECIFIED";
                }
                if (hasMetaField(identifier)) {  // already set by properties..
                    continue;
                }
                if (properties.isMetaFieldProperty(this, identifier)) {
                    continue;
                }
                addSlot(identifier, new SlotWrapper(slotType1));
            }
        }
    }

    public RegistryObject addClassification(ClassificationWrapper classification) {
        String identifier = classification.getClassificationScheme();
        if (identifier == null) {
            identifier = classification.getClassificationNode();
        }
        if (identifier == null) {
            identifier = "NOT_SPECIFIED";
        }
        addClassification(identifier, classification);
        return this;
    }

    protected RegistryObject addClassification(final String identifier, final ClassificationWrapper classification) {
        if (!hasMetaField(identifier)) {  // already set by properties..
            Classification untypedClassification = new Classification(this);
            untypedClassification.setIdentifier(identifier);
            metaFields.put(identifier, untypedClassification);
        }
        ((Classification)getMetaField(identifier)).add(classification);
        return this;
    }

    public RegistryObject addExternalIdentifier(ExternalIdentifierWrapper externalIdentifier) {
        String identifier = externalIdentifier.getIdentificationScheme();
        if (identifier == null) {
            identifier = "NOT_SPECIFIED";
        }
        addExternalIdentifier(identifier, externalIdentifier);
        return this;
    }

    protected RegistryObject addExternalIdentifier(final String identifier, final ExternalIdentifierWrapper externalIdentifier) {
        if (!hasMetaField(identifier)) {  // already set by properties..
            ExternalIdentifier untypedExternalIdentifier = new ExternalIdentifier(this);
            untypedExternalIdentifier.setIdentifier(identifier);
            metaFields.put(identifier, untypedExternalIdentifier);
        }
        ((ExternalIdentifier)getMetaField(identifier)).add(externalIdentifier);
        return this;
    }

    public RegistryObject addSlot(final SlotWrapper slot) {
        String identifier = slot.getName();
        if (identifier == null) {
            identifier = "NOT_SPECIFIED";
        }
        addSlot(identifier, slot);
        return this;
    }

    protected RegistryObject addSlot(final String identifier, final SlotWrapper slot) {
        if (!hasMetaField(identifier)) {
            SlotList untypedSlot = new SlotList(this);
            untypedSlot.setIdentifier(identifier);
            metaFields.put(identifier, untypedSlot);
        }
        ((SlotList)getMetaField(identifier)).add(slot);
        return this;
    }

    public void addToParentType(RegistryObjectType parentType) {
        for (MetaField metaField: metaFields.values()) {
            metaField.addToParentType(parentType);
        }
    }

    public RegistryObjectType createType() {
        throw new IheException("Should be overwritten");
    }
}
