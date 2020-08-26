
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_EntityClassPersonOrOrgReceiving.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_EntityClassPersonOrOrgReceiving"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PSN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_EntityClassPersonOrOrgReceiving")
@XmlEnum
public enum XEntityClassPersonOrOrgReceiving {

    PSN;

    public String value() {
        return name();
    }

    public static XEntityClassPersonOrOrgReceiving fromValue(String v) {
        return valueOf(v);
    }

}
