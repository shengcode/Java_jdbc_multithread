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
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author syntel
 */
public class CallableStatementBasics {   
    
 public static void main (String [] args){
            Connection myOracleConnection=null;
            ResultSet myOracleRS;
            CallableStatement myCallableStatement=null;
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
         myCallableStatement=myOracleConnection.prepareCall("{ ? = call GetEmployeeName ( ? ) }");
     } catch (SQLException ex) {
         Logger.getLogger(CallableStatementBasics.class.getName()).log(Level.SEVERE, null, ex);
     }
     try {
       myCallableStatement.setInt(2,103);        
       myCallableStatement.registerOutParameter(1,Types.VARCHAR);
       myCallableStatement.executeQuery();
       String employename=myCallableStatement.getString(1); 
    // 1 is the index positon
    System.out.println(employename);
     }
     catch (SQLException ex){
     
     }
        }
}
