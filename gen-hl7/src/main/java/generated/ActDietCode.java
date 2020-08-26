
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActDietCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActDietCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="BR"/&gt;
 *     &lt;enumeration value="DM"/&gt;
 *     &lt;enumeration value="FAST"/&gt;
 *     &lt;enumeration value="GF"/&gt;
 *     &lt;enumeration value="LQ"/&gt;
 *     &lt;enumeration value="LF"/&gt;
 *     &lt;enumeration value="LP"/&gt;
 *     &lt;enumeration value="LS"/&gt;
 *     &lt;enumeration value="VLI"/&gt;
 *     &lt;enumeration value="NF"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="PAR"/&gt;
 *     &lt;enumeration value="PAF"/&gt;
 *     &lt;enumeration value="RD"/&gt;
 *     &lt;enumeration value="SCH"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActDietCode")
@XmlEnum
public enum ActDietCode {

    BR,
    DM,
    FAST,
    GF,
    LQ,
    LF,
    LP,
    LS,
    VLI,
    NF,
    N,
    PAR,
    PAF,
    RD,
    SCH,
    T;

    public String value() {
        return name();
    }

    public static ActDietCode fromValue(String v) {
        return valueOf(v);
    }

}
