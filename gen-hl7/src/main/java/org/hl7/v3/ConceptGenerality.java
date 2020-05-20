
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ConceptGenerality.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ConceptGenerality"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConceptGenerality")
@XmlEnum
public enum ConceptGenerality {

    A,
    L,
    S;

    public String value() {
        return name();
    }

    public static ConceptGenerality fromValue(String v) {
        return valueOf(v);
    }

}
