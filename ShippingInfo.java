package com.parcial;

public class ShippingInfo(){

    private int shippingid;
    private String shippingType;
    private int shippingCost;
    private int shippingRegionid;

    public ShippingInfo(int shippingId, String shippingType, int shippingCost, int shippingRegionid){

        this.shippingId = shippingId;
        this.shippingType = shippingType;
        this.shippingCost = shippingCost;
        this.shippingRegionid = shippingRegionid;

    }

    public void updateShippingInfo();
}