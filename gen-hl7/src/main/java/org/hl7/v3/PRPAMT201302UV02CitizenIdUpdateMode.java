
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PRPA_MT201302UV02.Citizen.id.updateMode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PRPA_MT201302UV02.Citizen.id.updateMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PRPA_MT201302UV02.Citizen.id.updateMode")
@XmlEnum
public enum PRPAMT201302UV02CitizenIdUpdateMode {

    A,
    N;

    public String value() {
        return name();
    }

    public static PRPAMT201302UV02CitizenIdUpdateMode fromValue(String v) {
        return valueOf(v);
    }

}
