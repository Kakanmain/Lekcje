package Zoo;

public class Kot extends Zwierzeta {
    public Kot(String rasa, String nazwa) {
        super(rasa, nazwa);
    }

    @Override
    public void makeNoise() {
        System.out.println("miau miau");
    }
}
