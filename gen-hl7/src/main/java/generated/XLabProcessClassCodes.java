
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_LabProcessClassCodes.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_LabProcessClassCodes"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ACSN"/&gt;
 *     &lt;enumeration value="CONTREG"/&gt;
 *     &lt;enumeration value="PROC"/&gt;
 *     &lt;enumeration value="SPCTRT"/&gt;
 *     &lt;enumeration value="TRNS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_LabProcessClassCodes")
@XmlEnum
public enum XLabProcessClassCodes {

    ACSN,
    CONTREG,
    PROC,
    SPCTRT,
    TRNS;

    public String value() {
        return name();
    }

    public static XLabProcessClassCodes fromValue(String v) {
        return valueOf(v);
    }

}
