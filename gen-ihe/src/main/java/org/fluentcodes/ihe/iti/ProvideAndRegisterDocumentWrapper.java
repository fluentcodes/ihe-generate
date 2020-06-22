package org.fluentcodes.ihe.iti;

import ihe.iti.xds_b._2007.ProvideAndRegisterDocumentSetRequestType;
import org.fluentcodes.ihe.ebrs.metafields.associations.AssociationRO;
import org.fluentcodes.ihe.ebrs.metafields.extrinsicobjects.ExtrinsicObjectRO;
import org.fluentcodes.ihe.ebrs.metafields.registrypackages.RegistryPackageRO;

import java.util.Collection;
import java.util.Map;

public class ProvideAndRegisterDocumentWrapper {
    public Map<String, Collection<RegistryPackageRO>> submissionSets;
    public Map<String, Collection<ExtrinsicObjectRO>> documents;
    public Map<String, Collection<AssociationRO>> associations;

    public ProvideAndRegisterDocumentWrapper(ProvideAndRegisterDocumentSetRequestType type) {

    }
}
