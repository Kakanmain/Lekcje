// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Nasza lekcja");

        System.out.println("Hej!");

        //Liczbowe
        int i = 9;
        Integer  integer = null;

        Long l = 9L;
        long l2 = 9L;

        Double d = 2.0;
        double d2 = 2.0;

        //True / false
        Boolean bol = true;
        boolean bol2 = false;

        //
        String s = "Hello";
        String u = "SUS";

        System.out.println(s);
        System.out.println(u);

        int one = 1;
        int two = 2;
        int three = one + two;
        System.out.println(one + "+" + two + "=" + three);

        double a = 4.6;
        double b = 1.7;
        double c = a - b;
        System.out.println(a + "-" + b + "=" + c);

        double power = Math.pow(three, two);
        System.out.println(three + "^ " + two + "=" + power);

        String zdanie="Małe Litery";
        String zdanie2="Duże Litery";
        System.out.println(zdanie.toLowerCase());
        System.out.println(zdanie2.toUpperCase());

        String test = "";
        String test1 = "whot";
        String test2 = null;
        System.out.println(test.isEmpty());
        System.out.println(test1.isEmpty());
        if (test2 != null){
            System.out.println(test2.isEmpty());
        } else {
            System.out.println("test2 jest nullem");
        }

        String nul = "";
        if (nul == null){
            System.out.println("nul jest nullem");
        } else if(nul == "") {
            System.out.print("Jest puste?  -  ");
            System.out.print(nul.isEmpty());
        } else {
            System.out.println(nul.toUpperCase());
        }
    }
}