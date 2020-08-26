
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ValueSetOperator.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ValueSetOperator"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ValueSetOperator")
@XmlEnum
public enum ValueSetOperator {

    E,
    I;

    public String value() {
        return name();
    }

    public static ValueSetOperator fromValue(String v) {
        return valueOf(v);
    }

}
