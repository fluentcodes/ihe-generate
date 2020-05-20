
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_DocumentSubject.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_DocumentSubject"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="PAT"/&gt;
 *     &lt;enumeration value="PRS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_DocumentSubject")
@XmlEnum
public enum XDocumentSubject {

    PAT,
    PRS;

    public String value() {
        return name();
    }

    public static XDocumentSubject fromValue(String v) {
        return valueOf(v);
    }

}
