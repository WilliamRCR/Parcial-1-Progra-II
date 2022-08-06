package com.parcial;

public class Order{
     
     private int orderid;
     private String dateCreated;
     private String dateShipped;
     private String customerName;
     private String customerid;
     private String status;
     private String shippingId;

     public Order(int orderid, String dateCreated, String dateShipped,
     String customerName, String customerid, String status, String shippingId){

        this.orderid = orderid;
        this.dateCreated = dateCreated;
        this.dateShipped = dateShipped;
        this.customerName = customerName;
        this.status = status;
        this.shippingId = shippingId;

     }
     

    public void placeOrder();
}
