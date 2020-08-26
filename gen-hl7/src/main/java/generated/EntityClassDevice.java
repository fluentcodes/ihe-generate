
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EntityClassDevice.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityClassDevice"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="DEV"/&gt;
 *     &lt;enumeration value="CER"/&gt;
 *     &lt;enumeration value="MODDV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityClassDevice")
@XmlEnum
public enum EntityClassDevice {

    DEV,
    CER,
    MODDV;

    public String value() {
        return name();
    }

    public static EntityClassDevice fromValue(String v) {
        return valueOf(v);
    }

}
