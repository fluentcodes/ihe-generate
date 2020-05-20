
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BarSoapDrugForm.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BarSoapDrugForm"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
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
