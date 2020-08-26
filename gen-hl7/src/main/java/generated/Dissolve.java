
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Dissolve.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Dissolve"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="DISSOLVE"/&gt;
 *     &lt;enumeration value="SL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Dissolve")
@XmlEnum
public enum Dissolve {

    DISSOLVE,
    SL;

    public String value() {
        return name();
    }

    public static Dissolve fromValue(String v) {
        return valueOf(v);
    }

}
