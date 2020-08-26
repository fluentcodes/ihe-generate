
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PrescriptionDispenseFilterCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PrescriptionDispenseFilterCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PrescriptionDispenseFilterCode")
@XmlEnum
public enum PrescriptionDispenseFilterCode {

    C,
    R,
    N;

    public String value() {
        return name();
    }

    public static PrescriptionDispenseFilterCode fromValue(String v) {
        return valueOf(v);
    }

}
