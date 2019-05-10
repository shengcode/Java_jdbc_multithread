/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atosSyntel.service;

import com.atosSyntel.model.Customer;
import java.util.ArrayList;

/**
 *
 * @author syntel
 */
public class CustomerCRUDoperationsCollectionsService implements CRUDOperationsCollections{
    ArrayList <Customer> customers;    
    // add the constructor 

    public CustomerCRUDoperationsCollectionsService() {
        super();
        customers=new ArrayList<Customer>();
    }
    public CustomerCRUDoperationsCollectionsService(ArrayList <Customer>customers) {
        super();
        this.customers=customers;
    }
    
    
    @Override
    public void add(Object o) {
        customers.add((Customer)o);       
    }
    
    @Override
    public void delete(String id) {      
        int i=0;
        for (Customer c: customers){
            if(c.getCustomerId().equals(id)){
                i=customers.indexOf(c);
                //customers.remove(c);
            }
            
        }
        if (i<0)
            System.out.println(" i did not find");
        else customers.remove(i);
        
        
       
        
       
       /*for(int i=0; i<customers.size();i++){
            System.out.println(i);
            if(customers.get(i).getCustomerId().equals(id)){
                System.out.println("removed");
                customers.remove(i);
            }
        }*/
    }
    
    public void displayAllCustomers(){
        for (Object o: customers){
            System.out.println(o);
        }
    }

    @Override
    public void search(String id) {
        for(Customer c: customers){
            if(c.getCustomerId().equals(id)){
                System.out.println(c);
            }
        }
    }

    @Override
    public void update(String id, String new_name) {
       for(Customer c: customers){
            if(c.getCustomerId().equals(id)){
                //System.out.println(c);
                c.setCustomerName(new_name);
            }
        }
    }

    @Override
    public void searchName(String name) {
        for(Customer c: customers){
            if(c.getCustomerName().equals(name)){
                System.out.println(c);
            }
        }
    }
}
