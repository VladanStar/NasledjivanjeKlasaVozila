package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Vozilo v1 = new Vozilo("Vladan Cupric", 1223456789, "Kg085PN");
        System.out.println(v1.toString());
        PutnickoVozilo p1 = new PutnickoVozilo("Miroslav Bendic", 123456789, "KG102AU", 5, "green");
        System.out.println(p1.toString());
        Auto a1 = new Auto("Vladiir Dobi", 2134567, "KG15356", 5, "green", "Aston Martin", 6);
        System.out.println(a1.toString());

        PutnickoVozilo p2 = a1;
        Vozilo v = a1;

        Kamion k1 = new Kamion("Vladan Cupric", 1234567, "KG090RT", 3, 12);
        System.out.println(k1.toString());
        Vozilo v3 = new Kamion("Zoran Burovic", 17734567, "KG040RT", 5, 42);
        System.out.println(v3.toString());
        if (v3 instanceof Kamion) {
            Kamion a2 = (Kamion) v3;
        }
        Vozilo[] vozila = new Vozilo[4];
        vozila[0] = a1;
        vozila[1] = v3;
        vozila[2] = k1;
        vozila[3] = new Auto("Marko Dobic", 2134567, "KG1535RT", 3, "green", "Aston Martin", 2);

        System.out.println("Sve vozila");
        for (Vozilo vrm : vozila) {
            System.out.println(vrm.toString());
        }
        System.out.println("Stampamo samo automobile");
        for (Vozilo vrmm : vozila) {
            if (vrmm instanceof Auto) {
                System.out.println(vrmm.toString());
            }
        }
        System.out.println("Ofarbati automobile u crnu boju");
        for (Vozilo vrmm1 : vozila) {
            if (vrmm1 instanceof Auto) {
                ((Auto) vrmm1).setBoja("black");
            }
        }
        System.out.println("Stampamo samo automobile");
        for (Vozilo vrmm : vozila) {
            if (vrmm instanceof Auto) {
                System.out.println(vrmm.toString());
            }
        }
    }
}