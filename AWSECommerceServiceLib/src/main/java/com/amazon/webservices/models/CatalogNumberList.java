/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CatalogNumberList 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5555371640053274124L;
    private List<String> catalogNumberListElement;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("CatalogNumberListElement")
    public List<String> getCatalogNumberListElement ( ) { 
        return this.catalogNumberListElement;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("CatalogNumberListElement")
    public void setCatalogNumberListElement (List<String> value) { 
        this.catalogNumberListElement = value;
        notifyObservers(this.catalogNumberListElement);
    }
 
}
 