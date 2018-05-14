public class Mainproblema9 {
    public static void main(String[] args) {

        double distantaDintreOrase= SkeletonJava.readDoubleConsole("Distnata dintre orase este: ");
        double vitezaLuiIon=SkeletonJava.readDoubleConsole("Viteza lui Ion este: ");
        double vitezaLuiFlorica=SkeletonJava.readDoubleConsole("Viteza lui Florica: ");
        double distantaIon= 0;
        double timp= 0;


        distantaIon= distantaDintreOrase*vitezaLuiIon/(vitezaLuiIon+vitezaLuiFlorica);
        timp = distantaIon/vitezaLuiIon*60;

        System.out.println("se intalnesc dupa" + timp + "minute: ");
        System.out.println("distanta la care se intalnesc" + distantaIon);


    }
}
