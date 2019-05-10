package com.atos.Syntel.CollectionBasics;
import com.atosSyntel.model.Customer;
import java.util.ArrayList;
/**
 *
 * @author syntel
 */
public class ArrayListBasics_02 {
    
    public static void main (String[] a){ 
        // restrict the data type to a list using generics
        ArrayList <String> countries = new ArrayList<String>();
        countries.add("UK");
        countries.add("Germany");
        countries.add("Indian");
        countries.add("USA");
        countries.add("Canada");
        countries.add("Dubai");
        countries.add("Austria");
        for (String c:countries){
            System.out.println(c);
        }
        
        ArrayList <Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Customer("COO1","American Express","Platinum"));
        customerList.add(new Customer("COO2","Fedex","Gold"));
        customerList.add(new Customer("COO3","Target","Silver"));
        customerList.add(new Customer("COO4","Guitar","Platinum"));
        
        for(Customer c: customerList){
            System.out.println(c.getCustomerName());
        }
    }    
}
