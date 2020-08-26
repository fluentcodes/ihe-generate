
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für VaginalGel.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VaginalGel"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="VAGGEL"/&gt;
 *     &lt;enumeration value="VGELAPL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VaginalGel")
@XmlEnum
public enum VaginalGel {

    VAGGEL,
    VGELAPL;

    public String value() {
        return name();
    }

    public static VaginalGel fromValue(String v) {
        return valueOf(v);
    }

}
