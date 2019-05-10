/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atosSyntel.InhereitanceConcepts;

/**
 *
 * @author syntel
 */
public class Furniture extends Assets{

   
    private String furnitureType;
    private String color;

    public Furniture() {
        super();//referring to the constructor of the parent class
        this.furnitureType="NA";
        this.color="NA";
    }
    
    

    
    public Furniture(String assetID, String assetCategory, String assetName, String furnitureType, String color) {
        // it automatically make a call to the super class;
        
        super(assetID, assetCategory, assetName);
        //System.out.println(a);
        this.furnitureType=furnitureType;
        this.color=color;        
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
     @Override
    public void allocate() {
        System.out.println("Allocated to Training");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    
    }
    @Override
    public void deallocate() {
        System.out.println("deallocated to back to the yard");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void trackAssets(){
        System.out.println("----tracking furniture-----------");
    }

    @Override
    public String toString() {
        return "Furniture{" + "furnitureType=" + furnitureType + ", color=" + color + super.toString()+ "}";
    }
    
    
    
}
