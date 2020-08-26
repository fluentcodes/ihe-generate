
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CommunicationFunctionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationFunctionType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="RCV"/&gt;
 *     &lt;enumeration value="RSP"/&gt;
 *     &lt;enumeration value="SND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommunicationFunctionType")
@XmlEnum
public enum CommunicationFunctionType {

    RCV,
    RSP,
    SND;

    public String value() {
        return name();
    }

    public static CommunicationFunctionType fromValue(String v) {
        return valueOf(v);
    }

}
