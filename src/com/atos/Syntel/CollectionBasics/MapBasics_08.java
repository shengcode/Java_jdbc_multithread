/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atos.Syntel.CollectionBasics;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author syntel
 */
public class MapBasics_08 {
    public static void main(String[] args){
        Map<String, String> countries=new HashMap<String, String>();
        countries.put("USA","Washington");
        countries.put("Australia", "Canberra");
        countries.put("Begium", "Brussells");
        countries.put("Columnbia", "Bogota");
        
        for(String s:countries.keySet()){
            System.out.println(s+" "+countries.get(s));        
        }
    }    
}
