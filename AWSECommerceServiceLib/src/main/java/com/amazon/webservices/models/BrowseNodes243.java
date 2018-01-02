/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class BrowseNodes243 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4657946997999678273L;
    private Request162 request;
    private List<BrowseNode> browseNode;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Request")
    public Request162 getRequest ( ) { 
        return this.request;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Request")
    public void setRequest (Request162 value) { 
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
 