package com.atos.Syntel.CollectionBasics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author syntel
 */
public class ArrayListBasics_01 {
    
    public static void main (String[] a){        
        //1.creation of array list 
        List arrList1=new ArrayList();
        // adding elements to the arraylist
        arrList1.add("Java");
        arrList1.add("Python");
        arrList1.add("c#");      
        for ( Object s: arrList1){
            System.out.println(s);
        }
        System.out.println("--------heterogeneous List -------------");
        arrList1.add(87678);
        arrList1.add(false);        
       /* for ( Object s: arrList1){
            System.out.println(s);
        }*/
        Iterator it =arrList1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        System.out.println("-------arry list properties");
        arrList1.add(0,1234);
        arrList1.add(2,"JavaScript");
        for(int i=0; i<arrList1.size(); i++){
            System.out.println(arrList1.get(i));
        }        
        System.out.println("search for java within arraylist  "+arrList1.contains("Java")); 
        System.out.println("search for String within arraylist  "+arrList1.contains("String")); 
        
        System.out.println("search for position of java within arraylist  "+arrList1.indexOf("Java")); 
        
        System.out.println("remove elements from the list, the position 2");
        arrList1.remove(2);
    }    
}
