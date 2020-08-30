package com.company;

public class Auto extends PutnickoVozilo{
    private String model;
    private int brojSedista;

    public Auto() {
    }

    public Auto(String model, int brojSedista) {
        this.model = model;
        this.brojSedista = brojSedista;
    }

    public Auto(int brojVrata, String boja, String model, int brojSedista) {
        super(brojVrata, boja);
        this.model = model;
        this.brojSedista = brojSedista;
    }

    public Auto(String vlasnik, int brojMotora, String brojTablice, int brojVrata, String boja, String model, int brojSedista) {
        super(vlasnik, brojMotora, brojTablice, brojVrata, boja);
        this.model = model;
        this.brojSedista = brojSedista;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBrojSedista() {
        return brojSedista;
    }

    public void setBrojSedista(int brojSedista) {
        this.brojSedista = brojSedista;
    }

    @Override
    public String toString() {
        return "Auto{ " + super.toString()+
                " model='" + model + '\'' +
                ", brojSedista=" + brojSedista +
                ", brojVrata=" + brojVrata +
                ", boja='" + boja + '\'' +
                '}';
    }

    public void upaliKlimu(){

    }
    public void promeniVlasnika(String noviVlasnik){
        setVlasnik(noviVlasnik);
    }
}
