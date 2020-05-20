
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GastricRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GastricRoute"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="GBINJ"/&gt;
 *     &lt;enumeration value="GT"/&gt;
 *     &lt;enumeration value="NGT"/&gt;
 *     &lt;enumeration value="OGT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GastricRoute")
@XmlEnum
public enum GastricRoute {

    GBINJ,
    GT,
    NGT,
    OGT;

    public String value() {
        return name();
    }

    public static GastricRoute fromValue(String v) {
        return valueOf(v);
    }

}
