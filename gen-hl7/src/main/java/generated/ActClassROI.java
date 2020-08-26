
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActClassROI.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassROI"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ROIBND"/&gt;
 *     &lt;enumeration value="ROIOVL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActClassROI")
@XmlEnum
public enum ActClassROI {

    ROIBND,
    ROIOVL;

    public String value() {
        return name();
    }

    public static ActClassROI fromValue(String v) {
        return valueOf(v);
    }

}
