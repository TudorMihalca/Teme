public class Mainproblema8 {
    public static void main(String[] args) {

       double distantaInM = 0;
       double viteza = 0;
       double timpInSecunde = 0;


       double distanta = SkeletonJava.readDoubleConsole("distanta parcursa este: ");
       double timp = SkeletonJava.readDoubleConsole("Numarul de ore pe drum este: ");

       distantaInM= distanta*1000;
       timpInSecunde= timp*3600;
       viteza = distantaInM/timpInSecunde;
        System.out.println(viteza);
    }
}
