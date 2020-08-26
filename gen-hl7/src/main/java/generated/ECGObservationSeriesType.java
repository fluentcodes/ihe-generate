
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ECGObservationSeriesType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ECGObservationSeriesType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="REPRESENTATIVE_BEAT"/&gt;
 *     &lt;enumeration value="RHYTHM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ECGObservationSeriesType")
@XmlEnum
public enum ECGObservationSeriesType {

    REPRESENTATIVE_BEAT,
    RHYTHM;

    public String value() {
        return name();
    }

    public static ECGObservationSeriesType fromValue(String v) {
        return valueOf(v);
    }

}
