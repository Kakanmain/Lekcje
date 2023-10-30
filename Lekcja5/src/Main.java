import program.Pozycja;
import program.Zamowienie;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pozycja p1 = new Pozycja("Chleb", 1, 3.5);
        System.out.println(p1);
        Pozycja p2 = new Pozycja("Cukier", 3, 4);
        System.out.println(p2);
        System.out.println("");

        Zamowienie z = new Zamowienie(20);
        z.dodajPozycje(p1);
        z.dodajPozycje(p2);
        System.out.println(z);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Czy chcesz coś zrobić z zamówieniem?");
        String wybor = scanner.nextLine();
        if (wybor=="tak" || wybor=="Tak"){
            System.out.println("Co chcesz robić z zamówieniem?");
        }
    }
}