
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_DocumentEntrySubject.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_DocumentEntrySubject"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PAT"/&gt;
 *     &lt;enumeration value="PRS"/&gt;
 *     &lt;enumeration value="SPEC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_DocumentEntrySubject")
@XmlEnum
public enum XDocumentEntrySubject {

    PAT,
    PRS,
    SPEC;

    public String value() {
        return name();
    }

    public static XDocumentEntrySubject fromValue(String v) {
        return valueOf(v);
    }

}
