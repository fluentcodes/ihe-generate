
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ExtracorporealCirculationRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtracorporealCirculationRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="EXTCORPDIF"/&gt;
 *     &lt;enumeration value="EXTCORPINJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExtracorporealCirculationRoute")
@XmlEnum
public enum ExtracorporealCirculationRoute {

    EXTCORPDIF,
    EXTCORPINJ;

    public String value() {
        return name();
    }

    public static ExtracorporealCirculationRoute fromValue(String v) {
        return valueOf(v);
    }

}
