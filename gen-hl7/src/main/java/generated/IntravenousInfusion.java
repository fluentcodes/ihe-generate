
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntravenousInfusion.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntravenousInfusion"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="IV"/&gt;
 *     &lt;enumeration value="IVC"/&gt;
 *     &lt;enumeration value="IVCC"/&gt;
 *     &lt;enumeration value="IVCI"/&gt;
 *     &lt;enumeration value="PCA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntravenousInfusion")
@XmlEnum
public enum IntravenousInfusion {

    IV,
    IVC,
    IVCC,
    IVCI,
    PCA;

    public String value() {
        return name();
    }

    public static IntravenousInfusion fromValue(String v) {
        return valueOf(v);
    }

}
