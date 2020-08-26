
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AerosolDrugForm.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AerosolDrugForm"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="AER"/&gt;
 *     &lt;enumeration value="BAINHL"/&gt;
 *     &lt;enumeration value="INHLSOL"/&gt;
 *     &lt;enumeration value="MDINHL"/&gt;
 *     &lt;enumeration value="NASSPRY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AerosolDrugForm")
@XmlEnum
public enum AerosolDrugForm {

    AER,
    BAINHL,
    INHLSOL,
    MDINHL,
    NASSPRY;

    public String value() {
        return name();
    }

    public static AerosolDrugForm fromValue(String v) {
        return valueOf(v);
    }

}
