/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atos.Syntel.CollectionBasics;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author syntel
 */
public class TreeSet_04 {
    public static void main(String[] args){
        
        // every time a set is to displayed by defult it requires you to sort it 
         Set<String> countries =new TreeSet<String>();
         countries.add("American");
         countries.add("Austria");
         countries.add("US");
         countries.add("Russian");
         countries.add("UK");
         
         
         Iterator it = countries.iterator();
         while(it.hasNext()){
             System.out.println(it.next());
         }
         System.out.println("-----deleting an element------");
         countries.remove("Austria");
         for(String s: countries){
             System.out.println(s);
         }
         System.out.println("----sort your selt in descending order-----");
         //Collections.sort((countries);
         //Iterator t1=countries.
         
         
         //TreeSet<Address>add_tree=new TreeSet<Address>();
         
    }
    
}
