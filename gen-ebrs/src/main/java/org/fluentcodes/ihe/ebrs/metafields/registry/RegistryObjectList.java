package org.fluentcodes.ihe.ebrs.metafields.registry;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.fluentcodes.ihe.ebrs.EbXmlHelper;
import org.fluentcodes.ihe.ebrs.metafields.ErrorListWrapper;
import org.fluentcodes.ihe.ebrs.metafields.MetaField;
import org.fluentcodes.ihe.ebrs.metafields.associations.AssociationRO;
import org.fluentcodes.ihe.ebrs.metafields.extrinsicobjects.ExtrinsicObjectRO;
import org.fluentcodes.ihe.ebrs.metafields.registrypackages.RegistryPackageRO;

import javax.xml.bind.JAXBElement;
import java.util.LinkedHashMap;
import java.util.Map;

public class RegistryObjectList extends ErrorListWrapper {
    private static final Logger LOG = LogManager.getLogger(RegistryObjectList.class);
    private MetaField metaField;

    private Map<String, RegistryObject>  list = new LinkedHashMap<>();

    public RegistryObjectList() {
        super();
    }
    public RegistryObjectList(RegistryObjectListType type) {
        super();
        addFromParentType(type);
    }

    protected void addFromParentType(RegistryObjectListType type) {
        for (JAXBElement<? extends IdentifiableType> identifiable: type.getIdentifiable()) {
            IdentifiableType identfiableType = identifiable.getValue();
            if (identfiableType instanceof RegistryPackageType) {
                list.put(identfiableType.getId(), new RegistryPackageRO((RegistryPackageType) identfiableType, null));
            }
            else if (identfiableType instanceof ExtrinsicObjectType) {
                list.put(identfiableType.getId(), new ExtrinsicObjectRO((ExtrinsicObjectType) identfiableType, null));
            }
            else if (identfiableType instanceof AssociationType1) {
                AssociationRO association = new AssociationRO((AssociationType1)identfiableType, null);
            }
            else {
                addError("Problem setting identifiable not supported " + identifiable.getClass().getSimpleName());
            }
        }
    }

    public RegistryObjectListType createType() {
        RegistryObjectListType type = EbXmlHelper.OF_RIM.createRegistryObjectListType();
        for (RegistryObject ro: list.values()) {
            if (ro instanceof RegistryPackageRO) {
                type.getIdentifiable().add(((RegistryPackageRO)ro).createElement());
            }
            else if (ro instanceof ExtrinsicObjectRO) {
                type.getIdentifiable().add(((ExtrinsicObjectRO)ro).createElement());
            }
            else if (ro instanceof AssociationRO) {
                type.getIdentifiable().add(((AssociationRO)ro).createElement());
            }
        }
        return type;
    }

}
