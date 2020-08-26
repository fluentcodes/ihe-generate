
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AcknowledgementCondition.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AcknowledgementCondition"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="AL"/&gt;
 *     &lt;enumeration value="ER"/&gt;
 *     &lt;enumeration value="NE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AcknowledgementCondition")
@XmlEnum
public enum AcknowledgementCondition {

    AL,
    ER,
    NE;

    public String value() {
        return name();
    }

    public static AcknowledgementCondition fromValue(String v) {
        return valueOf(v);
    }

}
