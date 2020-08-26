
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AcknowledgementDetailType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AcknowledgementDetailType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AcknowledgementDetailType")
@XmlEnum
public enum AcknowledgementDetailType {

    E,
    I,
    W;

    public String value() {
        return name();
    }

    public static AcknowledgementDetailType fromValue(String v) {
        return valueOf(v);
    }

}
