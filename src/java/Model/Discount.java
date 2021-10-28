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
public class Discount implements java.io.Serializable{
    public int id;
    public String name;
    public String description;
    public float maxdiscount;
    public float mindiscount;

    public Discount() {
    }

    public Discount(int id, String name, String description, float maxdiscount, float mindiscount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.maxdiscount = maxdiscount;
        this.mindiscount = mindiscount;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getMaxdiscount() {
        return maxdiscount;
    }

    public void setMaxdiscount(float maxdiscount) {
        this.maxdiscount = maxdiscount;
    }

    public float getMindiscount() {
        return mindiscount;
    }

    public void setMindiscount(float mindiscount) {
        this.mindiscount = mindiscount;
    }
    
    
    
}
