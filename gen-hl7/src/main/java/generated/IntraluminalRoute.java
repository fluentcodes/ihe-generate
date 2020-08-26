
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntraluminalRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntraluminalRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ILUMINJ"/&gt;
 *     &lt;enumeration value="ILUMTA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntraluminalRoute")
@XmlEnum
public enum IntraluminalRoute {

    ILUMINJ,
    ILUMTA;

    public String value() {
        return name();
    }

    public static IntraluminalRoute fromValue(String v) {
        return valueOf(v);
    }

}
