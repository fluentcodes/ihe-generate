
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_SUCC_REPL_PREV.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_SUCC_REPL_PREV"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="PREV"/&gt;
 *     &lt;enumeration value="RPLC"/&gt;
 *     &lt;enumeration value="SUCC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_SUCC_REPL_PREV")
@XmlEnum
public enum XSUCCREPLPREV {

    PREV,
    RPLC,
    SUCC;

    public String value() {
        return name();
    }

    public static XSUCCREPLPREV fromValue(String v) {
        return valueOf(v);
    }

}
