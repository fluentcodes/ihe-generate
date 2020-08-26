
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Transdermal.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Transdermal"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="TRNSDERMD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Transdermal")
@XmlEnum
public enum Transdermal {

    TRNSDERMD;

    public String value() {
        return name();
    }

    public static Transdermal fromValue(String v) {
        return valueOf(v);
    }

}
