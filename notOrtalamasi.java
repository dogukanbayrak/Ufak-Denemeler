import java.util.Scanner;

public class notOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya,tarih,muzik,resim;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz");
        mat = input.nextInt();
        System.out.println("Fizik Notunuzu Giriniz");
        fizik = input.nextInt();
        System.out.println("Kimya Notunuzu Giriniz");
        kimya = input.nextInt();
        System.out.println("Tarih Notunuzu Giriniz");
        tarih = input.nextInt();
        System.out.println("Müzik Notunuzu Giriniz");
        muzik = input.nextInt();
        System.out.println("Resim Notunuzu Giriniz");
        resim = input.nextInt();

        int ort= (mat+fizik+kimya+tarih+muzik+resim) /6;
        while ( ort >= 60) {
            System.out.println("Sınıfı Geçtiniz. Ortalamanız : " + ort);
            break;
        }
        while ( ort < 60) {
            System.out.println("Sınıfta Kaldınız. Ortalamanız : " + ort);
            break;
        }
    }
}
