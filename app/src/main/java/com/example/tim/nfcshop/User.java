package com.example.tim.nfcshop;

/**
 * Created by Gurt on 29.11.17.
 */

public class User {
    int userId;
    String meno;
    double kredit;
    int isAsmin;
    String cardId;

    public User(int userId, String meno, double kredit, int isAsmin, String cardId) {
        this.userId = userId;
        this.meno = meno;
        this.kredit = kredit;
        this.isAsmin = isAsmin;
        this.cardId = cardId;
    }

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public double getKredit() {
        return kredit;
    }

    public void setKredit(double kredit) {
        this.kredit = kredit;
    }

    public int getIsAsmin() {
        return isAsmin;
    }

    public void setIsAsmin(int isAsmin) {
        this.isAsmin = isAsmin;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
}
