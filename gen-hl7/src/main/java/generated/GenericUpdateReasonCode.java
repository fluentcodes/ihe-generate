
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GenericUpdateReasonCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GenericUpdateReasonCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="FIXDATA"/&gt;
 *     &lt;enumeration value="CHGDATA"/&gt;
 *     &lt;enumeration value="NEWDATA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GenericUpdateReasonCode")
@XmlEnum
public enum GenericUpdateReasonCode {

    FIXDATA,
    CHGDATA,
    NEWDATA;

    public String value() {
        return name();
    }

    public static GenericUpdateReasonCode fromValue(String v) {
        return valueOf(v);
    }

}
