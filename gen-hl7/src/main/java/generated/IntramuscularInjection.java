
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntramuscularInjection.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntramuscularInjection"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="IM"/&gt;
 *     &lt;enumeration value="IMD"/&gt;
 *     &lt;enumeration value="IMZ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntramuscularInjection")
@XmlEnum
public enum IntramuscularInjection {

    IM,
    IMD,
    IMZ;

    public String value() {
        return name();
    }

    public static IntramuscularInjection fromValue(String v) {
        return valueOf(v);
    }

}
