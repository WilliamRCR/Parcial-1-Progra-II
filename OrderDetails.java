package com.parcial;

public class OrderDetails(){

    private int orderid;
    private int productId;
    private String productName;
    private int quantity;
    private float unitCost;
    private float subtotal;

    public OrderDetails(int orderid, int productId, String productName,
    int quantity, float unitCost, float subtotal){

        this.orderid = orderid;
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.unitCost = unitCost;
        this.subtotal = subtotal;

    } 

    public void calcPrice();
}