/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.atosSyntel.databaseBasics;

import com.atosSyntel.model.Customer;
import com.atosSyntel.service.CRUDOperationsCollections;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author syntel
 */
public class CRUDCallableStatementsForJunit  {
    Connection myOracleConnection;
    ResultSet myOracleRS;
    CallableStatement myCallableStatement=null;
    
    

    public CRUDCallableStatementsForJunit() {
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
   }   
    
    public void add(Object o) {
        Customer cusAdd= (Customer)o;
        try {
        myCallableStatement=myOracleConnection.prepareCall("{ call ADD_DATA (?,?,?) }");
        myCallableStatement.setString(1,cusAdd.getCustomerId());
        myCallableStatement.setString(2,cusAdd.getCustomerName());
        myCallableStatement.setString(3,cusAdd.getCustomerCategory());
        myCallableStatement.executeQuery();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }  
        try {
        myCallableStatement.close();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        
    }

    
   

    
    public  String search(String id) {
        String customerName="";
        try{
        myCallableStatement=myOracleConnection.prepareCall("{?=call SEARCH_ID_02 (?) }");
        myCallableStatement.setString(2,id);
        myCallableStatement.registerOutParameter(1,Types.VARCHAR);
        myCallableStatement.executeQuery();
        customerName = myCallableStatement.getString(1);
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }        
        try {
            myCallableStatement.close();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
       return customerName;
   }    
    
    public void closeAllConnections(){
        try {
            myOracleConnection.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
