
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A name for an organization. A sequence of name parts.
 *          
 * 
 * <p>Java-Klasse für ON complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ON"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{}EN"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="delimiter" type="{}en.delimiter"/&gt;
 *           &lt;element name="prefix" type="{}en.prefix"/&gt;
 *           &lt;element name="suffix" type="{}en.suffix"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="validTime" type="{}IVL_TS" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="use" type="{}set_EntityNameUse" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ON")
public class ON
    extends EN
{


}
