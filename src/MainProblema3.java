import java.util.Scanner;

public class MainProblema3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N = 0;
        float suma = 0;
        int numar;
        do {
            numar = scanner.nextInt();
            suma = suma + numar;
            N++;
        } while (numar != 0 );
        N--;

        System.out.println("Media aritmetica a " + N + " numere este " + suma/N);
    }
}
