/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SimilarViewedProducts 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4926743278213647842L;
    private List<SimilarViewedProduct> similarViewedProduct;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SimilarViewedProduct")
    public List<SimilarViewedProduct> getSimilarViewedProduct ( ) { 
        return this.similarViewedProduct;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SimilarViewedProduct")
    public void setSimilarViewedProduct (List<SimilarViewedProduct> value) { 
        this.similarViewedProduct = value;
        notifyObservers(this.similarViewedProduct);
    }
 
}
 