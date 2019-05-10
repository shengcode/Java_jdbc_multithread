/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atosSyntel.InhereitanceConcepts;
  // package name convention should be like com.atos.syntel with this dots 


/**
 *
 * @author syntel
 */
abstract public class Assets implements IAllocation {
    private String assetID;
    private String assetCategory;
    private String assetName;

    public Assets() {
        super();
        this.assetID = "NA";
        this.assetCategory = "NA";
        this.assetName = "NA";
    }

    public Assets(String assetID, String assetCategory, String assetName) {
        //a=300;
        //System.out.println(a);
        this.assetID = assetID;
        this.assetCategory = assetCategory;
        this.assetName = assetName;
    }

    public String getAssetID() {
        return assetID;
    }

    public void setAssetID(String assetID) {
        this.assetID = assetID;
    }

    public String getAssetCategory() {
        return assetCategory;
    }

    public void setAssetCategory(String assetCategory) {
        this.assetCategory = assetCategory;
    }

    public String getAssetName() {
        
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }
    public void trackAssets(){
        System.out.println("----tracking the assets-----------");
    }
    @Override
    public String toString() {
        return "Assets{" + "assetID=" + assetID + ", assetCategory=" + assetCategory + ", assetName=" + assetName + '}';
    }
    
    
    
}
