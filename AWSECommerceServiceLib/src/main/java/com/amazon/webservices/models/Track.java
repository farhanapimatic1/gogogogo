/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Track 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5575429603248065849L;
    private int number;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Number")
    public int getNumber ( ) { 
        return this.number;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Number")
    public void setNumber (int value) { 
        this.number = value;
        notifyObservers(this.number);
    }
 
}
 