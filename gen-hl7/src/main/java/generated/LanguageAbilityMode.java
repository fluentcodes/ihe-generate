
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LanguageAbilityMode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageAbilityMode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ESGN"/&gt;
 *     &lt;enumeration value="ESP"/&gt;
 *     &lt;enumeration value="EWR"/&gt;
 *     &lt;enumeration value="RSGN"/&gt;
 *     &lt;enumeration value="RSP"/&gt;
 *     &lt;enumeration value="RWR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LanguageAbilityMode")
@XmlEnum
public enum LanguageAbilityMode {

    ESGN,
    ESP,
    EWR,
    RSGN,
    RSP,
    RWR;

    public String value() {
        return name();
    }

    public static LanguageAbilityMode fromValue(String v) {
        return valueOf(v);
    }

}
