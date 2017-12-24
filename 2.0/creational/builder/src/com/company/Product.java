package com.company;

public class Product {

    private String oblecenie;
    private String zbran;
    private String spravanie;

    public void setOblecenie(String oblecenie) {
        this.oblecenie = oblecenie;
    }

    public void setSpravanie(String spravanie) {
        this.spravanie = spravanie;
    }

    public void setZbran(String zbran) {
        this.zbran = zbran;
    }

    @Override
    public String toString() {
        return "Oblecenie: " + oblecenie + " Zbran: " + zbran + " Spravanie: " + spravanie;
    }
}
