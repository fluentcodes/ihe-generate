
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InhalantDrugForm.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="InhalantDrugForm"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="INHL"/&gt;
 *     &lt;enumeration value="BAINHLPWD"/&gt;
 *     &lt;enumeration value="INHLPWD"/&gt;
 *     &lt;enumeration value="MDINHLPWD"/&gt;
 *     &lt;enumeration value="NASINHL"/&gt;
 *     &lt;enumeration value="ORINHL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InhalantDrugForm")
@XmlEnum
public enum InhalantDrugForm {

    INHL,
    BAINHLPWD,
    INHLPWD,
    MDINHLPWD,
    NASINHL,
    ORINHL;

    public String value() {
        return name();
    }

    public static InhalantDrugForm fromValue(String v) {
        return valueOf(v);
    }

}
