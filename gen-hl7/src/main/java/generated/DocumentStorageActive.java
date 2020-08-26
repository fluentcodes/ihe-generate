
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DocumentStorageActive.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentStorageActive"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="AC"/&gt;
 *     &lt;enumeration value="AA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentStorageActive")
@XmlEnum
public enum DocumentStorageActive {

    AC,
    AA;

    public String value() {
        return name();
    }

    public static DocumentStorageActive fromValue(String v) {
        return valueOf(v);
    }

}
