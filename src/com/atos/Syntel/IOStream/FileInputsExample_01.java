/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atos.Syntel.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author syntel
 */
public class FileInputsExample_01 {
    public static void main (String[] args){
        InputStream fileIOStream=null;
        try {
            // or you can do C:/example/test.txt
            fileIOStream = new FileInputStream("c:/Example/input.txt");
            int c;
            while ( (c=fileIOStream.read())!=-1){ // read till the end of the file
                System.out.println(fileIOStream);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File exception :"+ ex.getMessage());
            ex.printStackTrace();
        }catch (IOException e){
            System.out.println("exception while reading teh file "+ e.getMessage());
            e.printStackTrace();
        }
        finally{
            try{
                fileIOStream.close();
            }catch (IOException e){
                System.out.println("exception closing teh file: "+ e.getMessage());
            }
        
        }
        
    }
}
