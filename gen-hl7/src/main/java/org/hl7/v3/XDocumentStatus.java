
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_DocumentStatus.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_DocumentStatus"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="active"/&gt;
 *     &lt;enumeration value="cancelled"/&gt;
 *     &lt;enumeration value="new"/&gt;
 *     &lt;enumeration value="obsolete"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_DocumentStatus")
@XmlEnum
public enum XDocumentStatus {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),
    @XmlEnumValue("new")
    NEW("new"),
    @XmlEnumValue("obsolete")
    OBSOLETE("obsolete");
    private final String value;

    XDocumentStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XDocumentStatus fromValue(String v) {
        for (XDocumentStatus c: XDocumentStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
