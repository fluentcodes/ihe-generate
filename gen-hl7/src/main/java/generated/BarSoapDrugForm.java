
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BarSoapDrugForm.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BarSoapDrugForm"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="BARSOAP"/&gt;
 *     &lt;enumeration value="MEDBAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BarSoapDrugForm")
@XmlEnum
public enum BarSoapDrugForm {

    BARSOAP,
    MEDBAR;

    public String value() {
        return name();
    }

    public static BarSoapDrugForm fromValue(String v) {
        return valueOf(v);
    }

}
