/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atosSyntel.model;

import java.util.Calendar;
import java.util.TimeZone;

public class Employee {
    private String employeeId;
    private String employeeFristTime;
    private String employeeLastTime;
    private String employeeEmail;
    private String employeeCity;
    private String employeeState;
    private String employeeCountry;
    private Skills[] skills;

    public Employee(String First_name, String Last_name,String employeeFristTime, String employeeLastTime, String employeeEmail, String employeeCity, String employeeState, String employeeCountry, Skills[] skills) {
        Calendar cal = Calendar.getInstance();  
        //System.out.println(cal.get(Calendar.MONTH));
        TimeZone timeZone = cal.getTimeZone();
        //System.out.print("timezone is "+timeZone.getID());
        this.employeeId=First_name.charAt(0)+""+Last_name.charAt(0)+""+ (cal.get(Calendar.MONTH)
                +1)+""
                +cal.get(Calendar.DAY_OF_MONTH)+""+cal.get(Calendar.YEAR)+""+cal.get(Calendar.HOUR_OF_DAY)+""
                +cal.get(Calendar.MINUTE)+ ""+cal.get(Calendar.SECOND)+""+timeZone.getID();
        this.employeeFristTime = employeeFristTime;
        this.employeeLastTime = employeeLastTime;
        this.employeeEmail = employeeEmail;
        this.employeeCity = employeeCity;
        this.employeeState = employeeState;
        this.employeeCountry = employeeCountry;
        this.skills = skills;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeFristTime() {
        return employeeFristTime;
    }

    public void setEmployeeFristTime(String employeeFristTime) {
        this.employeeFristTime = employeeFristTime;
    }

    public String getEmployeeLastTime() {
        return employeeLastTime;
    }

    public void setEmployeeLastTime(String employeeLastTime) {
        this.employeeLastTime = employeeLastTime;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeCity() {
        return employeeCity;
    }

    public void setEmployeeCity(String employeeCity) {
        this.employeeCity = employeeCity;
    }

    public String getEmployeeState() {
        return employeeState;
    }

    public void setEmployeeState(String employeeState) {
        this.employeeState = employeeState;
    }

    public String getEmployeeCountry() {
        return employeeCountry;
    }

    public void setEmployeeCountry(String employeeCountry) {
        this.employeeCountry = employeeCountry;
    }

    public Skills[] getSkills() {
        return skills;
    }

    public void setSkills(Skills[] skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Emoployee{" + "employeeId=" + employeeId + ", employeeFristTime=" + employeeFristTime + ", employeeLastTime=" + employeeLastTime + ", employeeEmail=" + employeeEmail + ", employeeCity=" + employeeCity + ", employeeState=" + employeeState + ", employeeCountry=" + employeeCountry + ", skills=" + skills + '}';
    }
    
    
    
    
}
