
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für VaginalFoam.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VaginalFoam"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="VAGFOAM"/&gt;
 *     &lt;enumeration value="VAGFOAMAPL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VaginalFoam")
@XmlEnum
public enum VaginalFoam {

    VAGFOAM,
    VAGFOAMAPL;

    public String value() {
        return name();
    }

    public static VaginalFoam fromValue(String v) {
        return valueOf(v);
    }

}
