
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_ActMoodDefEvnRqo.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActMoodDefEvnRqo"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="DEF"/&gt;
 *     &lt;enumeration value="EVN"/&gt;
 *     &lt;enumeration value="RQO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ActMoodDefEvnRqo")
@XmlEnum
public enum XActMoodDefEvnRqo {

    DEF,
    EVN,
    RQO;

    public String value() {
        return name();
    }

    public static XActMoodDefEvnRqo fromValue(String v) {
        return valueOf(v);
    }

}
