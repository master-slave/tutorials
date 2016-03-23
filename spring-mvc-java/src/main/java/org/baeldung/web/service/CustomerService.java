package org.baeldung.web.service;


import org.baeldung.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> allCustomers();

    Customer getCustomerDetail(String id);
}
