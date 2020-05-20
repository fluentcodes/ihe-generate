
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObservationSocioEconomicStatusValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationSocioEconomicStatusValue"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="SOECSTAT"/&gt;
 *     &lt;enumeration value="ABUSE"/&gt;
 *     &lt;enumeration value="HMLESS"/&gt;
 *     &lt;enumeration value="ILGIM"/&gt;
 *     &lt;enumeration value="INCAR"/&gt;
 *     &lt;enumeration value="PROB"/&gt;
 *     &lt;enumeration value="REFUG"/&gt;
 *     &lt;enumeration value="UNEMPL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObservationSocioEconomicStatusValue")
@XmlEnum
public enum ObservationSocioEconomicStatusValue {

    SOECSTAT,
    ABUSE,
    HMLESS,
    ILGIM,
    INCAR,
    PROB,
    REFUG,
    UNEMPL;

    public String value() {
        return name();
    }

    public static ObservationSocioEconomicStatusValue fromValue(String v) {
        return valueOf(v);
    }

}
