
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_ActMoodOrdPrmsEvn.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActMoodOrdPrmsEvn"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="EVN"/&gt;
 *     &lt;enumeration value="PRMS"/&gt;
 *     &lt;enumeration value="RQO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ActMoodOrdPrmsEvn")
@XmlEnum
public enum XActMoodOrdPrmsEvn {

    EVN,
    PRMS,
    RQO;

    public String value() {
        return name();
    }

    public static XActMoodOrdPrmsEvn fromValue(String v) {
        return valueOf(v);
    }

}
