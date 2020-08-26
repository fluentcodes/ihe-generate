
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für StepChild.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="StepChild"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="STPCHLD"/&gt;
 *     &lt;enumeration value="STPDAU"/&gt;
 *     &lt;enumeration value="STPSON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StepChild")
@XmlEnum
public enum StepChild {

    STPCHLD,
    STPDAU,
    STPSON;

    public String value() {
        return name();
    }

    public static StepChild fromValue(String v) {
        return valueOf(v);
    }

}
