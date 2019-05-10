package com.atosSyntel.service;
import com.atosSyntel.model.Customer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CRUDOPerationCollectionsMap implements CRUDOperationsMap{
    Map <String, Customer> customers;

    public CRUDOPerationCollectionsMap() {
        super();
        customers=new HashMap<String, Customer>();
    }

    public CRUDOPerationCollectionsMap(Map<String, Customer> customers) {
        this.customers = customers;
    }  
    

    @Override
    public void add(String key, Customer c) {
        customers.put(key, c);
    }

    @Override
    //id is also the key of the
    public void delete(String id) {
        Iterator <Map.Entry<String,Customer>>iter=customers.entrySet().iterator();
        while(iter.hasNext()){
            if(iter.next().getValue().getCustomerId().equals(id)){
                iter.remove();
            }
        }             
    }

    @Override
    public void search(String id) {
         for(String key: customers.keySet()){
             //System.out.println(customers.get(key).getCustomerId());
            if( (customers.get(key).getCustomerId()).equals(id)){
                System.out.println(customers.get(key));
            }
         }
    }

    @Override
    public void searchName(String name) {
        for(String key: customers.keySet()){
            if(customers.get(key).getCustomerName().equals(name)){
                System.out.println(customers.get(key));
            }
         }
    }

    @Override
    public void update(String id, String newName) {
         for(String key: customers.keySet()){
             //System.out.println(customers.get(key).getCustomerId());
            if( (customers.get(key).getCustomerId()).equals(id)){
                //System.out.println("find you");
                customers.get(key).setCustomerName(newName);
            }
         }
    }
    
    public void displayAllCustomers(){
        for(String key: customers.keySet()){
            System.out.println(customers.get(key));
        }
    }
    
}
