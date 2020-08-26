
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SubmucosalRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SubmucosalRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SUBMUCINJ"/&gt;
 *     &lt;enumeration value="SMUCMAB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SubmucosalRoute")
@XmlEnum
public enum SubmucosalRoute {

    SUBMUCINJ,
    SMUCMAB;

    public String value() {
        return name();
    }

    public static SubmucosalRoute fromValue(String v) {
        return valueOf(v);
    }

}
