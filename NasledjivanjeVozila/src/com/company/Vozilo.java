package com.company;

public class Vozilo {
    private String vlasnik;
    private int brojMotora;
    private String brojTablice;

    public Vozilo() {
    }

    public Vozilo(String vlasnik, int brojMotora, String brojTablice) {
        this.vlasnik = vlasnik;
        this.brojMotora = brojMotora;
        this.brojTablice = brojTablice;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public int getBrojMotora() {
        return brojMotora;
    }

    public void setBrojMotora(int brojMotora) {
        this.brojMotora = brojMotora;
    }

    public String getBrojTablice() {
        return brojTablice;
    }

    public void setBrojTablice(String brojTablice) {
        this.brojTablice = brojTablice;
    }

    @Override
    public String toString() {
        return "Vozilo{" +
                "vlasnik='" + vlasnik + '\'' +
                ", brojMotora=" + brojMotora +
                ", brojTablice='" + brojTablice + '\'' +
                '}';
    }

    public void promeniVlasnika(Osoba noviVlasnik){

    }
}
