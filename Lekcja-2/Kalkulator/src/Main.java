// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {

    public static float add(float a, float b){
        return a+b;
    }

    public static float sub(float a, float b){
        return a-b;
    }

    public static float mult(float a, float b){
        return a*b;
    }

    public static float div(float a, float b){
        if (b==0){
            System.out.println("Nie dzieli się przez zero!");
            return 0;
        } else {
            return a/b;
        }
    }



    public static void calc() {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        float a = scan1.nextFloat();

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj działanie, gdzie 1 - dodawanie, 2 - odejmowanie, 3 - mnożenie, 4 - dzielenie");
        int liczba = scan.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Podaj drugą liczbę");
        float b = scan2.nextFloat();

        switch(liczba){
            case 1:
                System.out.println("Wynik to: " + add(a,b));
                break;
            case 2:
                System.out.println("Wynik to: " + sub(a,b));
                break;
            case 3:
                System.out.println("Wynik to: " + mult(a,b));
                break;
            case 4:
                System.out.println("Wynik to: " + div(a, b));
                break;
            default:
                System.out.println("Błąd!");
                break;
        }
    }

    public static void main(String[] args) {
        try{
            calc();
        } catch (InputMismatchException e) {
            System.out.println("Podałeś dane w złym formacie!");
        }
    }

}

