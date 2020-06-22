package org.fluentcodes.ihe.ebrs.metafields;

public class MetaFieldPropertyDTO {
    private String identifier;
    private String name;
    private String parentClassName;
    private String metaFieldClassName;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentClassName() {
        return parentClassName;
    }

    public void setParentClassName(String parentClassName) {
        this.parentClassName = parentClassName;
    }

    public String getMetaFieldClassName() {
        return metaFieldClassName;
    }

    public void setMetaFieldClassName(String metaFieldClassName) {
        this.metaFieldClassName = metaFieldClassName;
    }
}
