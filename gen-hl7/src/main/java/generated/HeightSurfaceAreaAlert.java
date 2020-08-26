
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für HeightSurfaceAreaAlert.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="HeightSurfaceAreaAlert"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="DOSEHINDSA"/&gt;
 *     &lt;enumeration value="DOSELINDSA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HeightSurfaceAreaAlert")
@XmlEnum
public enum HeightSurfaceAreaAlert {

    DOSEHINDSA,
    DOSELINDSA;

    public String value() {
        return name();
    }

    public static HeightSurfaceAreaAlert fromValue(String v) {
        return valueOf(v);
    }

}
