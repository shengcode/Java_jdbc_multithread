/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atosSyntel.model;

import ExceptionHandling.NameException;
import ExceptionHandling.NumberException;

/**
 *
 * @author syntel
 * 
 */


 
public class Skills {
    private String SkillId;
    private String SkillName;
    private String SkillCategory;
    private String skillsProficiency;
    public enum Skil_category
{ 
    Coding, Testing, Analytics, Management, Designing; 
}
    public Skills(){
        super();
        this.SkillId="NA";
        this.SkillName="NA";  // the characters in the name should be longer than 1
        this.SkillCategory="NA";
        this.skillsProficiency="NA";
    }
    public Skills(String SkillId, String SkillName, Skil_category SkillCategory, String SkillExpertise)throws NameException,NumberException{
        // the method should throw the exception;
        
        super();
        this.SkillId=SkillId; 
         if(SkillName.length()<=1){
             throw new NameException("skill Name should be longer than one character");
         }
         else{
            System.out.println("Input is valid!!");
            this.SkillName=SkillName;
         }
        this.SkillCategory=SkillCategory.toString();
        if(Integer.parseInt(SkillExpertise)>5 || Integer.parseInt(SkillExpertise)<1){
           throw new NumberException("experience should between 1 and 5 ");
        }
        else {
            this.skillsProficiency=SkillExpertise;
        }
    }

    @Override
    public String toString() {
        return "Skills{" + "SkillId=" + SkillId + ", SkillName=" + SkillName + ", SkillCategory=" + SkillCategory + ", SkillExpertise=" + skillsProficiency + '}';
    }
    

    public String getSkillId() {
        return SkillId;
    }

    public void setSkillId(String SkillId) {
        this.SkillId = SkillId;
    }

    public String getSkillName() {
        return SkillName;
    }

    public void setSkillName(String SkillName) {
        this.SkillName = SkillName;
    }

    public String getSkillCategory() {
        return SkillCategory;
    }

    public void setSkillCategory(String SkillCategory) {
        this.SkillCategory = SkillCategory;
    }

    public String getSkillExpertise() {
        return skillsProficiency;
    }

    public void setSkillExpertise(String SkillExpertise) {
        this.skillsProficiency = SkillExpertise;
    }
    
    
 
    
}
