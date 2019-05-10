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
public class RunnableThread_02 extends Thread{
    
    public RunnableThread_02(String str){
        super(str);
        
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
        new RunnableThread_02("First").start();        
    }
}
