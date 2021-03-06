
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PedsICUPracticeSetting.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PedsICUPracticeSetting"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PEDICU"/&gt;
 *     &lt;enumeration value="PEDNICU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PedsICUPracticeSetting")
@XmlEnum
public enum PedsICUPracticeSetting {

    PEDICU,
    PEDNICU;

    public String value() {
        return name();
    }

    public static PedsICUPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}
