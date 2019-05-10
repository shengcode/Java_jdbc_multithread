/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.atosSyntel.databaseBasics;

import com.atosSyntel.model.Customer;

/**
 *
 * @author syntel
 */
public class ManageCallableJunit {
    public static void main (String[] args){
        CRUDCallableStatementsForJunit callObje = new CRUDCallableStatementsForJunit();
        callObje.getConnected();
        Customer c1=new Customer("COO1","American Express","Platinum");
        Customer c2=new Customer("COO2","Fedex","Gold");
        Customer c3= new Customer("COO3","Target","Silver");
        Customer c4=new Customer("COO4","Guitar","Platinum");
        callObje.add(c1);
        callObje.add(c2);
        callObje.add(c3);
        callObje.add(c4);
       
        System.out.println(callObje.search("COO2"));       
        
        callObje.closeAllConnections();
    }    
}
