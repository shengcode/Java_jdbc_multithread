/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.atosSyntel.databaseBasics;

import com.atosSyntel.model.Customer;
import com.atosSyntel.service.CRUDOperationsCollections;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author syntel
 */
public class JDBCmethods implements CRUDOperationsCollections {
    Connection myOracleConnection;
    Statement myOracleStatement;
    ResultSet myOracleRS;
    public JDBCmethods() {
        super();        
    }
  
   public void getConnected(){
       try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch (ClassNotFoundException ex) {
                System.out.println("Exception:"+ex.getMessage());
         }
        try{
            myOracleConnection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
        }               
     
        catch (SQLException ex){
            System.out.println("Exception:"+ex.getMessage());
            
        }
        
        System.out.println("conenction done!!");
        try{
        myOracleStatement=myOracleConnection.createStatement(); 
        }
        catch(SQLException ex){
            System.out.println("Exception:"+ex.getMessage());
        }
   }

    @Override
    public void add(Object o) {
        Customer cust=(Customer)o;
        String query= "INSERT INTO customer (CUSTOMERID,CUSTOMERNAME,CUSTOMERCATEGORY) VALUES ("+
                "\'"+cust.getCustomerId()+"\'"+","+
                "\'"+cust.getCustomerName()+"\'"+","+
                "\'"+cust.getCustomerCategory()+"\')";
        //System.out.println(query);
        ExecuteQuery(query);
    }

    @Override
    public void delete(String id) {
       String query="delete from customer where customerId="+"\'"+id+"\'";
       ExecuteQuery(query);
    }

    @Override
    public void search(String id) {
        String query= "select * from customer where customerId="+"\'"+id+"\'";
        ExecuteQuery(query);
        try {
            while(myOracleRS.next()){
                System.out.println("I found the row with the specified id");
                System.out.println(myOracleRS.getString("customerId")+" "+myOracleRS.getString("customerName")+" "+
                        myOracleRS.getString("customerCategory"));
                
            }} catch (SQLException ex) {
            System.out.println("excepetion is "+ ex.getMessage());
        }
         
    }

    @Override
    public void searchName(String name) {
        String query= "select * from customer where customerName="+"\'"+name+"\'";
        ExecuteQuery(query);
        try {
            while(myOracleRS.next()){
                System.out.println("I found the row with the specified Name");
                System.out.println(myOracleRS.getString("customerId")+" "+myOracleRS.getString("customerName")+" "+
                        myOracleRS.getString("customerCategory"));
                
            }} catch (SQLException ex) {
            System.out.println("excepetion is "+ ex.getMessage());
        }
    }

    @Override
    public void update(String id, String newName) {
         String query= "select * from customer where customerId="+"\'"+id+"\'";
         System.out.println(query);
         ExecuteQuery(query);
          try {
            while(myOracleRS.next()){
              String updateQuery="update customer set customerName="+"\'"+newName+"\'"+"where customerId="+"\'"+myOracleRS.getString("customerId")+"\'" ;
              ExecuteQuery(updateQuery);
            }} catch (SQLException ex) {
            System.out.println("excepetion is "+ ex.getMessage());
        }
          
    }
    
        public void ExecuteQuery(String query){
         try {
            myOracleRS=myOracleStatement.executeQuery(query);
        } catch (SQLException ex) {
            System.out.println("Exception:"+ex.getMessage());
        }
    }
        public void DisplayAllEntries(){
            String query = "Select * from customer";
            ExecuteQuery(query);
            try {
            while(myOracleRS.next()){
                System.out.println(myOracleRS.getString("customerId")+" "+myOracleRS.getString("customerName")+" "+
                        myOracleRS.getString("customerCategory"));                             
            }} catch (SQLException ex) {
            System.out.println("excepetion is "+ ex.getMessage());
            }          
        }
    public void CloseConenctions(){
         try {
                    //myOracleStatement.close();
                    myOracleConnection.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage()); 
                }   
    }
     public Connection getMyOracleConnection() {
        return myOracleConnection;
    }

    public void setMyOracleConnection(Connection myOracleConnection) {
        this.myOracleConnection = myOracleConnection;
    }    

    public Statement getMyOracleStatement() {
        return myOracleStatement;
    }

    public void setMyOracleStatement(Statement myOracleStatement) {
        this.myOracleStatement = myOracleStatement;
    }

    public ResultSet getMyOracleRS() {
        return myOracleRS;
    }

    public void setMyOracleRS(ResultSet myOracleRS) {
        this.myOracleRS = myOracleRS;
    }
    
    
}   
    
    

