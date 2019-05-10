/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atos.Syntel.IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author syntel
 */
public class FileOutPutStreamExample {
    public static void main (String [] args){
        OutputStream fileOutPutStream=null;
        try {            
            fileOutPutStream =new FileOutputStream("C:\\Example\\output.txt", true);
            String toFileName;
            //char[]myBuffer="my new file. data is written using output stream";
            fileOutPutStream.write(13);
            fileOutPutStream.write(65);
            fileOutPutStream.write(67);
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        catch (IOException e){
            System.out.println("exception when writing to the file "+ e.getMessage());
            e.printStackTrace();
        }finally{
             try{
                 fileOutPutStream.close();
             }catch (IOException e){
                 System.out.println("exception when closeing the file "+ e.getMessage());
                 e.printStackTrace();
             }
        
        }         
    
    }
}
