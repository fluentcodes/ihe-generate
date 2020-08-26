
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ROIOverlayShape.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ROIOverlayShape"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CIRCLE"/&gt;
 *     &lt;enumeration value="ELLIPSE"/&gt;
 *     &lt;enumeration value="POINT"/&gt;
 *     &lt;enumeration value="POLY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ROIOverlayShape")
@XmlEnum
public enum ROIOverlayShape {

    CIRCLE,
    ELLIPSE,
    POINT,
    POLY;

    public String value() {
        return name();
    }

    public static ROIOverlayShape fromValue(String v) {
        return valueOf(v);
    }

}
