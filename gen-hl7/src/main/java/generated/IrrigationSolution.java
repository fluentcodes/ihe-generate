
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IrrigationSolution.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IrrigationSolution"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="IRSOL"/&gt;
 *     &lt;enumeration value="DOUCHE"/&gt;
 *     &lt;enumeration value="ENEMA"/&gt;
 *     &lt;enumeration value="OPIRSOL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IrrigationSolution")
@XmlEnum
public enum IrrigationSolution {

    IRSOL,
    DOUCHE,
    ENEMA,
    OPIRSOL;

    public String value() {
        return name();
    }

    public static IrrigationSolution fromValue(String v) {
        return valueOf(v);
    }

}
