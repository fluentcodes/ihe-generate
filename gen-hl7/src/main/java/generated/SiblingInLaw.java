
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SiblingInLaw.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SiblingInLaw"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SIBINLAW"/&gt;
 *     &lt;enumeration value="BROINLAW"/&gt;
 *     &lt;enumeration value="SISINLAW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SiblingInLaw")
@XmlEnum
public enum SiblingInLaw {

    SIBINLAW,
    BROINLAW,
    SISINLAW;

    public String value() {
        return name();
    }

    public static SiblingInLaw fromValue(String v) {
        return valueOf(v);
    }

}
