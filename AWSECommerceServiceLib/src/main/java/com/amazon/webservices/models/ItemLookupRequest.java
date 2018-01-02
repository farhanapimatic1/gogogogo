/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ItemLookupRequest 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5729974861060974598L;
    private ConditionEnum condition;
    private IdTypeEnum idType;
    private String merchantId;
    private List<String> itemId;
    private List<String> responseGroup;
    private String searchIndex;
    private Object variationPage;
    private Object relatedItemPage;
    private List<String> relationshipType;
    private String includeReviewsSummary;
    private Integer truncateReviewsAt;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Condition")
    public ConditionEnum getCondition ( ) { 
        return this.condition;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Condition")
    public void setCondition (ConditionEnum value) { 
        this.condition = value;
        notifyObservers(this.condition);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("IdType")
    public IdTypeEnum getIdType ( ) { 
        return this.idType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("IdType")
    public void setIdType (IdTypeEnum value) { 
        this.idType = value;
        notifyObservers(this.idType);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MerchantId")
    public String getMerchantId ( ) { 
        return this.merchantId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MerchantId")
    public void setMerchantId (String value) { 
        this.merchantId = value;
        notifyObservers(this.merchantId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ItemId")
    public List<String> getItemId ( ) { 
        return this.itemId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ItemId")
    public void setItemId (List<String> value) { 
        this.itemId = value;
        notifyObservers(this.itemId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ResponseGroup")
    public List<String> getResponseGroup ( ) { 
        return this.responseGroup;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ResponseGroup")
    public void setResponseGroup (List<String> value) { 
        this.responseGroup = value;
        notifyObservers(this.responseGroup);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SearchIndex")
    public String getSearchIndex ( ) { 
        return this.searchIndex;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SearchIndex")
    public void setSearchIndex (String value) { 
        this.searchIndex = value;
        notifyObservers(this.searchIndex);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("VariationPage")
    public Object getVariationPage ( ) { 
        return this.variationPage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("VariationPage")
    public void setVariationPage (Object value) { 
        this.variationPage = value;
        notifyObservers(this.variationPage);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("RelatedItemPage")
    public Object getRelatedItemPage ( ) { 
        return this.relatedItemPage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("RelatedItemPage")
    public void setRelatedItemPage (Object value) { 
        this.relatedItemPage = value;
        notifyObservers(this.relatedItemPage);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("RelationshipType")
    public List<String> getRelationshipType ( ) { 
        return this.relationshipType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("RelationshipType")
    public void setRelationshipType (List<String> value) { 
        this.relationshipType = value;
        notifyObservers(this.relationshipType);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("IncludeReviewsSummary")
    public String getIncludeReviewsSummary ( ) { 
        return this.includeReviewsSummary;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("IncludeReviewsSummary")
    public void setIncludeReviewsSummary (String value) { 
        this.includeReviewsSummary = value;
        notifyObservers(this.includeReviewsSummary);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TruncateReviewsAt")
    public Integer getTruncateReviewsAt ( ) { 
        return this.truncateReviewsAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TruncateReviewsAt")
    public void setTruncateReviewsAt (Integer value) { 
        this.truncateReviewsAt = value;
        notifyObservers(this.truncateReviewsAt);
    }
 
}
 