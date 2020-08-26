
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CombinedPharmacyOrderSuspendReasonCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CombinedPharmacyOrderSuspendReasonCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="HOSPADM"/&gt;
 *     &lt;enumeration value="SALG"/&gt;
 *     &lt;enumeration value="SDDI"/&gt;
 *     &lt;enumeration value="DRUGHIGH"/&gt;
 *     &lt;enumeration value="SDUPTHER"/&gt;
 *     &lt;enumeration value="SINTOL"/&gt;
 *     &lt;enumeration value="LABINT"/&gt;
 *     &lt;enumeration value="PREG"/&gt;
 *     &lt;enumeration value="NON-AVAIL"/&gt;
 *     &lt;enumeration value="SURG"/&gt;
 *     &lt;enumeration value="CLARIF"/&gt;
 *     &lt;enumeration value="ALTCHOICE"/&gt;
 *     &lt;enumeration value="WASHOUT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CombinedPharmacyOrderSuspendReasonCode")
@XmlEnum
public enum CombinedPharmacyOrderSuspendReasonCode {

    HOSPADM("HOSPADM"),
    SALG("SALG"),
    SDDI("SDDI"),
    DRUGHIGH("DRUGHIGH"),
    SDUPTHER("SDUPTHER"),
    SINTOL("SINTOL"),
    LABINT("LABINT"),
    PREG("PREG"),
    @XmlEnumValue("NON-AVAIL")
    NON_AVAIL("NON-AVAIL"),
    SURG("SURG"),
    CLARIF("CLARIF"),
    ALTCHOICE("ALTCHOICE"),
    WASHOUT("WASHOUT");
    private final String value;

    CombinedPharmacyOrderSuspendReasonCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CombinedPharmacyOrderSuspendReasonCode fromValue(String v) {
        for (CombinedPharmacyOrderSuspendReasonCode c: CombinedPharmacyOrderSuspendReasonCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
