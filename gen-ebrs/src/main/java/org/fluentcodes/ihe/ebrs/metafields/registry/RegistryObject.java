package org.fluentcodes.ihe.ebrs.metafields.registry;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    private MetaField addMetaField(final String identifier) {
        return addMetaField(identifier, true);
    }

    private MetaField addMetaField(final String identifier, final boolean check) {
        if (metaFields.containsKey(identifier)) {
            return metaFields.get(identifier);
        }
        try {
            MetaFieldProperty property = properties.findProperty(identifier);
            MetaField metaField = property.createMetaField(this);
            if (metaField instanceof MetaFieldNamed) {
                ((MetaFieldNamed) metaField).setIdentifier(identifier);
            }
            metaFields.put(property.getIdentifier(), metaField);
            return metaField;
        }
        catch (IheException e) {
            //if (check) {
                throw new IheException("No property found for '" + identifier + "'.");
            //}
        }
    }

    private MetaField getMetaField(final String identifier) {
        if (metaFields.containsKey(identifier)) {
            return metaFields.get(identifier);
        }
        return addMetaField(identifier);
    }

    protected Object getMetaFieldValue(final String identifier) {
        try {
            return getMetaField(identifier).get();
        }
        catch (IheException e) {
            LOG.error("Could set value on a metafield without entry properties.", e);
            return null;
        }
    }

    protected void setMetaFieldValue(final String identifier, final Object value) {
        try {
            getMetaField(identifier).set(value);
        }
        catch (IheException e) {
            LOG.error("Could set value on a metafield without entry properties.", e);
        }
    }

    private void setMetaField(final MetaFieldProperty property, final RegistryObjectType parent) {
        getMetaField(property.getIdentifier()).addFromParentType(parent);
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
        setMetaFieldValue(HOME, home);
    }

    @JsonIgnore
    public VersionInfoType getVersionInfo() {
        return (VersionInfoType) getMetaField(VERSION_INFO);
    }

    @JsonIgnore
    public RegistryObject setVersionInfo(VersionInfoType versionInfo) {
        setMetaFieldValue(VERSION_INFO, versionInfo);
        return this;
    }


    public List<LocalizedStringType> getName() {
        return (List<LocalizedStringType>)getMetaFieldValue(NAME);
    }

    public RegistryObject setName(List<LocalizedStringType> name) {
        setMetaFieldValue(NAME, name);
        return this;
    }

    public List<LocalizedStringType> getDescription() {
        return (List<LocalizedStringType>)getMetaFieldValue(DESCRIPTION);
    }

    public RegistryObject setDescription(List<LocalizedStringType> description) {
        setMetaFieldValue(DESCRIPTION, description);
        return this;
    }

    public String getId() {
        return (String)getMetaFieldValue(ID);
    }

    public RegistryObject setId(String id) {
        setMetaFieldValue(ID, id);
        return this;
    }

    public String getStatus() {
        return (String) getMetaFieldValue(STATUS);
    }

    public RegistryObject setStatus(String status) {
        setMetaFieldValue(STATUS, status);
        return this;
    }

    public String getObjectType() {
        return (String) getMetaFieldValue(OBJECT_TYPE);
    }

    public RegistryObject setObjectType(String objectType) {
        setMetaFieldValue(OBJECT_TYPE, objectType);
        return this;
    }

    public String getLid() {
        return (String)getMetaFieldValue(LID);
    }

    public RegistryObject setLid(String lid) {
        setMetaFieldValue(LID, lid);
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
        ((SlotList)addMetaField(identifier, false)).add(slot);
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
