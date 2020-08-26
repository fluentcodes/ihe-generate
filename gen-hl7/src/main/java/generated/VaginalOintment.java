
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für VaginalOintment.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VaginalOintment"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="VAGOINT"/&gt;
 *     &lt;enumeration value="VAGOINTAPL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VaginalOintment")
@XmlEnum
public enum VaginalOintment {

    VAGOINT,
    VAGOINTAPL;

    public String value() {
        return name();
    }

    public static VaginalOintment fromValue(String v) {
        return valueOf(v);
    }

}
