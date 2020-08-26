
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CardClinPracticeSetting.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CardClinPracticeSetting"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CARD"/&gt;
 *     &lt;enumeration value="PEDCARD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardClinPracticeSetting")
@XmlEnum
public enum CardClinPracticeSetting {

    CARD,
    PEDCARD;

    public String value() {
        return name();
    }

    public static CardClinPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}
