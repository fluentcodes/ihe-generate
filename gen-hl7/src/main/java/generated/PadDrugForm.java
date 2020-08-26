
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PadDrugForm.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PadDrugForm"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PAD"/&gt;
 *     &lt;enumeration value="MEDPAD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PadDrugForm")
@XmlEnum
public enum PadDrugForm {

    PAD,
    MEDPAD;

    public String value() {
        return name();
    }

    public static PadDrugForm fromValue(String v) {
        return valueOf(v);
    }

}
