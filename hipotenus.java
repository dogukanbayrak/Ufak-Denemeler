import java.util.Scanner;

import static java.lang.Math.*;

public class hipotenus {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        double ilk, ikinci, hip, cevre;
        System.out.println(" İlk Dik kenarı giriniz");
        ilk = scan.nextDouble();
        System.out.println(" İkinci Dik kenarı giriniz");
        ikinci=scan.nextDouble();

        hip = sqrt(pow(ilk,2)+ pow(ikinci,2));
        cevre= hip+ilk+ikinci;
        System.out.println("Hipotenus: " + hip + "\n Çevresi : " + cevre );
    }
}
