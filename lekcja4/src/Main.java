//import Dziedziczenie.Auto;
//import Dziedziczenie.Pojazd;
//import Dziedziczenie.Samolot;
//import Dziedziczenie.Jacht;

import Zoo.Kot;
import Zoo.Pies;
import Zoo.Swistak;
import Zoo.Zwierzeta;

public class Main {
    public static void main(String[] args) {
//
        Pies pies = new Pies("Maltańczyk", "Felek");
        Kot kot = new Kot("Ragdoll","Węgielek");
        Swistak swistak = new Swistak( "Ziemny", "Wiatrak");
        for(Zwierzeta zwierze : Zwierzeta.listaZwierzat){
            useMakeNoise(zwierze);
            useDisplayName(zwierze);
        };
    }

    private static void useMakeNoise(Zwierzeta zwierze) {
        zwierze.makeNoise();
    }
    private static void useDisplayName(Zwierzeta zwierze) {
        zwierze.displayName();
    }
}