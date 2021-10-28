/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author CuongP
 */
public class Order implements java.io.Serializable{
    public int id;
    public float amount;
    public float discount;
    public Date date;
    public int accountid;
    public int shipmentid;

    public Order() {
    }

    public Order(int id, float amount, float discount, Date date, int accountid, int shipmentid) {
        this.id = id;
        this.amount = amount;
        this.discount = discount;
        this.date = date;
        this.accountid = accountid;
        this.shipmentid = shipmentid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAccountid() {
        return accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public int getShipmentid() {
        return shipmentid;
    }

    public void setShipmentid(int shipmentid) {
        this.shipmentid = shipmentid;
    }
    
    
    
}
