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
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author syntel
 */
public class CRUDCallableStatements implements CRUDOperationsCollections {
    Connection myOracleConnection;
    ResultSet myOracleRS;
    CallableStatement myCallableStatement=null;
    
    

    public CRUDCallableStatements() {
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
    @Override
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

    @Override
    public void delete(String id) {
        try{
        myCallableStatement=myOracleConnection.prepareCall("{call DELETE_DATA (?) }");
        myCallableStatement.setString(1,id);
        myCallableStatement.executeQuery();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        try {
        myCallableStatement.close();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void search(String id) {
        try{
        myCallableStatement=myOracleConnection.prepareCall("{call EARCH_ID_01 (?,?) }");
        myCallableStatement.setString(1,id);
         myCallableStatement.registerOutParameter(2, OracleTypes.CURSOR);
        myCallableStatement.executeUpdate();
        myOracleRS = (ResultSet) myCallableStatement.getObject(2);
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        try {
            while (myOracleRS.next()) {
                System.out.println("customer id is "+myOracleRS.getString("customerid")+
                        "  customer name is "+ myOracleRS.getString("customername")+
                        "  customer category is "+ myOracleRS.getString("customercategory")
                        );             			
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        try {
        myCallableStatement.close();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
       
    }    
    @Override
    public void searchName(String name) {
        try{
        myCallableStatement=myOracleConnection.prepareCall("{call SEARCH_NAME (?,?) }");
        myCallableStatement.setString(1,name);
         myCallableStatement.registerOutParameter(2, OracleTypes.CURSOR);
        myCallableStatement.executeUpdate();
        myOracleRS = (ResultSet) myCallableStatement.getObject(2);
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        try {
            while (myOracleRS.next()) {
                System.out.println("customer id is "+myOracleRS.getString("customerid")+
                        "  customer name is "+ myOracleRS.getString("customername")+
                        "  customer category is "+ myOracleRS.getString("customercategory")
                        );             			
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        try {
        myCallableStatement.close();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        
       
    }

    @Override
    public void update(String id, String newName) {
        try{
        myCallableStatement=myOracleConnection.prepareCall("{call  UPDATE_CUSTOMER (?,?) }");
        myCallableStatement.setString(1,id);
        myCallableStatement.setString(2,newName);
        myCallableStatement.executeUpdate();
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        try {
            myCallableStatement.close();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
   }
    
    public void displayDataCallableStatment(){
        try{
        myCallableStatement=myOracleConnection.prepareCall("{call DISPLAY (?) }");
        myCallableStatement.registerOutParameter(1, OracleTypes.CURSOR);
        myCallableStatement.executeUpdate();
        myOracleRS = (ResultSet) myCallableStatement.getObject(1);
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        try {
            while (myOracleRS.next()) {
                System.out.println("customer id is "+myOracleRS.getString("customerid")+
                        "  customer name is "+ myOracleRS.getString("customername")+
                        "  customer category is "+ myOracleRS.getString("customercategory")
                        );             			
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            myCallableStatement.close();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    
    }
    public void closeAllConnections(){
        try {
            myOracleConnection.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
