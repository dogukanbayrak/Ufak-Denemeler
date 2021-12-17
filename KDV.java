import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {

        int fiyat, toplam, kdv;
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Almak istediğiniz ürünün fiyatını giriniz :");
        fiyat = scan.nextInt();

        if ( fiyat>0 && fiyat <1000) {
            kdv = (fiyat*18)/100;
            toplam= kdv+fiyat;
            System.out.println("KDV'siz Fiyat "+ fiyat +"\nKDV'li Fiyat: "+ toplam+ "\nKDV tutarı: " + kdv );
        }
        else if ( fiyat>1000) {
            kdv = (fiyat*8)/100;
            toplam= kdv+fiyat;
            System.out.println("KDV'siz Fiyat "+ fiyat + "\nKDV'li Fiyat: "+ toplam+ "\nKDV tutarı: " + kdv );
        }
        else {
            System.out.println("lütfen pozitif bir sayi giriniz");
        }

    }
}
