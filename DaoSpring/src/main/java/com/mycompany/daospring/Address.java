/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daospring;

import org.springframework.stereotype.Component;

/**
 *
 * @author karthik
 */
@Component
public class Address {

    private String street;
    private String zip;
    private String city;

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }
    
   @Override
   public String toString()
   {
       return "Address[street=" + street + ", city=" + city + ", zip=" + zip + "]";
   }    
}
