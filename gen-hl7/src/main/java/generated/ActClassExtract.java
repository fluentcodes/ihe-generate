
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActClassExtract.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassExtract"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="EXTRACT"/&gt;
 *     &lt;enumeration value="EHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActClassExtract")
@XmlEnum
public enum ActClassExtract {

    EXTRACT,
    EHR;

    public String value() {
        return name();
    }

    public static ActClassExtract fromValue(String v) {
        return valueOf(v);
    }

}
