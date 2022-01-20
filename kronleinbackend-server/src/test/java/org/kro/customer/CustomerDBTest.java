package org.kro.customer;


import org.junit.jupiter.api.Test;
import org.kro.bo.Customer;
import org.kro.bo.CustomerKey;
import org.kro.bo.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CustomerDBTest {

    @Autowired
    private CustomerService custService;

    @Test
    public void verifyRepositoryWorks() {

        Long ID = 9999l;
        
        CustomerKey key = new CustomerKey(ID);

        Customer customer = new Customer();
        customer.setKey(key);
        customer.setName("Kundnamn");
        custService.save(customer);
        Boolean exists = custService.existsByKey(key);
        assertTrue(exists);
        custService.deleteByKey(key);
        exists = custService.existsByKey(key);
        assertFalse(exists);
    }


}
