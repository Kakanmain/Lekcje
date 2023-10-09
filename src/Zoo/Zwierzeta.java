package Zoo;

import java.util.ArrayList;

public class Zwierzeta {
    String rasa;
    String nazwa;

    public Zwierzeta(String rasa, String nazwa){
        this.rasa = rasa;
        this.nazwa = nazwa;
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
        ArrayList<String> dzwiekiZwierzat = new ArrayList<String>();
        dzwiekiZwierzat.add("hał hał");
        dzwiekiZwierzat.add("miau miau");
        dzwiekiZwierzat.add("swist swist");
    }
}
