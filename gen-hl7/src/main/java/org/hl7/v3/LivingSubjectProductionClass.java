
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LivingSubjectProductionClass.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LivingSubjectProductionClass"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="BF"/&gt;
 *     &lt;enumeration value="BR"/&gt;
 *     &lt;enumeration value="BL"/&gt;
 *     &lt;enumeration value="CO"/&gt;
 *     &lt;enumeration value="DA"/&gt;
 *     &lt;enumeration value="DR"/&gt;
 *     &lt;enumeration value="DU"/&gt;
 *     &lt;enumeration value="FI"/&gt;
 *     &lt;enumeration value="LY"/&gt;
 *     &lt;enumeration value="MT"/&gt;
 *     &lt;enumeration value="MU"/&gt;
 *     &lt;enumeration value="PL"/&gt;
 *     &lt;enumeration value="RC"/&gt;
 *     &lt;enumeration value="SH"/&gt;
 *     &lt;enumeration value="VL"/&gt;
 *     &lt;enumeration value="WL"/&gt;
 *     &lt;enumeration value="WO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LivingSubjectProductionClass")
@XmlEnum
public enum LivingSubjectProductionClass {

    BF,
    BR,
    BL,
    CO,
    DA,
    DR,
    DU,
    FI,
    LY,
    MT,
    MU,
    PL,
    RC,
    SH,
    VL,
    WL,
    WO;

    public String value() {
        return name();
    }

    public static LivingSubjectProductionClass fromValue(String v) {
        return valueOf(v);
    }

}
