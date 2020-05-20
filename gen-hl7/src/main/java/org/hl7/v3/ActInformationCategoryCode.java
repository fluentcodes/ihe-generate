
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActInformationCategoryCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInformationCategoryCode"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ALLGCAT"/&gt;
 *     &lt;enumeration value="COBSCAT"/&gt;
 *     &lt;enumeration value="DEMOCAT"/&gt;
 *     &lt;enumeration value="DICAT"/&gt;
 *     &lt;enumeration value="IMMUCAT"/&gt;
 *     &lt;enumeration value="LABCAT"/&gt;
 *     &lt;enumeration value="MEDCCAT"/&gt;
 *     &lt;enumeration value="RXCAT"/&gt;
 *     &lt;enumeration value="PSVCCAT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActInformationCategoryCode")
@XmlEnum
public enum ActInformationCategoryCode {

    ALLGCAT,
    COBSCAT,
    DEMOCAT,
    DICAT,
    IMMUCAT,
    LABCAT,
    MEDCCAT,
    RXCAT,
    PSVCCAT;

    public String value() {
        return name();
    }

    public static ActInformationCategoryCode fromValue(String v) {
        return valueOf(v);
    }

}
