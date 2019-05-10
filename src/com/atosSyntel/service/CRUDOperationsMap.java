/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atosSyntel.service;
import com.atosSyntel.model.Customer;

/**
 *
 * @author syntel
 */
public interface CRUDOperationsMap {
    public void add(String key, Customer c);
    public void delete(String id);     
    public void search(String id);
    public void searchName(String name);
    public void update(String id, String newName);  
}
