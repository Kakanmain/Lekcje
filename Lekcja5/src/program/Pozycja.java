package program;

public class Pozycja {
    String nazwaTowaru;
    int ileSztuk; //Liczba zamówionych sztuk
    double cena; //Cena pojedynczej sztuki

    public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    public double obliczWartosc(){
        return ileSztuk*cena;
    }

    @Override
    public String toString() {
        return String.format("%-20s %10.2f zł %4d szt. %10.2f zł", nazwaTowaru, cena, ileSztuk, obliczWartosc());
    }
}
