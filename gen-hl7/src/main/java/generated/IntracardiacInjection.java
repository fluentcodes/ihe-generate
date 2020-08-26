
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntracardiacInjection.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntracardiacInjection"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ICARDINJ"/&gt;
 *     &lt;enumeration value="ICARINJP"/&gt;
 *     &lt;enumeration value="ICARDINJRP"/&gt;
 *     &lt;enumeration value="ICARDINJSP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntracardiacInjection")
@XmlEnum
public enum IntracardiacInjection {

    ICARDINJ,
    ICARINJP,
    ICARDINJRP,
    ICARDINJSP;

    public String value() {
        return name();
    }

    public static IntracardiacInjection fromValue(String v) {
        return valueOf(v);
    }

}
