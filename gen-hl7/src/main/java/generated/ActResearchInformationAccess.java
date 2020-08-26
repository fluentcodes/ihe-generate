
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActResearchInformationAccess.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActResearchInformationAccess"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="RESEARCH"/&gt;
 *     &lt;enumeration value="RSDID"/&gt;
 *     &lt;enumeration value="RSREID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActResearchInformationAccess")
@XmlEnum
public enum ActResearchInformationAccess {

    RESEARCH,
    RSDID,
    RSREID;

    public String value() {
        return name();
    }

    public static ActResearchInformationAccess fromValue(String v) {
        return valueOf(v);
    }

}
