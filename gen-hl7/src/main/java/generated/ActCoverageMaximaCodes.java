
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActCoverageMaximaCodes.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActCoverageMaximaCodes"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="COVMX"/&gt;
 *     &lt;enumeration value="LFEMX"/&gt;
 *     &lt;enumeration value="PRDMX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActCoverageMaximaCodes")
@XmlEnum
public enum ActCoverageMaximaCodes {

    COVMX,
    LFEMX,
    PRDMX;

    public String value() {
        return name();
    }

    public static ActCoverageMaximaCodes fromValue(String v) {
        return valueOf(v);
    }

}
