
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 *  is an abstract generalization
 *             for all data types (1) whose value set has an order
 *             relation (less-or-equal) and (2) where difference is
 *             defined in all of the data type's totally ordered value
 *             subsets.  The quantity type abstraction is needed in
 *             defining certain other types, such as the interval and
 *             the probability distribution.
 *          
 * 
 * <p>Java-Klasse für QTY complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="QTY"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ANY"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QTY")
@XmlSeeAlso({
    RTOQTYQTY.class,
    INT.class,
    REAL.class,
    MO.class,
    PQ.class,
    RTOPQPQ.class,
    RTOMOPQ.class,
    TS.class
})
public abstract class QTY
    extends ANY
{


}
