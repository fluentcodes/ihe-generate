
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntracorpusCavernosumRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntracorpusCavernosumRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ICORPCAVINJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntracorpusCavernosumRoute")
@XmlEnum
public enum IntracorpusCavernosumRoute {

    ICORPCAVINJ;

    public String value() {
        return name();
    }

    public static IntracorpusCavernosumRoute fromValue(String v) {
        return valueOf(v);
    }

}
