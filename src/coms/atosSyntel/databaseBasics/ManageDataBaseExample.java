/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.atosSyntel.databaseBasics;

import com.atosSyntel.model.Customer;
import java.sql.SQLException;
/** *
 * @author syntel
 */
public class ManageDataBaseExample {
    public static void main (String[] args){        
        JDBCmethods jdbcObject=new JDBCmethods();
        jdbcObject.getConnected();
        String create_table="CREATE TABLE customer(customerId varchar2(50),customerName varchar2(50),customerCategory varchar2(50))" ;
        jdbcObject.ExecuteQuery(create_table);        
    // add customer items to the database 
    Customer c1=new Customer("COO1","American Express","Platinum");
    Customer c2=new Customer("COO2","Fedex","Gold");
    Customer c3= new Customer("COO3","Target","Silver");
    Customer c4=new Customer("COO4","Guitar","Platinum");
        jdbcObject.add(c1);
        jdbcObject.add(c2);
        jdbcObject.add(c3);
        jdbcObject.add(c4);
     System.out.println("after INSERT it is !!!!");
     jdbcObject.DisplayAllEntries();    
// search with id 
        jdbcObject.search("COO1");
// search with name
     jdbcObject.searchName("Target");
 //update
     jdbcObject.update("COO1","newName");
     System.out.println("after update it is ########");
     jdbcObject.DisplayAllEntries();
     //delete
     jdbcObject.delete("COO1");
     System.out.println("after delete it is$$$$$$$$$$$$$$$$");
     jdbcObject.DisplayAllEntries();     
     // close all the conenctions:   why there is a conenction close exception
    // jdbcObject.CloseConenctions();     
    String drop_table_purge="DROP TABLE customer purge ";
    jdbcObject.ExecuteQuery(drop_table_purge);

    }
}
