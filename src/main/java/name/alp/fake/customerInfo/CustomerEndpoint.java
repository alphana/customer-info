package name.alp.fake.customerInfo;

import name.alp.fake.customerInfo.generated.GetCustomerByIdRequest;
import name.alp.fake.customerInfo.generated.GetCustomerByNatIdRequest;
import name.alp.fake.customerInfo.generated.GetCustomerByUserNameRequest;
import name.alp.fake.customerInfo.generated.GetCustomerResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CustomerEndpoint {
    private static final String NAMESPACE_URI = "http://name.alp.soap/customer";

    private CustomerRepository customerRepository;

    public CustomerEndpoint(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCustomerByNatIdRequest")
    @ResponsePayload
    public GetCustomerResponse getCustomerByNatIdRequest(@RequestPayload GetCustomerByNatIdRequest request) {
        GetCustomerResponse response = new GetCustomerResponse();
        response.setCustomer(customerRepository.findByNatId(request.getNatId()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCustomerByIdRequest")
    @ResponsePayload
    public GetCustomerResponse getCustomerByIdRequest(GetCustomerByIdRequest request) {
        GetCustomerResponse response = new GetCustomerResponse();
        response.setCustomer(customerRepository.findById(request.getId()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCustomerByUserNameRequest")
    @ResponsePayload
    public GetCustomerResponse getCustomerByUserNameRequest(GetCustomerByUserNameRequest request) {
        GetCustomerResponse response = new GetCustomerResponse();
        response.setCustomer(customerRepository.findByUserName(request.getName()));
        return response;
    }
}
