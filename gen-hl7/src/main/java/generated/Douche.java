
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Douche.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Douche"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="DOUCHE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Douche")
@XmlEnum
public enum Douche {

    DOUCHE;

    public String value() {
        return name();
    }

    public static Douche fromValue(String v) {
        return valueOf(v);
    }

}
