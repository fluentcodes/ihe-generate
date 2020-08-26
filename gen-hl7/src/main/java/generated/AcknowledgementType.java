
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AcknowledgementType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AcknowledgementType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CA"/&gt;
 *     &lt;enumeration value="CE"/&gt;
 *     &lt;enumeration value="CR"/&gt;
 *     &lt;enumeration value="AA"/&gt;
 *     &lt;enumeration value="AE"/&gt;
 *     &lt;enumeration value="AR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AcknowledgementType")
@XmlEnum
public enum AcknowledgementType {

    CA,
    CE,
    CR,
    AA,
    AE,
    AR;

    public String value() {
        return name();
    }

    public static AcknowledgementType fromValue(String v) {
        return valueOf(v);
    }

}
