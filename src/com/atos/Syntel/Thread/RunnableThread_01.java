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
public class RunnableThread_01 implements Runnable{
    
    public RunnableThread_01(String str){
        super();        
        //this.
        
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
    public static void main (String [] args){
        Runnable r=new RunnableThread_01("First");
        Thread t=new Thread(r,"First");
        t.start();
    }
}
