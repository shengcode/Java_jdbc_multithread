/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atos.Syntel.IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author syntel
 */
public class SerializableManager_01 {
    public static void main( String[] args){
    String filename = "C:/example/person.txt";
    
    Person p1=new Person ("Jenn",10,"Male");
    Person p2=new Person ("Bobby",12,"Male");
    Person p3=new Person ("Ricky",10,"Female");
    
    List list=new ArrayList();
    list.add(p1);
    list.add(p2);
    list.add(p3);
    
     // try with resources ---introduced after java 1.7;, can include multiole resources;
    try (FileOutputStream fos=new FileOutputStream(filename);
            ObjectOutputStream out=new ObjectOutputStream(fos)){         
         out.writeObject(list);
         out.close();
         System.out.println("Object Persisted");
    }catch(IOException ex){
         ex.printStackTrace();    
        }
        ReadObject(filename);
    }    
    public static void ReadObject(String filename){
        List pDetails=null;
        FileInputStream fis =null;
        ObjectInputStream in=null;
     try{   
        fis=new FileInputStream(filename);
        in=new ObjectInputStream(fis);
        pDetails=(ArrayList) in.readObject();
        in.close();
     }catch(IOException ex){
          ex.printStackTrace();
     }catch(ClassNotFoundException ex){
         ex.printStackTrace();
     }
     System.out.println(pDetails.size());
     for(Object p: pDetails){
         printdata((Person)p);
       }
    }
    
    
    
    public static void printdata(Person object1) 
    {   
        System.out.println("name = " + object1.getName()); 
        System.out.println("age = " + String.valueOf(object1.getAge())); 
        System.out.println("gender = " + object1.getGener());          
    } 
}
