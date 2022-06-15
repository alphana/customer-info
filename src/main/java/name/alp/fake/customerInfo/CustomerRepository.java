package name.alp.fake.customerInfo;

import name.alp.fake.customerInfo.generated.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerRepository {
    public Customer findByNatId(String natId) {
        return null;
    }

    public Customer findById(String id) {
        return null;
    }

    public Customer findByUserName(String name) {
        return null;
    }
}
