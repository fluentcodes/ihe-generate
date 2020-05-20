
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IssueFilterCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IssueFilterCode"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ISSFA"/&gt;
 *     &lt;enumeration value="ISSFI"/&gt;
 *     &lt;enumeration value="ISSFU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IssueFilterCode")
@XmlEnum
public enum IssueFilterCode {

    ISSFA,
    ISSFI,
    ISSFU;

    public String value() {
        return name();
    }

    public static IssueFilterCode fromValue(String v) {
        return valueOf(v);
    }

}
