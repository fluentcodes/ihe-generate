
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EntityNameSearchUse.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityNameSearchUse"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SRCH"/&gt;
 *     &lt;enumeration value="SNDX"/&gt;
 *     &lt;enumeration value="PHON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityNameSearchUse")
@XmlEnum
public enum EntityNameSearchUse {

    SRCH,
    SNDX,
    PHON;

    public String value() {
        return name();
    }

    public static EntityNameSearchUse fromValue(String v) {
        return valueOf(v);
    }

}
