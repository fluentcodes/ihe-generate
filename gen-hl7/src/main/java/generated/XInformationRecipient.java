
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_InformationRecipient.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_InformationRecipient"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PRCP"/&gt;
 *     &lt;enumeration value="TRC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_InformationRecipient")
@XmlEnum
public enum XInformationRecipient {

    PRCP,
    TRC;

    public String value() {
        return name();
    }

    public static XInformationRecipient fromValue(String v) {
        return valueOf(v);
    }

}
