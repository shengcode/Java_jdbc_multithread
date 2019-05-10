/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.atosSyntel.databaseBasics;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/** *
 *https://docs.oracle.com/javase/7/docs/api/java/sql/ResultSetMetaData.html
 * database meta data class in java docs;
 */
public class ResultsMetaData {
    public static void main(String[] args){
            Connection myOracleConnection=null;
            ResultSet myOracleRS;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");        
            myOracleConnection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
        } 
        catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }        
        catch (SQLException ex) {
           System.out.println(ex.getMessage());
        }
        
        // set conenct autocommit false (by default it is true)
        // but need to commit the result at the end 
        //    
    }    
}
