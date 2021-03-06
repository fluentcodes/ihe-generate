
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_ActClassDocumentEntryAct.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActClassDocumentEntryAct"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ACCM"/&gt;
 *     &lt;enumeration value="ACT"/&gt;
 *     &lt;enumeration value="PCPR"/&gt;
 *     &lt;enumeration value="CTTEVENT"/&gt;
 *     &lt;enumeration value="CONS"/&gt;
 *     &lt;enumeration value="INC"/&gt;
 *     &lt;enumeration value="INFRM"/&gt;
 *     &lt;enumeration value="REG"/&gt;
 *     &lt;enumeration value="SPCTRT"/&gt;
 *     &lt;enumeration value="TRNS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ActClassDocumentEntryAct")
@XmlEnum
public enum XActClassDocumentEntryAct {

    ACCM,
    ACT,
    PCPR,
    CTTEVENT,
    CONS,
    INC,
    INFRM,
    REG,
    SPCTRT,
    TRNS;

    public String value() {
        return name();
    }

    public static XActClassDocumentEntryAct fromValue(String v) {
        return valueOf(v);
    }

}
