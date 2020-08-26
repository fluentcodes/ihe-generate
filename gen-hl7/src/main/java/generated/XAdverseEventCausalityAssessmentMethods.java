
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_AdverseEventCausalityAssessmentMethods.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_AdverseEventCausalityAssessmentMethods"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ALGM"/&gt;
 *     &lt;enumeration value="BYCL"/&gt;
 *     &lt;enumeration value="GINT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_AdverseEventCausalityAssessmentMethods")
@XmlEnum
public enum XAdverseEventCausalityAssessmentMethods {

    ALGM,
    BYCL,
    GINT;

    public String value() {
        return name();
    }

    public static XAdverseEventCausalityAssessmentMethods fromValue(String v) {
        return valueOf(v);
    }

}
