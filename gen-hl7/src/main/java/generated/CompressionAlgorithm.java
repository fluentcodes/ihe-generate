
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CompressionAlgorithm.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CompressionAlgorithm"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="Z"/&gt;
 *     &lt;enumeration value="DF"/&gt;
 *     &lt;enumeration value="GZ"/&gt;
 *     &lt;enumeration value="ZL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompressionAlgorithm")
@XmlEnum
public enum CompressionAlgorithm {

    Z,
    DF,
    GZ,
    ZL;

    public String value() {
        return name();
    }

    public static CompressionAlgorithm fromValue(String v) {
        return valueOf(v);
    }

}
