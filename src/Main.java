//import Dziedziczenie.Auto;
//import Dziedziczenie.Pojazd;
//import Dziedziczenie.Samolot;
//import Dziedziczenie.Jacht;

import Obiekty.Samochod;
import Zoo.Kot;
import Zoo.Pies;
import Zoo.Swistak;
import Zoo.Zwierzeta;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Samochod samochod = new Samochod();
//        samochod.setMarka("Ford");
//        samochod.setModel("Mustang");
//        samochod.setKolor("Fioletowy");
//
//        System.out.println(samochod);
//        System.out.println("Twój samochod to: ");
//        System.out.println(samochod.getMarka());
//        System.out.println(samochod.getModel());
//        System.out.println(samochod.getKolor());

//        Auto auto = new Auto("Honda", "Civic");
//        Samolot samolot = new Samolot("Airbus","939");
//        Jacht jacht = new Jacht( "Galaxy", "s23 ultra");
//        useMakeNoise(auto);
//        useMakeNoise(samolot);
//        useMakeNoise(jacht);
        Pies pies = new Pies("Maltańczyk", "Felek");
        Kot kot = new Kot("Ragdoll","Węgielek");
        Swistak swistak = new Swistak( "Ziemny", "Wiatrak");
        useMakeNoise(dzwiekiZwierzat<>);
        displayName(dzwiekiZwierzat<>);

    }

//    private static void useMakeNoise(Pojazd pojazd) {
//        pojazd.makeNoise();
//    }
    private static void useMakeNoise(Zwierzeta zwierzeta) {
        zwierzeta.makeNoise();
    }
}