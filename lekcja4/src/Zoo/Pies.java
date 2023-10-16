package Zoo;

public class Pies extends Zwierzeta {
    public Pies(String rasa, String nazwa) {
        super(rasa, nazwa);
    }

    @Override
    public void makeNoise() {
        System.out.println("Hał hał");
    }

}
