//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.15 at 09:25:13 AM EET 
//


package name.alp.fake.customerInfo.generated;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the name.alp.soap.customer package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: name.alp.soap.customer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCustomerByNatIdRequest }
     * 
     */
    public GetCustomerByNatIdRequest createGetCustomerByNatIdRequest() {
        return new GetCustomerByNatIdRequest();
    }

    /**
     * Create an instance of {@link GetCustomerByIdRequest }
     * 
     */
    public GetCustomerByIdRequest createGetCustomerByIdRequest() {
        return new GetCustomerByIdRequest();
    }

    /**
     * Create an instance of {@link GetCustomerByUserNameRequest }
     * 
     */
    public GetCustomerByUserNameRequest createGetCustomerByUserNameRequest() {
        return new GetCustomerByUserNameRequest();
    }

    /**
     * Create an instance of {@link GetCustomerResponse }
     * 
     */
    public GetCustomerResponse createGetCustomerResponse() {
        return new GetCustomerResponse();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

}
