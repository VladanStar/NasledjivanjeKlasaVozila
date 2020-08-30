package com.company;

public class Kamion extends TeretnoVozilo{
    int nosivost;

    public Kamion() {
    }

    public Kamion(int nosivost) {
        this.nosivost = nosivost;
    }

    public Kamion(int brojOsovina, int nosivost) {
        super(brojOsovina);
        this.nosivost = nosivost;
    }

    public Kamion(String vlasnik, int brojMotora, String brojTablice, int brojOsovina, int nosivost) {
        super(vlasnik, brojMotora, brojTablice, brojOsovina);
        this.nosivost = nosivost;
    }

    public int getNosivost() {
        return nosivost;
    }

    public void setNosivost(int nosivost) {
        this.nosivost = nosivost;
    }

    @Override
    public String toString() {
        return  super.toString() + " Kamion{" +
                "nosivost=" + nosivost +
                '}';
    }
}
