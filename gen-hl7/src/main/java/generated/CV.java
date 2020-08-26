
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Coded data, consists of a code, display name, code system,
 *             and original text. Used when a single code value must be sent.
 *          
 * 
 * <p>Java-Klasse für CV complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CV"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{}CE"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originalText" type="{}ED" minOccurs="0"/&gt;
 *         &lt;element name="translation" type="{}CD" maxOccurs="0" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="code" type="{}cs" /&gt;
 *       &lt;attribute name="codeSystem" type="{}uid" /&gt;
 *       &lt;attribute name="codeSystemName" type="{}st" /&gt;
 *       &lt;attribute name="codeSystemVersion" type="{}st" /&gt;
 *       &lt;attribute name="displayName" type="{}st" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CV")
@XmlSeeAlso({
    CS.class,
    CO.class,
    PQR.class
})
public class CV
    extends CE
{


}
