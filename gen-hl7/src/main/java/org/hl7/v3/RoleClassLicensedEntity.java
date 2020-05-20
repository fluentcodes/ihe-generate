
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RoleClassLicensedEntity.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassLicensedEntity"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="LIC"/&gt;
 *     &lt;enumeration value="PROV"/&gt;
 *     &lt;enumeration value="NOT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoleClassLicensedEntity")
@XmlEnum
public enum RoleClassLicensedEntity {

    LIC,
    PROV,
    NOT;

    public String value() {
        return name();
    }

    public static RoleClassLicensedEntity fromValue(String v) {
        return valueOf(v);
    }

}
