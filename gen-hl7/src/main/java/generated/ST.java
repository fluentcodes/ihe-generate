
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The character string data type stands for text data,
 *             primarily intended for machine processing (e.g.,
 *             sorting, querying, indexing, etc.) Used for names,
 *             symbols, and formal expressions.
 *          
 * 
 * <p>Java-Klasse für ST complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ST"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{}ED"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reference" type="{}TEL" maxOccurs="0" minOccurs="0"/&gt;
 *         &lt;element name="thumbnail" type="{}ED" maxOccurs="0" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="representation" type="{}BinaryDataEncoding" fixed="TXT" /&gt;
 *       &lt;attribute name="mediaType" type="{}cs" fixed="text/plain" /&gt;
 *       &lt;attribute name="language" type="{}cs" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ST")
@XmlSeeAlso({
    SC.class,
    ADXP.class,
    ENXP.class
})
public class ST
    extends ED
{


}
