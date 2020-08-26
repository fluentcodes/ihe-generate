
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OrthoClinPracticeSetting.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OrthoClinPracticeSetting"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ORTHO"/&gt;
 *     &lt;enumeration value="HAND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrthoClinPracticeSetting")
@XmlEnum
public enum OrthoClinPracticeSetting {

    ORTHO,
    HAND;

    public String value() {
        return name();
    }

    public static OrthoClinPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}
