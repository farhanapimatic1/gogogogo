/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class RelatedItems265 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5098305089425004809L;
    private RelationshipEnum relationship;
    private String relationshipType;
    private Integer relatedItemCount;
    private Integer relatedItemPageCount;
    private Integer relatedItemPage;
    private List<RelatedItem264> relatedItem;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Relationship")
    public RelationshipEnum getRelationship ( ) { 
        return this.relationship;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Relationship")
    public void setRelationship (RelationshipEnum value) { 
        this.relationship = value;
        notifyObservers(this.relationship);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("RelationshipType")
    public String getRelationshipType ( ) { 
        return this.relationshipType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("RelationshipType")
    public void setRelationshipType (String value) { 
        this.relationshipType = value;
        notifyObservers(this.relationshipType);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("RelatedItemCount")
    public Integer getRelatedItemCount ( ) { 
        return this.relatedItemCount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("RelatedItemCount")
    public void setRelatedItemCount (Integer value) { 
        this.relatedItemCount = value;
        notifyObservers(this.relatedItemCount);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("RelatedItemPageCount")
    public Integer getRelatedItemPageCount ( ) { 
        return this.relatedItemPageCount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("RelatedItemPageCount")
    public void setRelatedItemPageCount (Integer value) { 
        this.relatedItemPageCount = value;
        notifyObservers(this.relatedItemPageCount);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("RelatedItemPage")
    public Integer getRelatedItemPage ( ) { 
        return this.relatedItemPage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("RelatedItemPage")
    public void setRelatedItemPage (Integer value) { 
        this.relatedItemPage = value;
        notifyObservers(this.relatedItemPage);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("RelatedItem")
    public List<RelatedItem264> getRelatedItem ( ) { 
        return this.relatedItem;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("RelatedItem")
    public void setRelatedItem (List<RelatedItem264> value) { 
        this.relatedItem = value;
        notifyObservers(this.relatedItem);
    }
 
}
 