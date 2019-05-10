/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atos.Syntel.CollectionBasics;

import java.util.TreeSet;

/**
 *
 * @author syntel
 */
public class Address implements Comparable<Address>{
    private String city;
    private String state;
    private String country;
    
    public Address() {
        super();
        this.city = "NA";
        this.state = "NA";
        this.country = "NA";
    }

    public Address(String city, String state, String country) {
        super();
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" + "city=" + city + ", state=" + state + ", country=" + country + '}';
    }

    @Override
    public int compareTo(Address o) {       
        
        return o.getCity().compareTo(getCity());
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
