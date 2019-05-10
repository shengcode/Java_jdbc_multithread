/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.atosSyntel.databaseBasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author syntel
 */
public class PreparedStatement_basics {
    public static void main(String[] args){
        
            Connection myOracleConnection=null;
            //Statement myOracleStatement=null;
            ResultSet myOracleRS;
            PreparedStatement myOraclePreparedStatement=null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
         catch (ClassNotFoundException ex) {
            Logger.getLogger(PreparedStatement_basics.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            myOracleConnection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
        } catch (SQLException ex) {
            Logger.getLogger(PreparedStatement_basics.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            myOraclePreparedStatement= myOracleConnection.prepareStatement("Insert into customer (customerId, customerName,cust"
                    + "omerCategory)values(?,?,?)");
        } catch (SQLException ex) {
            Logger.getLogger(PreparedStatement_basics.class.getName()).log(Level.SEVERE, null, ex);
        }
       try{ myOraclePreparedStatement.setString(1,"id");
        myOraclePreparedStatement.setString(2,"name");
        myOraclePreparedStatement.setString(3,"category");
       }
       catch (SQLException ex){
            System.out.println();
       }
       
        try {
            int status = myOraclePreparedStatement.executeUpdate();
            System.out.println(status);
        } catch (SQLException ex) {
            Logger.getLogger(PreparedStatement_basics.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         finally{            
                try {
                    myOraclePreparedStatement.close();
                    myOracleConnection.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage()); 
                }                
        }
    }
}
