
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActInformationAccessContextCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInformationAccessContextCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="INFCON"/&gt;
 *     &lt;enumeration value="INFDNG"/&gt;
 *     &lt;enumeration value="INFPWR"/&gt;
 *     &lt;enumeration value="INFEMER"/&gt;
 *     &lt;enumeration value="INFCRT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActInformationAccessContextCode")
@XmlEnum
public enum ActInformationAccessContextCode {

    INFCON,
    INFDNG,
    INFPWR,
    INFEMER,
    INFCRT;

    public String value() {
        return name();
    }

    public static ActInformationAccessContextCode fromValue(String v) {
        return valueOf(v);
    }

}
