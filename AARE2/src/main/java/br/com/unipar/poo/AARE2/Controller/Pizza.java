/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.poo.AARE2.Controller;

import java.util.ArrayList;

/**
 *
 * @author Matheus
 */
public class Pizza {
    
    private String Size;
    private ArrayList<String> flavors;
    private Double Price;
    private String Border;
    private int QtFlavors;
    
    public String getSize(){
        return Size;
    }
    public void setSize(String Size){
        this.Size = Size;
    }
    public ArrayList<String> getflavors(){
        return flavors;
    }
    public void setflavors(ArrayList<String> flavors){
        this.flavors = flavors;
    }
    public Double getPrice(){
        return Price;
    }
    public void setPrice(Double Price){
        this.Price = Price;
    }
    public String getBorder(){
        return Border;
    }
    public void setBorder(String Border){
        this.Border = Border;
    }  
    public int getQtFlavors(){
        return QtFlavors;
    }
    public void setQtFlavors(int QtFlavors) {
        this.QtFlavors = QtFlavors;
    }
}
