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
public class ManageCallableStatement {
    public static void main (String[] args){
        CRUDCallableStatements callObje = new CRUDCallableStatements();
        callObje.getConnected();
        Customer c1=new Customer("COO1","American Express","Platinum");
        Customer c2=new Customer("COO2","Fedex","Gold");
        Customer c3= new Customer("COO3","Target","Silver");
        Customer c4=new Customer("COO4","Guitar","Platinum");
        callObje.add(c1);
        callObje.add(c2);
        callObje.add(c3);
        callObje.add(c4);
        System.out.println("display after insert all 4 customer objects ");
        callObje.displayDataCallableStatment();
        callObje.delete("COO1");
        System.out.println("display after delete COO1");
        callObje.displayDataCallableStatment();
        System.out.println("search for object with id =COO2");
        System.out.println("the searched name with id COO2 is");
        //System.out.println(callObje.search("COO2"));       
        callObje.search("COO2");
        System.out.println("search for object with name = target");
        callObje.searchName("Target");
        System.out.println("update COO2 with NewName ");
        callObje.update("COO2", "NewName");
        System.out.println("display after update ");
        callObje.displayDataCallableStatment();
        callObje.closeAllConnections();
    }    
}
