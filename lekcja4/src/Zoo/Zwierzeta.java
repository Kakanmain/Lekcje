package Zoo;

import java.util.ArrayList;
import java.util.List;

public class Zwierzeta {
    String rasa;
    String nazwa;

    public static List<Zwierzeta> listaZwierzat = new ArrayList<>();

    public Zwierzeta(String rasa, String nazwa){
        this.rasa = rasa;
        this.nazwa = nazwa;
        listaZwierzat.add(this);
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void makeNoise() {
        System.out.println("Odgłos");
    }
    public void displayName() {
        System.out.println(nazwa);
    }

}
