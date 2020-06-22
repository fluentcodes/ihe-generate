package org.fluentcodes.ihe.ebrs.metafields;

import com.fasterxml.jackson.annotation.JsonIgnore;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;


public abstract class MetaFieldCommon<RESULT> extends ErrorListWrapper implements MetaField<RESULT, RegistryObject, RegistryObjectType> {
    private static final Logger LOG = LogManager.getLogger(MetaFieldCommon.class);
    @JsonIgnore
    private RegistryObject parentRO;
    @JsonIgnore
    private MetaFieldPropertyInfo metaFieldInfo;

    public MetaFieldCommon (final String identifier) {
        super();
        this.metaFieldInfo =  new MetaFieldPropertyInfo(identifier);
    }

    public MetaFieldCommon(final String identifier, final RegistryObject parentRO) {
        super();
        this.parentRO = parentRO;
        this.metaFieldInfo =  new MetaFieldPropertyInfo(identifier);
        if (parentRO!=null) {
            parentRO.addMetaField(this);
        }
    }

    public MetaFieldCommon(final RegistryObject parentRO) {
        super();
        this.parentRO = parentRO;
        this.metaFieldInfo = Properties.list.createMetaFieldInfo(this);
        if (parentRO!=null) {
            parentRO.addMetaField(this);
        }
    }

    @JsonIgnore
    public String getName() {
        if (metaFieldInfo == null) {
            return null;
        }
        return this.metaFieldInfo.getName();
    }

    @JsonIgnore
    public String getIdentifier() {
        if (metaFieldInfo == null) {
            return null;
        }
        return this.metaFieldInfo.getIdentifier();
    }

    @JsonIgnore
    public RegistryObject getParentObject() {
        return parentRO;
    }
}
