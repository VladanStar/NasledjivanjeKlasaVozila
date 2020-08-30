package com.company;

public class TeretnoVozilo extends Vozilo {
   private int brojOsovina;

    public TeretnoVozilo() {
    }

    public TeretnoVozilo(int brojOsovina) {
        this.brojOsovina = brojOsovina;
    }

    public TeretnoVozilo(String vlasnik, int brojMotora, String brojTablice, int brojOsovina) {
        super(vlasnik, brojMotora, brojTablice);
        this.brojOsovina = brojOsovina;
    }

    public int getBrojOsovina() {
        return brojOsovina;
    }

    public void setBrojOsovina(int brojOsovina) {
        this.brojOsovina = brojOsovina;
    }

    @Override
    public String toString() {
        return "TeretnoVozilo{"+ super.toString() +
                "brojOsovina=" + brojOsovina +
                '}';
    }
}
