package Zoo;

public class Swistak extends Zwierzeta {
    public Swistak(String rasa, String nazwa) {
        super(rasa, nazwa);
    }

    @Override
    public void makeNoise() {
        System.out.println("swist swist");
    }
}