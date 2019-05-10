/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atos.Syntel.Thread;

/**
 *
 * @author syntel
 */
public class RunnableThread_03 implements Runnable{
    public RunnableThread_03(String str){
        super();
    }
     public static void main (String [] args){
        Thread myThread1=new Thread(new RunnableThread_03("First -1"),"First");
        Thread myThread2=new Thread(new RunnableThread_03("Second -1"),"Second");
        myThread1.start();
        myThread2.start();
        System.out.println(myThread1.getPriority());
        System.out.println(myThread2.getPriority());
        System.out.println("Thread names are following:");
        System.out.println(myThread1.getName());
        System.out.println(myThread2.getName());
        
    }
    
    @Override
    public void run() {
        for(int i=0; i<10;i++){
            System.out.println(i+ "  "+Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName());
        }
        try{
            Thread.sleep((int)(Math.random()*1000));
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Done! "+ Thread.currentThread().getName());
    }
   
}
