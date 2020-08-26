
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SwabDrugForm.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SwabDrugForm"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SWAB"/&gt;
 *     &lt;enumeration value="MEDSWAB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SwabDrugForm")
@XmlEnum
public enum SwabDrugForm {

    SWAB,
    MEDSWAB;

    public String value() {
        return name();
    }

    public static SwabDrugForm fromValue(String v) {
        return valueOf(v);
    }

}
