
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActAdjudicationResultActionCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActAdjudicationResultActionCode"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="DISPLAY"/&gt;
 *     &lt;enumeration value="FORM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActAdjudicationResultActionCode")
@XmlEnum
public enum ActAdjudicationResultActionCode {

    DISPLAY,
    FORM;

    public String value() {
        return name();
    }

    public static ActAdjudicationResultActionCode fromValue(String v) {
        return valueOf(v);
    }

}
