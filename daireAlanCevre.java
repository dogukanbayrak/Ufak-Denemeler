import java.util.Scanner;

public class daireAlanCevre {
    public static void main(String[] args) {

        double pi=3.14,alan,cevre, dilim;
        int r,a;
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen merkez açı ölçüsünü giriniz");
        a= scan.nextInt();
        System.out.println("Lütfen yarıçapı giriniz");
        r= scan.nextInt();

        alan= pi*r*r;
        cevre = 2*pi*r;
        dilim= (pi*r*r*a)/360;
        System.out.println("Dairenin alanı : "+ alan);
        System.out.println("Dairenin çevresi : " + cevre);
        System.out.println("Daire diliminin alanı : "+ dilim);

    }
}
