package org.fluentcodes.ihe.ebrs.metafields;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.fluentcodes.ihe.ebrs.exceptions.EbXmlException;
import org.fluentcodes.ihe.ebrs.exceptions.EbXmlInternalException;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.lang.reflect.Constructor;

public class MetaFieldProperty {
    private boolean specific;
    private String identifier;
    private String name;
    private String parentClassName;
    @JsonIgnore
    private Class<? extends RegistryObject> parentClass;
    private String metaFieldClassName;
    @JsonIgnore
    private Class<? extends MetaField> metaFieldClass;
    @JsonIgnore
    private Constructor<MetaField> metaFieldConstructor;
    private boolean generic = false;
    public MetaFieldProperty() {
        specific = true;
    }
    public MetaFieldProperty(final String identifier) {
        this.identifier = identifier;
    }
    public MetaFieldProperty(MetaFieldPropertyDTO dto) {
        this.identifier = dto.getIdentifier();
        this.name = dto.getName();
        this.metaFieldClassName = dto.getMetaFieldClassName();
        this.metaFieldClass = createMetaFieldClass(dto.getMetaFieldClassName());
        this.metaFieldConstructor = createMetaFieldConstructor(this.metaFieldClass);
        this.parentClassName = dto.getParentClassName();
        this.parentClass = createParentClass(dto.getParentClassName());

    }

    public MetaFieldProperty(final String identifier, final String metaFieldClassName) {
        this.identifier = identifier;
        this.name = this.identifier;
        this.metaFieldClassName = metaFieldClassName;
        this.parentClassName = RegistryObject.class.getName();
        generic = true;
        getMetaFieldClass();
    }

    protected MetaFieldProperty(final String identifier, final Class<? extends MetaField> metaFieldClass) {
        this(identifier, metaFieldClass, RegistryObject.class);
        specific = true;
    }

    protected MetaFieldProperty(final String identifier, final Class<? extends MetaField> metaFieldClass, Class<? extends RegistryObject> parentClass) {
        this.identifier = identifier;
        this.name = identifier;
        this.metaFieldClassName = metaFieldClass.getName();
        setMetaFieldClass(metaFieldClass);
        this.parentClass = parentClass;
        this.parentClassName = parentClass.getName();
        parentClassName = parentClass.getName();
        specific = true;
    }

    public boolean isSpecific() {
        return specific;
    }

    public String getIdentifier() {
        return identifier;
    }

    public MetaFieldProperty setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    public String getName() {
        if (name == null) {
            return identifier;
        }
        return name;
    }

    private Class<? extends MetaField> createMetaFieldClass(final String metaFieldClassName) {
        if (metaFieldClassName == null) {
            throw new EbXmlInternalException("Could not find meta field class name for " + name);
        }
        try {
            return (Class<? extends MetaField>)Class.forName(metaFieldClassName);
        } catch (Exception e) {
            throw new EbXmlInternalException("Could not find class " + metaFieldClassName);
        }
    }

    public Class<? extends MetaField> getMetaFieldClass() {
        if (metaFieldClass == null) {
            setMetaFieldClass(createMetaFieldClass(getMetaFieldClassName()));
        }
        return (Class<? extends MetaField>) metaFieldClass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMetaFieldClassName() {
        return metaFieldClassName;
    }

    private Constructor<MetaField> createMetaFieldConstructor(Class metaFieldClass) {
        try {
            return (Constructor<MetaField>) metaFieldClass.getConstructor(new Class[]{RegistryObject.class});
        } catch (NoSuchMethodException e) {
            throw new EbXmlException("Could not create constructor for with parameter class 'RegistryObject' for '" + metaFieldClassName + "'.");
        }
    }

    private void setMetaFieldClass(Class metaFieldClass) {
        this.metaFieldClass = metaFieldClass;
        try {
            this.metaFieldConstructor = (Constructor<MetaField>) metaFieldClass.getConstructor(new Class[]{RegistryObject.class});
        } catch (NoSuchMethodException e) {
            throw new EbXmlException("Could not create constructor for with parameter class 'RegistryObject' for '" + metaFieldClassName + "'.");
        }
    }

    public void setMetaFieldClassName(String metaFieldClassName) {
        this.metaFieldClassName = metaFieldClassName;
    }

    public MetaField createMetaFieldInstance(RegistryObject parentRO) {
        try {
            return metaFieldConstructor.newInstance(parentRO);
        } catch (Exception e) {
            throw new EbXmlException("Could not instantiate " + metaFieldClassName, e);
        }
    }

    public Class<? extends RegistryObject> createParentClass(final String parentClassName) {
        if (parentClassName == null) {
            throw new EbXmlInternalException("Problem getting parent class name for " + name);
        }
        try {
            return (Class<? extends RegistryObject>) Class.forName(parentClassName);
        } catch (ClassNotFoundException e) {
            throw new EbXmlInternalException("Could not find class " + parentClassName);
        }
    }


    public Class<? extends RegistryObject> getParentClass() {
        if (parentClass == null) {
            parentClass = createParentClass(parentClassName);
        }
        return parentClass;
    }

    public String getParentClassName() {
        return parentClassName;
    }

    public void setParentClassName(String parentClassName) {
        this.parentClassName = parentClassName;
    }
}
