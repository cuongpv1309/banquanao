/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author CuongP
 */
public class Item implements Serializable{
    public int id;
    public String name;
    public String description;
    public float price;
    public float quanlity;
    public String image;

    public Item() {
    }

    public Item(int id, String name, String description, float price, float quanlity, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quanlity = quanlity;
        this.image = image;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(float quanlity) {
        this.quanlity = quanlity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", quanlity=" + quanlity + ", image=" + image + '}';
    }

    
    
}
