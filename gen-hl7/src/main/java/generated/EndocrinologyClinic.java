
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EndocrinologyClinic.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EndocrinologyClinic"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ENDO"/&gt;
 *     &lt;enumeration value="PEDE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EndocrinologyClinic")
@XmlEnum
public enum EndocrinologyClinic {

    ENDO,
    PEDE;

    public String value() {
        return name();
    }

    public static EndocrinologyClinic fromValue(String v) {
        return valueOf(v);
    }

}
