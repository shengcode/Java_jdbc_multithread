/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atosSyntel.model;

/**
 *
 * @author syntel
 */
public class Projects{
    // properties of the class should be private in nature
    // getter and setters are public;
    
    
    private String projectId;
    private String projectName;
    private Customer client;
    
    public Projects (){
     super();
     this.projectId="NA";
     this.projectName="Not avalible";
     //this.customer='NA';
   
    }
    public Projects (String projectId, String projectName){
     super();
     this.projectId=projectId;
     this.projectName=projectName;  
     }
    
    public Projects (String projectId, String projectName, Customer client){
     super();
     this.projectId=projectId;
     this.projectName=projectName;  
     this.client=client;
    }
   

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Customer getCustomer() {
        return client;
    }

    public void setCustomer(Customer customer) {
        this.client = customer;
    }

    @Override
    public String toString() {
        return "Projects{" + "projectId=" + projectId + ", projectName=" + projectName + ", client=" + client + '}';
    }

    
    
}
