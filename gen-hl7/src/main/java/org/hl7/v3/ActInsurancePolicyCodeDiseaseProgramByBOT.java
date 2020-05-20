
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActInsurancePolicyCodeDiseaseProgramByBOT.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInsurancePolicyCodeDiseaseProgramByBOT"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="DISEASEPRG"/&gt;
 *     &lt;enumeration value="HIVAIDS"/&gt;
 *     &lt;enumeration value="CANPRG"/&gt;
 *     &lt;enumeration value="ENDRENAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActInsurancePolicyCodeDiseaseProgramByBOT")
@XmlEnum
public enum ActInsurancePolicyCodeDiseaseProgramByBOT {

    DISEASEPRG,
    HIVAIDS,
    CANPRG,
    ENDRENAL;

    public String value() {
        return name();
    }

    public static ActInsurancePolicyCodeDiseaseProgramByBOT fromValue(String v) {
        return valueOf(v);
    }

}
