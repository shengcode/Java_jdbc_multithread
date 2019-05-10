/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atosSyntel.model;

/**
 *
 * @author syntel
 */
public class Customer {
    private String customerId;
    private String customerName;
    private String customerCategory;
    
    
    
    public Customer(){
        super();
        this.customerId = "NA";
        this.customerName="NA";
        this.customerCategory="NA";
        
    }
    
    public Customer(String customerId, String customerName, String customerCategory){
        super();
        this.customerId = customerId;
        this.customerName=customerName;
        this.customerCategory=customerCategory;
        
    }

    public String getCustomerId() {
        return customerId;
    }
 
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCategory() {
        return customerCategory;
    }

    public void setCustomerCategory(String customerCategory) {
        this.customerCategory = customerCategory;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", customerName=" + customerName + ", customerCategory=" + customerCategory + '}';
    }
    
    
}
