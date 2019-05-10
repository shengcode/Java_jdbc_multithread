/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atos.Syntel.CollectionBasics;
import java.util.Comparator;

/**
 *
 * @author syntel
 */
public class SortByBookPageNo implements Comparator<Books>{

    @Override
    public int compare(Books b1, Books b2) {
        return b1.getNoOfPage()-b2.getNoOfPage();        
    }
    
    //public int compare (Boo)
    
}
