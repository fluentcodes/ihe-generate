
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DiseaseProgram.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DiseaseProgram"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="DISEASEPRG"/&gt;
 *     &lt;enumeration value="HIVAIDS"/&gt;
 *     &lt;enumeration value="CANPRG"/&gt;
 *     &lt;enumeration value="ENDRENAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DiseaseProgram")
@XmlEnum
public enum DiseaseProgram {

    DISEASEPRG,
    HIVAIDS,
    CANPRG,
    ENDRENAL;

    public String value() {
        return name();
    }

    public static DiseaseProgram fromValue(String v) {
        return valueOf(v);
    }

}
