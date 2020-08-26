
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Coded data, consists of a coded value (CV)
 *             and, optionally, coded value(s) from other coding systems
 *             that identify the same concept. Used when alternative
 *             codes may exist.
 *          
 * 
 * <p>Java-Klasse für CE complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{}CD"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originalText" type="{}ED" minOccurs="0"/&gt;
 *         &lt;element name="qualifier" type="{}CR" maxOccurs="0" minOccurs="0"/&gt;
 *         &lt;element name="translation" type="{}CD" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "CE")
@XmlSeeAlso({
    CV.class,
    EIVLEvent.class,
    HXITCE.class
})
public class CE
    extends CD
{


}
