package com.driver;

import io.swagger.models.auth.In;

public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {

        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM
        this.id = id;
        Integer hour = Integer.valueOf(deliveryTime.substring(0, 2));
        Integer minutes = Integer.valueOf(deliveryTime.substring(3));
        this.deliveryTime = hour*60 + minutes;
    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public void setDeliveryTime(String deliveryTime) {
//        int DeliveryTime = ((Integer.parseInt(deliveryTime.substring(0, 2)) )* 60) + Integer.parseInt(deliveryTime.substring(3, 5));
//        this.deliveryTime = DeliveryTime;
//    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return deliveryTime;}
}
