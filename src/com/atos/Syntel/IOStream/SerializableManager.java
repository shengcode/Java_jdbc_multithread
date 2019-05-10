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
public class SerializableManager {
    public static void main( String[] args){
    String filename = "C:/example/person.txt";
    
    Person p1=new Person ("Jenn",10,"Male");
    Person p2=new Person ("Bobby",12,"Male");
    Person p3=new Person ("Ricky",10,"Female");
    
    List list=new ArrayList();
    list.add(p1);
    list.add(p2);
    list.add(p3);
    FileOutputStream fos=null;
    ObjectOutputStream out=null;
    
    try{
         fos =new FileOutputStream(filename);
         out=new ObjectOutputStream(fos);
         out.writeObject(list);
         out.close();
         System.out.println("Object Persisted");
    }catch(IOException ex){
         ex.printStackTrace();    
     }
    finally {
          try{
                 fos.close();
                 out.close();
             }catch (IOException e){
                 System.out.println("exception when closeing the file "+ e.getMessage());
                 e.printStackTrace();
             }

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
      finally {
          try{
                 fis.close();
                 in.close();
             }catch (IOException e){
                 System.out.println("exception when closeing the file "+ e.getMessage());
                 e.printStackTrace();
             }

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
