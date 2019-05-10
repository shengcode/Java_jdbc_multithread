package coms.atosSyntel.databaseBasics;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class OracleConnectionExample_01 {
    public static void main (String[] args){
        Connection myOracleConnection=null;
        Statement myOracleStatement=null;
        ResultSet myOracleRS;
        try {
            //1. Register the driver
            //need to use a class named class
            //mention the name of the package name
            Class.forName("oracle.jdbc.driver.OracleDriver");
            try {
                // 2. to get the connection, it expect 3 things from you, a connection URL, a username, a password
                // url is a combination of the server+portname+serviceid name, sperated by a colounm. defulat
                //port number 1512, the defulat service is XE.
                myOracleConnection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
                //myOrcleConenct
                System.out.println("conenction done");                
                // 3. workd with the queries
                myOracleStatement=myOracleConnection.createStatement();                
                //4. fire the query                
                myOracleRS=myOracleStatement.executeQuery("Select first_name, last_name, salary from employees");
                //5. process the results
                while(myOracleRS.next()){
                    System.out.println(myOracleRS.getString("first_name")+" "+myOracleRS.getString("last_name")+" ");
                
                } 
                // fire a new querey create table
                String create_table="CREATE TABLE customer(customerId varchar2(30),customerName varchar2(30),customerCategory varchar2(20))" ;
                myOracleRS=myOracleStatement.executeQuery(create_table);
                // 
                
                myOracleRS=myOracleStatement.executeQuery("SELECT customerId,customerName, customerCategory from customer");
                while(myOracleRS.next()){
                    System.out.println(myOracleRS.getString("customerID")+" "+myOracleRS.getString("customerName")+" ");
                
                } 
                
            }           
            catch (SQLException ex) {
                System.out.println("Exception:"+ex.getMessage());
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver class not found");
           // Logger.getLogger(OracleConnectionExample_01.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{            
                try {
                    myOracleStatement.close();
                    myOracleConnection.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage()); 
                }                
        }
    }
    
    
  
}
