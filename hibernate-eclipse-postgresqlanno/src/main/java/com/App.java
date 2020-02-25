package com;

import com.cms.deloitte.dao.impl.CustomerDAOImpl;
import com.cms.deloitte.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Customer customer=new Customer(10001,"Vivek","Bangalore",98000);
        CustomerDAOImpl impl=new CustomerDAOImpl();
        impl.addCustomer(customer);
        System.out.println(customer.getCustomerName()+" is saved");
        
        
        
        
        
    }
}
