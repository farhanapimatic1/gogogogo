/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Ancestors 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5439614086228165768L;
    private List<BrowseNode> browseNode;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("BrowseNode")
    public List<BrowseNode> getBrowseNode ( ) { 
        return this.browseNode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("BrowseNode")
    public void setBrowseNode (List<BrowseNode> value) { 
        this.browseNode = value;
        notifyObservers(this.browseNode);
    }
 
}
 