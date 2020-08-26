
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MdfHmdMetSourceType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MdfHmdMetSourceType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MdfHmdMetSourceType")
@XmlEnum
public enum MdfHmdMetSourceType {

    C,
    D,
    N,
    U,
    R,
    I;

    public String value() {
        return name();
    }

    public static MdfHmdMetSourceType fromValue(String v) {
        return valueOf(v);
    }

}
