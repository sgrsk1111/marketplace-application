package com.zghurska;

public class Users {

    private final int ID;
    private final String FIRST_NAME;
    private final String LAST_NAME;
    private int AMOUNT_MONEY;

    public Users(int ID, String FIRST_NAME, String LAST_NAME, int AMOUNT_MONEY) {
        this.ID = ID;
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.AMOUNT_MONEY = AMOUNT_MONEY;
    }

    public int getID() {
        return ID;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public int getAMOUNT_MONEY() {
        return AMOUNT_MONEY;
    }

    public void setAMOUNT_MONEY(int amount) {
        this.AMOUNT_MONEY = AMOUNT_MONEY;
    }

    @Override
    public String toString() {
        return "Users{" +
                "ID=" + ID +
                ", FIRST_NAME='" + FIRST_NAME + '\'' +
                ", LAST_NAME='" + LAST_NAME + '\'' +
                ", AMOUNT_MONEY=" + AMOUNT_MONEY +
                '}';
    }
}
