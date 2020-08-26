
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_SubstitutionConditionNoneOrUnconditional.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_SubstitutionConditionNoneOrUnconditional"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="NOSUB"/&gt;
 *     &lt;enumeration value="UNCOND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_SubstitutionConditionNoneOrUnconditional")
@XmlEnum
public enum XSubstitutionConditionNoneOrUnconditional {

    NOSUB,
    UNCOND;

    public String value() {
        return name();
    }

    public static XSubstitutionConditionNoneOrUnconditional fromValue(String v) {
        return valueOf(v);
    }

}
