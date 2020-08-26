
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActSpecimenTransportCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActSpecimenTransportCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SSTOR"/&gt;
 *     &lt;enumeration value="STRAN"/&gt;
 *     &lt;enumeration value="SREC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActSpecimenTransportCode")
@XmlEnum
public enum ActSpecimenTransportCode {

    SSTOR,
    STRAN,
    SREC;

    public String value() {
        return name();
    }

    public static ActSpecimenTransportCode fromValue(String v) {
        return valueOf(v);
    }

}
