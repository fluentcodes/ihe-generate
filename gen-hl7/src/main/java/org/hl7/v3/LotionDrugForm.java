
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LotionDrugForm.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LotionDrugForm"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="LTN"/&gt;
 *     &lt;enumeration value="TOPLTN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LotionDrugForm")
@XmlEnum
public enum LotionDrugForm {

    LTN,
    TOPLTN;

    public String value() {
        return name();
    }

    public static LotionDrugForm fromValue(String v) {
        return valueOf(v);
    }

}
