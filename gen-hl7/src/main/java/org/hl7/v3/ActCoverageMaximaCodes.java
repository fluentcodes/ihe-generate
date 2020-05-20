
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActCoverageMaximaCodes.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActCoverageMaximaCodes"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="COVMX"/&gt;
 *     &lt;enumeration value="LFEMX"/&gt;
 *     &lt;enumeration value="PRDMX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActCoverageMaximaCodes")
@XmlEnum
public enum ActCoverageMaximaCodes {

    COVMX,
    LFEMX,
    PRDMX;

    public String value() {
        return name();
    }

    public static ActCoverageMaximaCodes fromValue(String v) {
        return valueOf(v);
    }

}
