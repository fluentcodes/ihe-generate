package org.fluentcodes.ihe.ebrs.metafields.registry;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.LocalizedStringType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.VersionInfoType;
import org.fluentcodes.ihe.ebrs.metafields.classifications.ClassificationRO;
import org.fluentcodes.ihe.ebrs.metafields.externalidentifiers.ExternalIdentifierRO;
import org.fluentcodes.ihe.ebrs.metafields.slots.SlotWrapper;

import java.util.List;

public interface RegistryObjectInterface<PARENT_TYPE, TYPE> extends Identifiable<PARENT_TYPE, TYPE> {
    boolean isStrict();

    RegistryObjectInterface addClassification(ClassificationRO classification);
    RegistryObjectInterface addExternalIdentifier(ExternalIdentifierRO externalIdentifier);

    VersionInfoType getVersionInfo();
    RegistryObjectInterface setVersionInfo(VersionInfoType versionInfo);


    boolean hasName();
    List<LocalizedStringType> getName();
    RegistryObjectInterface setName(List<LocalizedStringType> name);
    RegistryObjectInterface addName(LocalizedStringType entry);
    RegistryObjectInterface setName(String name);

    boolean hasDescription();
    List<LocalizedStringType> getDescription();
    RegistryObjectInterface setDescription(List<LocalizedStringType> description);

    String getStatus();
    RegistryObjectInterface setStatus(String status);

    String getObjectType();
    RegistryObjectInterface setObjectType(String objectType);

    String getLid();
    RegistryObjectInterface setLid(String lid);
}
