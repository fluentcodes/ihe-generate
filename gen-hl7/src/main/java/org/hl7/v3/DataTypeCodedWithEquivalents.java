
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeCodedWithEquivalents.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeCodedWithEquivalents"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="CE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeCodedWithEquivalents")
@XmlEnum
public enum DataTypeCodedWithEquivalents {

    CE;

    public String value() {
        return name();
    }

    public static DataTypeCodedWithEquivalents fromValue(String v) {
        return valueOf(v);
    }

}
