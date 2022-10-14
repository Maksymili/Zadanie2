package Zadanie2;

public class Zadanie {


    public static void main(String[] args){

        float waga = 78;

        System.out.println("Moja waga wynosi: " + waga);

        double grawitacjamarsa = 0.38;

        System.out.println("Grawitacja marsa wynosi: " + grawitacjamarsa + " grawitacji ziemskiej");

        double wagamars;

        System.out.println("Moja waga na marsie wynosi: " + (wagamars=waga*grawitacjamarsa));

        System.out.println("Moja waga na marsie po zaokragleniu: ");

        System.out.format("%.4f%n", wagamars);

        int a = (int)wagamars;

        System.out.println("Waga po zamianie na rodzaj int wynosi: " + a);

        int b = (char)wagamars;

        System.out.println("Waga po zamianie na rodzaj char wynosi: " + b);

        b = (b*10)/2;

        int c = b;





    }

}
