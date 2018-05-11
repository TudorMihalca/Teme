import java.sql.SQLOutput;
import java.util.Scanner;

public class MainProblema1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti prmul numar: ");
        int numar=scanner.nextInt();
        System.out.println("Introduceti al doilea numar: ");
        int numar2=scanner.nextInt();

        int rezultat=(numar+numar2)/2;
        System.out.println("Meida aritmetica este " + rezultat);
    }
}
