package org.fluentcodes.ihe.ebrs.metafields;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.fluentcodes.ihe.ebrs.IheException;
import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;

import java.lang.reflect.Constructor;
import java.util.HashSet;
import java.util.Set;

public class MetaFieldProperty {
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

    public MetaFieldProperty() {

    }
    public MetaFieldProperty(final String identifier, final Class<? extends MetaField> metaFieldClass) {
        this(identifier, metaFieldClass, RegistryObject.class);
    }

    public MetaFieldProperty(final String identifier, final Class<? extends MetaField> metaFieldClass, Class<? extends RegistryObject> parentClass) {
        this.identifier = identifier;
        this.name = identifier;
        this.metaFieldClassName = metaFieldClass.getName();
        setMetaFieldClass(metaFieldClass);
        this.parentClass = parentClass;
        this.parentClassName = parentClass.getName();
        parentClassName = parentClass.getName();
    }

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

    public String getMetaFieldClassName() {
        return metaFieldClassName;
    }

    private void setMetaFieldClass(Class metaFieldClass) {
        this.metaFieldClass = metaFieldClass;
        try {
            this.metaFieldConstructor = (Constructor<MetaField>) metaFieldClass.getConstructor(new Class[]{RegistryObject.class});
        } catch (NoSuchMethodException e) {
            throw new IheException("Could not find class " + metaFieldClassName);
        }
    }

    public void setMetaFieldClassName(String metaFieldClassName) {
        this.metaFieldClassName = metaFieldClassName;
        try {
            setMetaFieldClass(Class.forName(metaFieldClassName));
        } catch (ClassNotFoundException e) {
            throw new IheException("Could not find class " + metaFieldClassName);
        }
    }

    public MetaField createMetaField(RegistryObject parentObject) {
        try {
            return metaFieldConstructor.newInstance(parentObject);
        } catch (Exception e) {
            throw new IheException("Could instantiate" + metaFieldClassName, e);
        }
    }

    public Class<? extends RegistryObject> getParentClass() {
        return parentClass;
    }

    public String getParentClassName() {
        return parentClassName;
    }

    public void setParentClassName(String parentClassName) {
        this.parentClassName = parentClassName;
        try {
            parentClass = (Class<? extends RegistryObject>)Class.forName(parentClassName);
        } catch (ClassNotFoundException e) {
            throw new IheException("Could not find class " + parentClassName);
        }
    }
}
