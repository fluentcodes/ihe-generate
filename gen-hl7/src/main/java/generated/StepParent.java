
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für StepParent.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="StepParent"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="STPPRN"/&gt;
 *     &lt;enumeration value="STPFTH"/&gt;
 *     &lt;enumeration value="STPMTH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StepParent")
@XmlEnum
public enum StepParent {

    STPPRN,
    STPFTH,
    STPMTH;

    public String value() {
        return name();
    }

    public static StepParent fromValue(String v) {
        return valueOf(v);
    }

}
