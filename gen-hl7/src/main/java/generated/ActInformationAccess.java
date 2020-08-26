
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActInformationAccess.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInformationAccess"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="INFA"/&gt;
 *     &lt;enumeration value="INFASO"/&gt;
 *     &lt;enumeration value="INFAO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActInformationAccess")
@XmlEnum
public enum ActInformationAccess {

    INFA,
    INFASO,
    INFAO;

    public String value() {
        return name();
    }

    public static ActInformationAccess fromValue(String v) {
        return valueOf(v);
    }

}
