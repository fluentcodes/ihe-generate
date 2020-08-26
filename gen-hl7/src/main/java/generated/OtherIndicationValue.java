
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OtherIndicationValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OtherIndicationValue"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="_DiagnosisValue"/&gt;
 *     &lt;enumeration value="_IndicationValue"/&gt;
 *     &lt;enumeration value="_SymptomValue"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OtherIndicationValue")
@XmlEnum
public enum OtherIndicationValue {

    @XmlEnumValue("_DiagnosisValue")
    DIAGNOSIS_VALUE("_DiagnosisValue"),
    @XmlEnumValue("_IndicationValue")
    INDICATION_VALUE("_IndicationValue"),
    @XmlEnumValue("_SymptomValue")
    SYMPTOM_VALUE("_SymptomValue");
    private final String value;

    OtherIndicationValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OtherIndicationValue fromValue(String v) {
        for (OtherIndicationValue c: OtherIndicationValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
