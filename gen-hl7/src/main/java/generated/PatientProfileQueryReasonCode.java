
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PatientProfileQueryReasonCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PatientProfileQueryReasonCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ADMREV"/&gt;
 *     &lt;enumeration value="PATCAR"/&gt;
 *     &lt;enumeration value="PATREQ"/&gt;
 *     &lt;enumeration value="PRCREV"/&gt;
 *     &lt;enumeration value="REGUL"/&gt;
 *     &lt;enumeration value="RSRCH"/&gt;
 *     &lt;enumeration value="LEGAL"/&gt;
 *     &lt;enumeration value="VALIDATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PatientProfileQueryReasonCode")
@XmlEnum
public enum PatientProfileQueryReasonCode {

    ADMREV,
    PATCAR,
    PATREQ,
    PRCREV,
    REGUL,
    RSRCH,
    LEGAL,
    VALIDATION;

    public String value() {
        return name();
    }

    public static PatientProfileQueryReasonCode fromValue(String v) {
        return valueOf(v);
    }

}
