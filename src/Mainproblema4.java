import java.util.Scanner;

public class Mainproblema4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gradeC;
        int gradeF;
        System.out.println("gradeF");
        gradeF = scanner.nextInt();
        gradeC = (gradeF-32)*5/9;
        System.out.println("acestea sunt gradele C " + gradeC);
    }
}
