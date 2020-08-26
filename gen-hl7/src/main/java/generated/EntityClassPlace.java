
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EntityClassPlace.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityClassPlace"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PLC"/&gt;
 *     &lt;enumeration value="CITY"/&gt;
 *     &lt;enumeration value="COUNTRY"/&gt;
 *     &lt;enumeration value="COUNTY"/&gt;
 *     &lt;enumeration value="PROVINCE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityClassPlace")
@XmlEnum
public enum EntityClassPlace {

    PLC,
    CITY,
    COUNTRY,
    COUNTY,
    PROVINCE;

    public String value() {
        return name();
    }

    public static EntityClassPlace fromValue(String v) {
        return valueOf(v);
    }

}
