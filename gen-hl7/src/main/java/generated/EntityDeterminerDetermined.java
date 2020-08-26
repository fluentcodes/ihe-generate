
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EntityDeterminerDetermined.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityDeterminerDetermined"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="KIND"/&gt;
 *     &lt;enumeration value="QUANTIFIED_KIND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityDeterminerDetermined")
@XmlEnum
public enum EntityDeterminerDetermined {

    KIND,
    QUANTIFIED_KIND;

    public String value() {
        return name();
    }

    public static EntityDeterminerDetermined fromValue(String v) {
        return valueOf(v);
    }

}
