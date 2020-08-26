
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NaturalFather.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NaturalFather"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="NFTH"/&gt;
 *     &lt;enumeration value="NFTHF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NaturalFather")
@XmlEnum
public enum NaturalFather {

    NFTH,
    NFTHF;

    public String value() {
        return name();
    }

    public static NaturalFather fromValue(String v) {
        return valueOf(v);
    }

}
