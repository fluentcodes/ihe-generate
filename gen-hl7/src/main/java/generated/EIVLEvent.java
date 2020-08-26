
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         A code for a common (periodical) activity of daily
 *                         living based on which the event related periodic
 *                         interval is specified.
 *                      
 * 
 * <p>Java-Klasse für EIVL.event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EIVL.event"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{}CE"&gt;
 *       &lt;attribute name="code" type="{}TimingEvent" /&gt;
 *       &lt;attribute name="codeSystem" type="{}uid" fixed="2.16.840.1.113883.5.139" /&gt;
 *       &lt;attribute name="codeSystemName" type="{}st" fixed="TimingEvent" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EIVL.event")
public class EIVLEvent
    extends CE
{


}
