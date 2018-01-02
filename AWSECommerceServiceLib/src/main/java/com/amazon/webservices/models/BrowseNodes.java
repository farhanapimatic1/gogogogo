/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class BrowseNodes 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4926135676675060916L;
    private Request request;
    private List<BrowseNode> browseNode;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Request")
    public Request getRequest ( ) { 
        return this.request;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Request")
    public void setRequest (Request value) { 
        this.request = value;
        notifyObservers(this.request);
    }
 
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
 