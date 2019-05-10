/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atos.Syntel.Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author syntel
 */
public class TestPrioritySet implements Runnable{
    static boolean finish=false;
    int count=0;

    @Override
    public void run() {
        do {
            count++;
        }while (finish==false && count<9);
        //finish=true;
    }
    public static void main (String[] args){
        
            TestPrioritySet tnps1= new TestPrioritySet();
            TestPrioritySet tnps2= new TestPrioritySet();
            TestPrioritySet tnps3= new TestPrioritySet();
            //Runnable r=new RunnableThread_01("First");
            Thread th1=new Thread(tnps1);
            Thread th2=new Thread(tnps2);
            Thread th3=new Thread(tnps3);
            
            System.out.println("th1 thread priority = "+ th1.getPriority());
            System.out.println("th2 thread priority = "+ th2.getPriority());
            System.out.println("th3 thread priority = "+ th3.getPriority());
            th1.start();
            th2.start();
            th3.start();
            
            
            
        try {    
            th1.join();
            th2.join();
            th3.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("tnps1 count is "+ tnps1.count);
        System.out.println("tnps2 count is "+ tnps2.count);
        System.out.println("tnps3 count is "+ tnps3.count);
    }
}
