
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeOrganizationName.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeOrganizationName"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeOrganizationName")
@XmlEnum
public enum DataTypeOrganizationName {

    ON;

    public String value() {
        return name();
    }

    public static DataTypeOrganizationName fromValue(String v) {
        return valueOf(v);
    }

}
