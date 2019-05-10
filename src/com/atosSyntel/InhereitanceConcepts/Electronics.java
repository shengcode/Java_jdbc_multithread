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
public class Electronics extends Assets{
    private String electronicType;
    private String make;
    private String model;

    public Electronics() {        
        super();
        //this.electroniType
        this.electronicType="NA";
        this.make="NA";
        this.model="NA";
    }

    public Electronics(String assetID, String assetCategory, String assetName, String electronicType, String make,
            String model) {
        super(assetID, assetCategory, assetName);
        this.electronicType=electronicType;
        this.make=make;
        this.model=model;
    }

    public String getElectronicType() {
        return electronicType;
    }

    public void setElectronicType(String electronicType) {
        this.electronicType = electronicType;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
     public void allocate() {
        System.out.println("Allocated to Training");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    
    }
    @Override
    public void deallocate() {
        System.out.println("deallocated to back to the yard");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    //function overriding, same function name across the parent child class ///
    @Override
    public void trackAssets(){
        System.out.println("----tracking electronics-----------");
    }
   /* @Override
    public String toString() {
        super.toString();
        return "Electronics{" + "electronicType=" + electronicType + ", make=" + make + ", model=" + model + '}';
    }*/

    @Override
    public String toString() {
        return "Electronics{" + "electronicType=" + electronicType + ", make=" + make + ", model=" + model + super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
   
    
    
    
}
