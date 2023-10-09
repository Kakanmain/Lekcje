package Obiekty;

public class Samochod implements test {
    private String Marka;
    private String Model;
    private String Kolor;

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        Marka = marka;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getKolor() {
        return Kolor;
    }

    public void setKolor(String kolor) {
        Kolor = kolor;
    }


    @Override
    public void sayHelloWorld() {

    }

    @Override
    public Double returnRandomNumber() {
        return null;
    }
}