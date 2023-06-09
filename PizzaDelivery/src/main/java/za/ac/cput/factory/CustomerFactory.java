package za.ac.cput.factory;


import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Address;
import za.ac.cput.util.Helper;

/* CustomerFactory.java
   Entity for the CustomerFactory
   Author: Keenan Meyer (220194920)
   Date: 30th March 2023
*/
public class CustomerFactory {
    public static Customer buildCustomer(String customerName, String customerSurname,Address address) {
        if (Helper.isNullOrEmpty(customerName) || Helper.isNullOrEmpty(String.valueOf(customerSurname))|| Helper.isNullOrEmpty(String.valueOf(address))) {
            return null;
        }

        String customerID = Helper.generateId();

        Customer customer = new Customer.Builder().setCustomerID(customerID).setCustomerName(customerName).setCustomerSurname(customerSurname).setAddress(address).build();
        return customer;

    }
}
