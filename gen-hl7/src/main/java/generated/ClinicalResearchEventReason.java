
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ClinicalResearchEventReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ClinicalResearchEventReason"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="RET"/&gt;
 *     &lt;enumeration value="SCH"/&gt;
 *     &lt;enumeration value="TRM"/&gt;
 *     &lt;enumeration value="UNS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClinicalResearchEventReason")
@XmlEnum
public enum ClinicalResearchEventReason {

    RET,
    SCH,
    TRM,
    UNS;

    public String value() {
        return name();
    }

    public static ClinicalResearchEventReason fromValue(String v) {
        return valueOf(v);
    }

}
