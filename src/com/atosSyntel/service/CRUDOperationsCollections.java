package com.atosSyntel.service;
public interface CRUDOperationsCollections {
    public void add(Object o);
    public void delete(String id);     
    public void search(String id);
    public void searchName(String name);
    public void update(String id, String newName); ///customerName can be update the name 
    
}

