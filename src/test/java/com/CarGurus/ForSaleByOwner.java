/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CarGurus;

/**
 *
 * @author RANGANI2
 */
public class ForSaleByOwner {
    private String fromPrice;
    private String toPrice;
    private String zip;

    public String getFromPrice() {
        return fromPrice;
    }

    public void setFromPrice(String fromPrice) {
        this.fromPrice = fromPrice;
    }

    public String getToPrice() {
        return toPrice;
    }

    public void setToPrice(String toPrice) {
        this.toPrice = toPrice;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public ForSaleByOwner(String fromPrice, String toPrice, String zip) {
        this.fromPrice = fromPrice;
        this.toPrice = toPrice;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "ForSaleByOwner{" + "fromPrice=" + fromPrice + ", toPrice=" + toPrice + ", zip=" + zip + '}';
    }
    
}
