/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managePackge;

import com.atosSyntel.InhereitanceConcepts.Assets;
import com.atosSyntel.InhereitanceConcepts.Electronics;
import com.atosSyntel.InhereitanceConcepts.Furniture;

/**
 *
 * @author syntel
 */
public class ManageAssets {
    public static void main(String[]s){
    // create instances of electronics 
    Electronics laptop1= new Electronics("Del10110","Computers","HP Laptop","HP","2006","Pro book");
    System.out.println(laptop1);
    
    Furniture chair1=new Furniture("ch001", "office furniture","walmart","chair","black");
    System.out.println(chair1);
    
    Assets asset1=chair1;    
    //chair1 =asset1; // THIS WILL not be allowed 
    
    }
}
