
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActTaskMicrobiologyResultsReviewCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActTaskMicrobiologyResultsReviewCode"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="MICRORREV"/&gt;
 *     &lt;enumeration value="MICROORGRREV"/&gt;
 *     &lt;enumeration value="MICROSENSRREV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActTaskMicrobiologyResultsReviewCode")
@XmlEnum
public enum ActTaskMicrobiologyResultsReviewCode {

    MICRORREV,
    MICROORGRREV,
    MICROSENSRREV;

    public String value() {
        return name();
    }

    public static ActTaskMicrobiologyResultsReviewCode fromValue(String v) {
        return valueOf(v);
    }

}
