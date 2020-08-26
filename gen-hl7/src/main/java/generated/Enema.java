
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Enema.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Enema"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ENEMA"/&gt;
 *     &lt;enumeration value="RETENEMA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Enema")
@XmlEnum
public enum Enema {

    ENEMA,
    RETENEMA;

    public String value() {
        return name();
    }

    public static Enema fromValue(String v) {
        return valueOf(v);
    }

}
