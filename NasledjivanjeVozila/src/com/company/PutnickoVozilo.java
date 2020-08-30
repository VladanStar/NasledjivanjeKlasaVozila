package com.company;

public class PutnickoVozilo extends Vozilo{
    int brojVrata;
    String boja;

    public PutnickoVozilo() {
    }

    public PutnickoVozilo(int brojVrata, String boja) {
        this.brojVrata = brojVrata;
        this.boja = boja;
    }

    public PutnickoVozilo(String vlasnik, int brojMotora, String brojTablice, int brojVrata, String boja) {
        super(vlasnik, brojMotora, brojTablice);
        this.brojVrata = brojVrata;
        this.boja = boja;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    @Override
    public String toString() {
        return "PutnickoVozilo{" +  super.toString() +
                "brojVrata=" + brojVrata +
                ", boja='" + boja + '\'' +
                '}';
    }

}
