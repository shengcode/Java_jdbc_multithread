package managePackge;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.atosSyntel.service.CustomerCRUDoperationsCollectionsService;
import com.atosSyntel.model.Customer;
import com.atosSyntel.service.CRUDOPerationCollectionsMap;

/** *
 * @author syntel
 */
public class ManagerMyCustomerCollections {
    
    public static void main (String[]s){
    CustomerCRUDoperationsCollectionsService custService = new CustomerCRUDoperationsCollectionsService();
    
    Customer c1=new Customer("COO1","American Express","Platinum");
    Customer c2=new Customer("COO2","Fedex","Gold");
    Customer c3= new Customer("COO3","Target","Silver");
    Customer c4=new Customer("COO4","Guitar","Platinum");
          
    custService.add(c1);
   custService.add(c2);
   custService.add(c3);
   custService.add(c4);    
    //custService.displayAllCustomers();  
  // custService.delete("COO4");   
   //custService.displayAllCustomers();    
  // custService.searchName("Target");
   
   CRUDOPerationCollectionsMap cust=new CRUDOPerationCollectionsMap();
   cust.add(c1.getCustomerId(),c1);
   cust.add(c2.getCustomerId(), c2);
   cust.add(c3.getCustomerId(), c3);
   cust.add(c4.getCustomerId(), c4);
     
    cust.displayAllCustomers();
    System.out.println("  test the search id function ---------");
    cust.search("COO4");
    System.out.println("  test the search name function ---------");
    cust.searchName("Target");
    
    System.out.println("------test the update function-------");
    cust.update("COO4", "changedName");
    cust.displayAllCustomers();
    
    cust.delete("COO4");
    System.out.println("--------test my delete function------------");
    cust.displayAllCustomers();
}
}
