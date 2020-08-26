
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NieceNephew.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NieceNephew"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="NIENEPH"/&gt;
 *     &lt;enumeration value="NEPHEW"/&gt;
 *     &lt;enumeration value="NIECE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NieceNephew")
@XmlEnum
public enum NieceNephew {

    NIENEPH,
    NEPHEW,
    NIECE;

    public String value() {
        return name();
    }

    public static NieceNephew fromValue(String v) {
        return valueOf(v);
    }

}
