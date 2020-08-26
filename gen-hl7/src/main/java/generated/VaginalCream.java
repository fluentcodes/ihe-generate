
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für VaginalCream.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VaginalCream"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="VAGCRM"/&gt;
 *     &lt;enumeration value="VAGCRMAPL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VaginalCream")
@XmlEnum
public enum VaginalCream {

    VAGCRM,
    VAGCRMAPL;

    public String value() {
        return name();
    }

    public static VaginalCream fromValue(String v) {
        return valueOf(v);
    }

}
