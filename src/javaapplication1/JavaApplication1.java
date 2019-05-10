package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        // String is a class in Java
        /*System.out.println("I Love Netbeans");
        //System.out.println("Hello "+ args[0]);
        //System.out.println("Hello "+ args[1]);
        
        System.out.println("----------");
        for(int i=0; i<args.length; i++)
            System.out.println(args[i]);
        for (String name: args)
            System.out.println("Hello "+ name);
*/
       
        
        
        /*int sum=0;
        for (String num: args){
            sum = sum +Integer.parseInt(num);
        }
        System.out.println(sum);
        */
        System.out.println("how many inputs you want to do:");
        Scanner sc =new Scanner (System.in);
        int num_inputes=sc.nextInt();
        System.out.println("so you want "+ num_inputes+ " inputs");
        int new_sum=0;
        for(int i =0; i<num_inputes; i++){
            System.out.print("what is your input:");
            int sc_num=sc.nextInt();
            new_sum=new_sum+sc_num;
        }
        System.out.print("Your sum is:");
        System.out.println(new_sum);
     
    }
    
}
