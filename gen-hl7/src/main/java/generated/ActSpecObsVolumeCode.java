
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActSpecObsVolumeCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActSpecObsVolumeCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="VOLUME"/&gt;
 *     &lt;enumeration value="AVAILABLE"/&gt;
 *     &lt;enumeration value="CONSUMPTION"/&gt;
 *     &lt;enumeration value="CURRENT"/&gt;
 *     &lt;enumeration value="INITIAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActSpecObsVolumeCode")
@XmlEnum
public enum ActSpecObsVolumeCode {

    VOLUME,
    AVAILABLE,
    CONSUMPTION,
    CURRENT,
    INITIAL;

    public String value() {
        return name();
    }

    public static ActSpecObsVolumeCode fromValue(String v) {
        return valueOf(v);
    }

}
