package org.fluentcodes.ihe.ebrs;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.*;

import java.util.*;
import java.util.stream.Collectors;

public class RegistryObject {
    private String id;
    private String status;
    private String objectType;
    private String lid;
    private String home;
    private VersionInfoType versionInfo;

    private List<LocalizedStringType> name;
    private List<LocalizedStringType> description;
    private Map<String, SlotWrapper> slotMap;
    private Map<String, ClassificationListWrapper> classificationMap;
    private Map<String, ExternalIdentifierListWrapper> externalIdentifierMap;


    public RegistryObject() {
        this.slotMap = new LinkedHashMap<>();
        this.classificationMap = new LinkedHashMap<>();
        this.externalIdentifierMap = new LinkedHashMap<>();
    }

    public RegistryObject(RegistryObjectType type) {
        this.slotMap = createSlotMap(type);
        this.classificationMap = createClassificationMap(type);
        this.externalIdentifierMap = createExternalIdentifierMap(type);

        this.name = type.getName().getLocalizedString();
        this.description = type.getDescription().getLocalizedString();

        this.id = type.getId();
        this.status = type.getLid();
        this.objectType = type.getObjectType();
        this.status = type.getStatus();
        this.home = type.getHome();
        versionInfo = type.getVersionInfo();
    }


    public boolean hasName() {
        return name!=null && !name.isEmpty();
    }

    public boolean hasDescription() {
        return description!=null && !description.isEmpty();
    }

    public boolean hasSlots() {
        return slotMap!=null && !slotMap.isEmpty();
    }
    public boolean hasClassifications() {
        return classificationMap!=null && !classificationMap.isEmpty();
    }
    public boolean hasExternalIdentifiers() {
        return externalIdentifierMap!=null && !externalIdentifierMap.isEmpty();
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public VersionInfoType getVersionInfo() {
        return versionInfo;
    }

    public void setVersionInfo(VersionInfoType versionInfo) {
        this.versionInfo = versionInfo;
    }


    public List<LocalizedStringType> getName() {
        return name;
    }

    public void setName(List<LocalizedStringType> name) {
        this.name = name;
    }

    public List<LocalizedStringType> getDescription() {
        return description;
    }

    public void setDescription(List<LocalizedStringType> description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }

    public Map<String, SlotWrapper> getSlotMap() {
        return slotMap;
    }

    public void setSlotMap(Map<String, SlotWrapper> slotMap) {
        this.slotMap = slotMap;
    }

    public Map<String, ClassificationListWrapper> getClassificationMap() {
        return classificationMap;
    }

    public void setClassificationMap(Map<String, ClassificationListWrapper> classificationMap) {
        this.classificationMap = classificationMap;
    }

    public Map<String, ExternalIdentifierListWrapper> getExternalIdentifierMap() {
        return externalIdentifierMap;
    }

    public void setExternalIdentifierMap(Map<String, ExternalIdentifierListWrapper> externalIdentifierMap) {
        this.externalIdentifierMap = externalIdentifierMap;
    }

    public SlotWrapper getSlotWrapper(String key) {
        if (!slotMap.containsKey(key)) {
            return new SlotWrapper(key);
        }
        return slotMap.get(key);
    }

    public String getSlotString(String key) {
        return getSlotWrapper(key).getString();
    }
    public Set<String> getSlotSet(String key) {
        return getSlotWrapper(key).getSet();
    }
    public RegistryObject setSlot(String key, String value) {
        SlotWrapper slot = new SlotWrapper(key, value);
        slotMap.put(key, slot);
        return this;
    }
    public RegistryObject setSlot(String key, Set<String> value) {
        SlotWrapper slot = new SlotWrapper(key, value);
        slotMap.put(key, slot);
        return this;
    }
    public RegistryObject setSlot(String key, List<List<String>> value) {
        SlotWrapper slot = new SlotWrapper(key, value);
        slotMap.put(key, slot);
        return this;
    }


    public void addType(RegistryObjectType parentType) {
        parentType.setId(getId());
        parentType.setLid(getLid());
        parentType.setObjectType(getObjectType());
        parentType.setStatus(getStatus());
        parentType.setVersionInfo(versionInfo);
        if (hasName()) {
            parentType.setName(IheHelper.OF_RIM.createInternationalStringType());
            parentType.getName().getLocalizedString().addAll(name);
        }
        if (hasDescription()) {
            parentType.setDescription(IheHelper.OF_RIM.createInternationalStringType());
            parentType.getDescription().getLocalizedString().addAll(description);
        }
        parentType.setVersionInfo(getVersionInfo());
        if (hasClassifications()) {
            for (ClassificationListWrapper classificationListWrapper: classificationMap.values()) {
                classificationListWrapper.addType(parentType);
            }
        }

        if (hasExternalIdentifiers()) {
            for (ExternalIdentifierListWrapper externalIdentifiers : externalIdentifierMap.values()) {
                externalIdentifiers.addType(parentType);
            }
        }

        if (hasSlots()) {
            for (String name : slotMap.keySet()) {
                SlotWrapper SlotWrapper = slotMap.get(name);
                if (SlotWrapper.isEmpty()) {
                    continue;
                }
                parentType.getSlot().addAll(SlotWrapper.createType());
            }
        }
    }


    public static Map<String, SlotWrapper> createSlotMap(RegistryObjectType parentObject) {
        Map<String, SlotWrapper> slotMap = new LinkedHashMap<>();
        List<SlotType1> SlotWrapper = parentObject.getSlot();
        for (SlotType1 slot: SlotWrapper) {
            if (slot.getValueList() == null) {
                continue;
            }
            List<String> value = slot.getValueList().getValue();

            if (value == null|| value.isEmpty()) {
                continue;
            }
            String name = slot.getName();
            if (name == null|| name.isEmpty()) {
                throw new IheException("Empty slotName");
            }
            if (!slotMap.containsKey(name)) {
                slotMap.put(name, new SlotWrapper(name));
            }
            slotMap.get(name).add(value);
        }
        return slotMap;
    }

    public static Map<String, ClassificationListWrapper> createClassificationMap (RegistryObjectType type) {
        return createClassificationMap(type
                .getClassification()
                .stream()
                .map(ClassificationWrapper::new)
                .collect(Collectors.toList()));
    }

    public static Map<String, ClassificationListWrapper> createClassificationMap (List<ClassificationWrapper> classifications) {
        Map<String,  ClassificationListWrapper> classificationMap = new HashMap<>();
        if (classifications == null||classifications.isEmpty()) {
            return classificationMap;
        }
        for (ClassificationWrapper classification: classifications) {
            String key = classification.getClassificationScheme();
            if (key == null) {
                if ( classification.getClassificationNode() != null) {
                    key = classification.getClassificationNode();
                }
                else {
                    key = "UNDEFINED";
                }
            }
            if (!classificationMap.containsKey(key)) {
                classificationMap.put(key, new ClassificationListWrapper(key));
            }
            classificationMap.get(key).add(classification);
        }
        return classificationMap;
    }

    public static Map<String, ExternalIdentifierListWrapper> createExternalIdentifierMap (RegistryObjectType type) {
        return createExternalIdentifierMap(type
                .getExternalIdentifier()
                .stream()
                .map(ExternalIdentifierWrapper::new)
                .collect(Collectors.toList()));
    }

    public static Map<String, ExternalIdentifierListWrapper> createExternalIdentifierMap (List<ExternalIdentifierWrapper> externalIdentifiers) {
        Map<String, ExternalIdentifierListWrapper> externalIdentifierMap = new HashMap<>();
        if (externalIdentifiers == null || externalIdentifiers.isEmpty()) {
            return externalIdentifierMap;
        }

        for (ExternalIdentifierWrapper externalIdentifier: externalIdentifiers) {
            if (externalIdentifier == null) {
                continue;
            }
            String key = externalIdentifier.getIdentificationScheme();
            if (key == null) {
                key = "UNDEFINED";
            }
            if (!externalIdentifierMap.containsKey(key)) {
                externalIdentifierMap.put(key, new ExternalIdentifierListWrapper(key));
            }
            externalIdentifierMap.get(key).add(externalIdentifier);
        }
        return externalIdentifierMap;
    }

}
