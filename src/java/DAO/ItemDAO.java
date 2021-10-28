/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Item;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CuongP
 */
public class ItemDAO extends DAO {

    public ArrayList<Item> getAllItem() {
        String sql = "SELECT * FROM banquanao.tblitem";
        ArrayList<Item> list = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Item item = new Item();
                item.setId(rs.getInt("id"));
                item.setName(rs.getString("name"));
                item.setDescription(rs.getString("description"));
                item.setPrice(rs.getFloat("price"));
                item.setQuanlity(rs.getFloat("quanlity"));
                item.setImage(rs.getString("image"));
                list.add(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error getAllItem");
        }
        
        return list;
    }
    
    public Item getNewItem() {
        String sql = "select * from banquanao.tblitem ORDER BY id DESC LIMIT 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Item item = new Item();
                item.setId(rs.getInt("id"));
                item.setName(rs.getString("name"));
                item.setDescription(rs.getString("description"));
                item.setPrice(rs.getFloat("price"));
                item.setQuanlity(rs.getFloat("quanlity"));
                item.setImage(rs.getString("image"));
                
                return item;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
//    public static void main(String[] args) {
//        ItemDAO id = new ItemDAO();
//        ArrayList<Item> list = id.getAllItem();
//        Item item  = id.getNewItem();
//        System.out.println(item);
//
//    }
    
}
