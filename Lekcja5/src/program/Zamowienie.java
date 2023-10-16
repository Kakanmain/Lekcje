package program;

public class Zamowienie {
    public Pozycja[] pozycje;
    int ileDodanych; //Liczba pozycji w zamówieniu
    int maksRozmiar; //Maksymalna liczba pozycji w zamówieniu

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
    }
    public void dodajPozycje(Pozycja p) {
        pozycje.add(this);
    }

}
