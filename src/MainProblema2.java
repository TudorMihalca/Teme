import java.util.Scanner;

public class MainProblema2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N = scanner.nextInt();
        int suma = 0;
        for (int i=0; i<N;i++){
            int numar = scanner.nextInt();
            suma = suma + numar;
        }
        System.out.println("Media aritmetica a " + N + " numere este " + suma/N);
    }

}

