package org.fluentcodes.ihe.ebrs.metafields;

public class MetaFieldPropertyInfo {
    private final String identifier;
    private final String name;
    public MetaFieldPropertyInfo(final MetaFieldProperty property) {
        this.identifier = property.getIdentifier();
        this.name = property.getName();
    }
    public MetaFieldPropertyInfo(final String identifier) {
        this.identifier = identifier;
        this.name = identifier;
    }
    public MetaFieldPropertyInfo(final String identifier, final String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }
}
