/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atos.Syntel.JunitExamples;

/**
 *
 * @author syntel
 */
public class MathOperations {
    public int addValues(int x, int y){
        return (x+y);
    }
    //written the overwritten method, depends on the thing you get we should get different set of valyes 
    public String addValues(String x, String y){
        return (x+y);
    }
    public int subtractValues(int x, int y){
        return (x-y);
    }
    
}
