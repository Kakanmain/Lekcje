package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zamowienie {
    private Pozycja[] pozycje;
    int ileDodanych; //Liczba pozycji w zamówieniu
    int maksRozmiar; //Maksymalna liczba pozycji w zamówieniu

    public Zamowienie() {
        this.maksRozmiar= 10;
        this.pozycje = new Pozycja[maksRozmiar];
        this.ileDodanych = 0;
    }

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar= maksRozmiar;
        this.pozycje = new Pozycja[maksRozmiar];
        this.ileDodanych = 0;
    }

    public void dodajPozycje(Pozycja p) {
        for (int i = 0; i < ileDodanych; i++) {
            if (pozycje[i].nazwaTowaru.equals(p.nazwaTowaru)) {
                pozycje[i].ileSztuk += p.ileSztuk;
                return;
            }
        }

        if (ileDodanych < maksRozmiar) {
            pozycje[ileDodanych] = p;
            ileDodanych++;
        } else {
            System.out.println("Osiągnięto maksymalną liczbę pozycji w zamówieniu.");
        }
    }
    public double obliczWartosc(){
        double suma = 0.0;
        for(int q=0; q<ileDodanych; q++){
            suma += pozycje[q].obliczWartosc();
        }
        return suma;
    }

    @Override
    public String toString() {
        StringBuilder x = new StringBuilder();
        for (int i = 0; i < ileDodanych; i++) {
            x.append(pozycje[i].toString()).append("\n");
        }
        x.append("Łączna wartość zamówienia: ").append(obliczWartosc()).append(" zł");
        return x.toString();
    }

    void usunPozycje(int indeks){
        pozycjeZamowienia.remove(indeks);
        System.out.println("Pozycja została usunięta.");
    }
    void edytujPozycje(int indeks){

    }

    void dodajPozycje(int indeks){

    }
    Scanner scanner = new Scanner(System.in);
}

