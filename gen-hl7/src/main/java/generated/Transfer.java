
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Transfer.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Transfer"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="TRANSFER"/&gt;
 *     &lt;enumeration value="SALE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Transfer")
@XmlEnum
public enum Transfer {

    TRANSFER,
    SALE;

    public String value() {
        return name();
    }

    public static Transfer fromValue(String v) {
        return valueOf(v);
    }

}
