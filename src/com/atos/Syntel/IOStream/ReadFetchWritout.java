/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atos.Syntel.IOStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleTypes;

/**
 * //file reader and file writer to do this data
            // file class can be used to creat a particular file
 * @author syntel
 * 
 * 
 */
class Employee{
    String employee_id;
    String last_name;
    String salary;
    String hire_date;
    
    Employee(String employee_id, String last_name, String salary, String hire_date){
        this.employee_id=employee_id;
        this.last_name= last_name;
        this.salary =salary;
        this.hire_date=hire_date;
    }
}
public class ReadFetchWritout {
    public static void main (String [] args){  
        
        FileReader fr=null;
        BufferedReader bufferreader=null;
        List id_detail= new ArrayList <Integer>();
        List employee_list = new ArrayList<Employee>();
        try {         
            String line;
            fr=new FileReader("C:/example/employee.txt");
            bufferreader = new BufferedReader(fr);                    
            //while ((line = bufferreader.readLine()) != null) {   
            while (bufferreader.ready()){
                     line = bufferreader.readLine();
                     System.out.println("the line I get is  "+ line);
                     int employeeId=Integer.parseInt(line);
                     id_detail.add(employeeId);
               /* try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }*/
                     
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }finally{
            try {
                fr.close();
                bufferreader.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }     
        // now the list should have all the ids 
        System.out.println (id_detail.size());
        FetchEmployeeData( id_detail, employee_list);
        System.out.println(employee_list.size());
        for (Object emp: employee_list){
            Employee emp_out=(Employee) emp;
            String path="C:/example/employeeDetails/"+emp_out.employee_id+".txt";
            //System.out.println(path);
            //path="C:/example/testWrite.txt";
            writeOutTheFetchedData (path, emp_out.employee_id, emp_out.last_name, emp_out.salary,
            emp_out.hire_date);
        }
       System.out.println("now I am doing the file read test");
       //FileReaderPlay();
    }    
    public static void FetchEmployeeData( List id_detail,List employee_list){
        Connection myOracleConnection=null;
        CallableStatement myCallableStatement=null;
        ResultSet myOracleRS;        
        try {
            //prepareCall("{call EARCH_ID_01 (?,?) }");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            myOracleConnection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
            System.out.println("conenction done");   
            for (Object i: id_detail){
                int cast_i=(int)i;
                myCallableStatement=myOracleConnection.prepareCall("{ call  GET_EM_INFORM (?,?)}");
                myCallableStatement.setInt(1,cast_i);
                myCallableStatement.registerOutParameter(2, OracleTypes.CURSOR);
                myCallableStatement.executeUpdate();
                myOracleRS = (ResultSet) myCallableStatement.getObject(2);
                while (myOracleRS.next()) {                    
                    String employee_id= myOracleRS.getString("employee_id");
                    String last_name = myOracleRS.getString("last_name");
                    String salary = myOracleRS.getString("salary");
                    String hire_date= myOracleRS.getString("hire_date");
                    Employee em= new Employee(employee_id, last_name, salary, hire_date);	
                    employee_list.add(em);
                }
            }
        } catch (SQLException ex) {
                System.out.println("Exception:"+ex.getMessage());
        }
         catch (ClassNotFoundException ex) {
            System.out.println("Driver class not found");
        }
        finally{            
                try {
                    myCallableStatement.close();
                    myOracleConnection.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage()); 
         }             
    
        }        
    
   }
    
    public static void writeOutTheFetchedData (String path, String employee_id, String last_name, String salary,
        String hire_date){
        FileWriter writer = null;
        String fileContent="id is: "+ employee_id +  "\r\n"
                        + "last name is : "+ last_name +  "\r\n"
                        +"salary is: "+ salary +  "\r\n"
                        +"hire data is: "+ hire_date;
        
        try {
            writer = new FileWriter(path);
            writer.write(fileContent);
            //writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    
    /*public static void writeOutMyOwnInputFile (){
        FileWriter writer = null;
        String path=" C:\\example\\employees.txt";
        String fileContent="103" + "\r\n"
                        + "102"+"\r\n"
                        +"101" + "\r\n"
                        +"100"+ "\r\n" ;
        
        try {
            writer = new FileWriter(path);
            writer.write(fileContent);
            //writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }*/
}

