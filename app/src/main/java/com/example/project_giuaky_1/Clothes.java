package com.example.project_giuaky_1;

import java.io.Serializable;

public class Clothes implements Serializable {
    private int imgCloth;
    private String nameCloth;
    private String priceCloth;
    private String size;
    private String soLuong;

    public Clothes(int imgCloth, String nameCloth, String priceCloth) {
        this.imgCloth = imgCloth;
        this.nameCloth = nameCloth;
        this.priceCloth = priceCloth;
    }

    public int getImgCloth() {
        return imgCloth;
    }

    public void setImgCloth(int imgCloth) {
        this.imgCloth = imgCloth;
    }

    public String getNameCloth() {
        return nameCloth;
    }

    public void setNameCloth(String nameCloth) {
        this.nameCloth = nameCloth;
    }

    public String getPriceCloth() {
        return priceCloth;
    }

    public void setPriceCloth(String priceCloth) {
        this.priceCloth = priceCloth;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }
}
