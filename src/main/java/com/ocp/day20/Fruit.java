/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day20;

public class Fruit {
    private String name;
    private Integer amount;
    private Double price;

    public Fruit(String name, Integer amount, Double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public Fruit() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" + "name=" + name + ", amount=" + amount + ", price=" + price + '}';
    }
    
    
    
    
            
    
}
