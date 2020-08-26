
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LanguageAbilityProficiency.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageAbilityProficiency"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LanguageAbilityProficiency")
@XmlEnum
public enum LanguageAbilityProficiency {

    E,
    F,
    G,
    P;

    public String value() {
        return name();
    }

    public static LanguageAbilityProficiency fromValue(String v) {
        return valueOf(v);
    }

}
