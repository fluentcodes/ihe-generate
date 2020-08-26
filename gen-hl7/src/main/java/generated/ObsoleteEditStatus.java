
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObsoleteEditStatus.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ObsoleteEditStatus"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="O"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObsoleteEditStatus")
@XmlEnum
public enum ObsoleteEditStatus {

    O;

    public String value() {
        return name();
    }

    public static ObsoleteEditStatus fromValue(String v) {
        return valueOf(v);
    }

}
