package com.example.dotrungngoc;

import java.io.Serializable;

public class Bike implements Serializable {
    private String name;
    private String priceOld;
    private String priceNew;
    private String categoty;
    private int img;

    public Bike() {
    }

    public Bike(String name, String priceOld, String priceNew, String categoty, int img) {
        this.name = name;
        this.priceOld = priceOld;
        this.priceNew = priceNew;
        this.categoty = categoty;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriceOld() {
        return priceOld;
    }

    public void setPriceOld(String priceOld) {
        this.priceOld = priceOld;
    }

    public String getPriceNew() {
        return priceNew;
    }

    public void setPriceNew(String priceNew) {
        this.priceNew = priceNew;
    }

    public String getCategoty() {
        return categoty;
    }

    public void setCategoty(String categoty) {
        this.categoty = categoty;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", priceOld='" + priceOld + '\'' +
                ", priceNew='" + priceNew + '\'' +
                ", categoty='" + categoty + '\'' +
                ", img=" + img +
                '}';
    }
}
