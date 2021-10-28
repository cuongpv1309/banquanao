/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author CuongP
 */
public class Shipment implements java.io.Serializable{
    public int id;
    public String name;
    public String email;
    public int rate;
    public int ordership;

    public Shipment() {
    }

    public Shipment(int id, String name, String email, int rate, int ordership) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.rate = rate;
        this.ordership = ordership;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getOrdership() {
        return ordership;
    }

    public void setOrdership(int ordership) {
        this.ordership = ordership;
    }
    
}
