
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_RoleClassCoverage.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_RoleClassCoverage"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="SPNSR"/&gt;
 *     &lt;enumeration value="COVPTY"/&gt;
 *     &lt;enumeration value="POLHOLD"/&gt;
 *     &lt;enumeration value="UNDWRT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_RoleClassCoverage")
@XmlEnum
public enum XRoleClassCoverage {

    SPNSR,
    COVPTY,
    POLHOLD,
    UNDWRT;

    public String value() {
        return name();
    }

    public static XRoleClassCoverage fromValue(String v) {
        return valueOf(v);
    }

}
