/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atos.Syntel.CollectionBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/** *
 * @author syntel
 */
public class TreeSetOfObjects_05 {
    public static void main(String[] args){
         Set<Address> addressSet =new TreeSet<Address>();
         addressSet.add(new Address("Birminghan","Alabama","USA"));
         addressSet.add(new Address("Phoenix","Arizona","USA"));
         addressSet.add(new Address("Los Angeles","California","USA"));
         addressSet.add(new Address("Little Rock","Arkansas","USA"));
         addressSet.add(new Address("Denver","Colorado","USA"));
         
         for(Address a: addressSet){
             System.out.println(a.getCity()+ " "+ a.getState());
         }
         
         List<Books> bookList=new ArrayList<Books>();
         bookList.add(new Books("B01","jave in Action",276));
         bookList.add(new Books("B02","black book of java",576));
         bookList.add(new Books("B03","java in 21 days",676));
         bookList.add(new Books("B04","java for beginners",560));        
         
        /* Collections.sort(bookList, new SortByBookPageNo());
         for(Books b: bookList){
             System.out.println(b.getBookName()+ " "+ b.getNoOfPage());
         }*/
         System.out.println("------sort by book name---------");
         Collections.sort(bookList,new SortByBookName());
         for(Books b: bookList){
             System.out.println(b.getBookName()+ " "+ b.getNoOfPage());
         }
    }
    
}
