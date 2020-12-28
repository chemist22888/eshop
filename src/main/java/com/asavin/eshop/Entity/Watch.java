package com.asavin.eshop.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Watch {
    Long id;
    String title;
    int price;

    public Watch() {
    }

    public Watch(String title, int price, String description, String fountain) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.fountain = fountain;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFountain() {
        return fountain;
    }

    public void setFountain(String fountain) {
        this.fountain = fountain;
    }

    String description;
    String fountain;
}
