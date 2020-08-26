
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InterstitialRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="InterstitialRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="INTERSTITINJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InterstitialRoute")
@XmlEnum
public enum InterstitialRoute {

    INTERSTITINJ;

    public String value() {
        return name();
    }

    public static InterstitialRoute fromValue(String v) {
        return valueOf(v);
    }

}
