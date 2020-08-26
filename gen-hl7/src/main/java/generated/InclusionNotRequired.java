
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InclusionNotRequired.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="InclusionNotRequired"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="NR"/&gt;
 *     &lt;enumeration value="X"/&gt;
 *     &lt;enumeration value="RE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InclusionNotRequired")
@XmlEnum
public enum InclusionNotRequired {

    NR,
    X,
    RE;

    public String value() {
        return name();
    }

    public static InclusionNotRequired fromValue(String v) {
        return valueOf(v);
    }

}
