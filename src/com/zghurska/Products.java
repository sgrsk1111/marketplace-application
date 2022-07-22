package com.zghurska;

public class Products {
    private final int ID;
    private final String PRODUCT_NAME;
    private int PRICE;

    public Products(int ID, String PRODUCT_NAME, int PRICE) {
        this.ID = ID;
        this.PRODUCT_NAME = PRODUCT_NAME;
        this.PRICE = PRICE;
    }

    public int getID() {
        return ID;
    }

    public String getPRODUCT_NAME() {
        return PRODUCT_NAME;
    }

    public int getPRICE() {
        return PRICE;
    }

    @Override
    public String toString() {
        return "Products{" +
                "ID=" + ID +
                ", PRODUCT_NAME='" + PRODUCT_NAME + '\'' +
                ", PRICE=" + PRICE +
                '}';
    }
}
