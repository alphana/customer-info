//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.15 at 09:25:13 AM EET 
//


package name.alp.fake.customerInfo.generated;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="natId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "natId"
})
@XmlRootElement(name = "getCustomerByNatIdRequest")
public class GetCustomerByNatIdRequest {

    @XmlElement(required = true)
    protected String natId;

    /**
     * Gets the value of the natId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatId() {
        return natId;
    }

    /**
     * Sets the value of the natId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatId(String value) {
        this.natId = value;
    }

}