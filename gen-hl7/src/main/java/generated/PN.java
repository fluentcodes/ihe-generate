
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A name for a person. A sequence of name parts, such as
 *             given name or family name, prefix, suffix, etc. PN differs
 *             from EN because the qualifier type cannot include LS
 *             (Legal Status).
 *          
 * 
 * <p>Java-Klasse für PN complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PN"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}EN"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PN")
public class PN
    extends EN
{


}
