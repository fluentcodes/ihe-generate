
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_InformationRecipientRole.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_InformationRecipientRole"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ASSIGNED"/&gt;
 *     &lt;enumeration value="HLTHCHRT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_InformationRecipientRole")
@XmlEnum
public enum XInformationRecipientRole {

    ASSIGNED,
    HLTHCHRT;

    public String value() {
        return name();
    }

    public static XInformationRecipientRole fromValue(String v) {
        return valueOf(v);
    }

}
