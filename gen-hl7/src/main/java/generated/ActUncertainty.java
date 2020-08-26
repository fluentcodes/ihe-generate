
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActUncertainty.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActUncertainty"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActUncertainty")
@XmlEnum
public enum ActUncertainty {

    N,
    U;

    public String value() {
        return name();
    }

    public static ActUncertainty fromValue(String v) {
        return valueOf(v);
    }

}
