import java.util.Scanner;

public class Mainproblema6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti lungimea sirului: ");
        int length = scanner.nextInt();

        int[] sir = new int[length];

        for(int i=0; i<length;i++){
            int val = scanner.nextInt();
            sir[i] =val;
        }

        System.out.println("Sirul initial este: ");
        for (int i=0; i<length; i++) {
            System.out.print(sir[i] + " ");
        }

        int max = 0;
        for(int i = 0; i<length;i++){
            if(max<sir[i]){
                max=sir[i];

            }
        }
        System.out.println("numarul maxim este: "+ max);

        int min = 999;
        for(int i = 0;i<length;i++){
            if(min>sir[i]){
                min=sir[i];
            }
        }
        System.out.println("numarul minim este: "+ min);

        int sum = 0;
        for(int i = 0;i<length;i++){
            sum = sum+sir[i];
        }
        System.out.println("suma este: "+sum);
        int[] sirDouble = new int[length*2];
        for(int i = 0;i<length;i++){
            sirDouble[i] = sir[i];
            sirDouble[i+length]= sir[i];
        }

        System.out.println("Sirul dublat este: ");
        for (int i=0; i<length*2; i++) {
            System.out.print(sirDouble[i] + " ");
        }
    }
}
