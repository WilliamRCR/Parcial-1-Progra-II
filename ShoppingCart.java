package com.parcial;

public class ShoppingCart{
     
     private int cantidad;
     private int productId;
     private int quantity;
     private int dateAdded;

     public ShoppingCart(int cantidad, int productId, int quantity, int dateAdded){
        this.cantidad = cantidad;
        this.productId = productId;
        this.quantity = quantity;
        this.dateAdded = dateAdded;
     }

    public void addCartItem();
    public void updateQuantity();
    public void viewCartDetails();
    public void checkout();

}