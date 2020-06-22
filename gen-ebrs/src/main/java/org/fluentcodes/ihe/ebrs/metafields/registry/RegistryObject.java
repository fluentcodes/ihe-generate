package org.fluentcodes.ihe.ebrs.metafields.registry;

import com.fasterxml.jackson.annotation.JsonIgnore;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.fluentcodes.ihe.ebrs.exceptions.EbXmlException;
import org.fluentcodes.ihe.ebrs.metafields.*;
import org.fluentcodes.ihe.ebrs.metafields.classifications.ClassificationMetaCommon;
import org.fluentcodes.ihe.ebrs.metafields.classifications.ClassificationRO;
import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.ExternalIdentifierMetaList;
import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.ExternalIdentifierRO;
import org.fluentcodes.ihe.ebrs.metafields.slots.SlotMetaCommon;
import org.fluentcodes.ihe.ebrs.metafields.slots.SlotWrapper;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class RegistryObject<TYPE extends RegistryObjectType> extends ErrorListWrapper implements RegistryObjectInterface<TYPE> {
    private static final Logger LOG = LogManager.getLogger(RegistryObject.class);
    private static final String HOME = "home";
    private static final String ID = "id";
    private static final String LID = "lid";
    private static final String NAME = "name";
    private static final String DESCRIPTION = "description";
    private static final String STATUS = "status";
    private static final String OBJECT_TYPE = "objectType";
    private static final String VERSION_INFO = "versionInfo";

    private MetaField metaField;

    @JsonIgnore
    private Map<String, MetaField> metaFields = new LinkedHashMap<>();

    public RegistryObject() {
        super();
    }

    public RegistryObject(MetaFieldROList metaField) {
        super();
        this.metaField = metaField;
        setId(metaField.getName() + "_" + metaField.getEntries().size());
    }

    @JsonIgnore
    public boolean isStrict() {
        return false;
    }

    public void addFromParentType(RegistryObjectType parentType, MetaField meta) {
        this.metaField = meta;
        if (meta!=null) {
            if (meta instanceof MetaFieldROList) {
                ((MetaFieldROList) meta).add(this);
            }
            else if (meta instanceof MetaFieldContainerList) {
                ((MetaFieldContainerList) meta).add(this);
            }
        }
        List<MetaFieldProperty> properties = Properties.list.getMetaFieldProperties(this);
        for (MetaFieldProperty property : properties) {
            addFromParentType(property, parentType);
        }
        if (parentType.getClassification() != null) {
            for (ClassificationType type : parentType.getClassification()) {
                new ClassificationRO(type, this);
            }
        }
        if (parentType.getExternalIdentifier() != null) {
            for (ExternalIdentifierType type : parentType.getExternalIdentifier()) {
                new ExternalIdentifierRO(type, this);
            }
        }
        if (parentType.getSlot() != null) {
            for (SlotType1 type : parentType.getSlot()) {
                new SlotWrapper(type, this);
            }
        }
    }

    public void addFromParentType(final MetaFieldProperty property, final RegistryObjectType parent) {
        getMetaField(property.getName()).addFromParentType(parent);
    }

    @JsonIgnore
    public MetaField getMetaField() {
        return metaField;
    }

    @JsonIgnore
    public String getMetaIdentifier() {
        if (metaField == null) {
            return null;
        }
        return metaField.getIdentifier();
    }

    @JsonIgnore
    public String getMetaName() {
        if (metaField == null) {
            return null;
        }
        return metaField.getName();
    }

    public boolean hasParentObject() {
        return getParentObject() != null;
    }

    @JsonIgnore
    public RegistryObjectInterface getParentObject() {
        if (metaField == null) {
            return null;
        }
        return (RegistryObjectInterface)metaField.getParentObject();
    }

    public boolean hasMetaField (final String key) {
        return metaFields.containsKey(key);
    }

    public MetaField addMetaField(final MetaField metaField) {
        if (metaFields.containsKey(metaField.getName())) {
            return metaFields.get(metaField.getName());
        }
        metaFields.put(metaField.getName(), metaField);
        return metaField;
    }

    public MetaField getMetaField(final String name) {
        return getMetaField(name, RODefaultTypes.SLOT);
    }

    public MetaField getMetaField(final String name, final RODefaultTypes metaType) {
        if (metaFields.containsKey(name)) {
            return metaFields.get(name);
        }
        MetaField metaField = null;
        if (Properties.list.isMetaFieldProperty(name, this)) {
            metaField = Properties.list.createMetaField(name, this);
        }
        else {
            if(isStrict()) {
                throw new EbXmlException("No name '" + name + "' found for parent class '" + this.getClass().getSimpleName() + "'");
            }
            metaField = metaType.createMetaField(name, this);
        }
        return metaField;
    }

    protected Object getMetaFieldValue(final String identifier) {
        try {
            return getMetaField(identifier).get();
        }
        catch (EbXmlException e) {
            LOG.error("Could get value on a metafield without entry properties.", e);
            return null;
        }
    }

    protected void setMetaFieldValue(final String identifier, final Object value) {
        try {
            getMetaField(identifier).set(value);
        }
        catch (EbXmlException e) {
            LOG.error("Could set value on a metafield without entry properties.", e);
        }
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
        return null;
        //return (VersionInfoType) getMetaField(VERSION_INFO);
    }

    @JsonIgnore
    public RegistryObject setVersionInfo(VersionInfoType versionInfo) {
        //setMetaFieldValue(VERSION_INFO, versionInfo);
        return this;
    }


    public List<LocalizedStringType> getName() {
        return (List<LocalizedStringType>)getMetaFieldValue(NAME);
    }

    public RegistryObject setName(List<LocalizedStringType> name) {
        setMetaFieldValue(NAME, name);
        return this;
    }

    public RegistryObject addName(LocalizedStringType entry) {
        List<LocalizedStringType> list = getName();
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(entry);
        setMetaFieldValue(NAME, list);
        return this;
    }

    @JsonIgnore
    public RegistryObject setName(String name) {
        LocalizedStringType localizedStringType = new LocalizedStringType();
        localizedStringType.setValue(name);
        addName(localizedStringType);
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

    public RegistryObject addClassification(ClassificationRO classification) {
        String identifier = classification.getClassificationScheme();
        if (identifier == null) {
            identifier = classification.getClassificationNode();
        }
        if (identifier == null) {
            identifier = "NOT_SPECIFIED";
        }
        ((ClassificationMetaCommon)getMetaField(identifier, RODefaultTypes.CLASSIFICATION)).add(classification);
        return this;
    }

    public RegistryObject addExternalIdentifier(ExternalIdentifierRO externalIdentifier) {
        String identifier = externalIdentifier.getIdentificationScheme();
        if (identifier == null) {
            identifier = "NOT_SPECIFIED";
        }
        ((ExternalIdentifierMetaList)getMetaField(identifier, RODefaultTypes.EXTERNAL_IDENTIFIER)).add(externalIdentifier);
        return this;
    }

    public RegistryObject addSlot(final SlotWrapper slot) {
        String identifier = slot.getMetaIdentifier();
        ((SlotMetaCommon) getMetaField(identifier)).add(slot);
        return this;
    }

    public void addToParentType(RegistryObjectType parentType) {
        for (MetaField metaField: metaFields.values()) {
            metaField.addToParentType(parentType);
        }
    }
}
