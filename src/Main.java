import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String isim, sifre;
        int dogru = 3, secim, toplamKasaTutari = 1500, yatirilacakPara, cekilecekPara;
        while (dogru > 0) {
            System.out.print("Lutfen isim giriniz : ");
            isim = scan.nextLine();
            System.out.print("Lutfen sifrenizi giriniz : ");
            sifre = scan.nextLine();
            if (isim.equals("mertbekir29") && sifre.equals("292929")) {
                System.out.println("Basarili bir sekilde giris yaptiniz...");
                do {
                    System.out.println("Lutfen yapmak istediginiz islemi seciniz : ");
                    System.out.println("1-Para Yatirma");
                    System.out.println("2-Para Cekme");
                    System.out.println("3-Bakiye Sorgula");
                    System.out.println("4-Cikis Yap");
                    secim = scan.nextInt();
                    if (secim == 1) {
                        System.out.println("Bakiyeniz : " + toplamKasaTutari);
                        System.out.print("Lutfen Yatiracaginiz parayi giriniz : ");
                        yatirilacakPara = scan.nextInt();
                        toplamKasaTutari += yatirilacakPara;
                        System.out.println("Guncel Bakiyeniz : " + toplamKasaTutari);
                    } else if (secim == 2) {
                        System.out.println("Bakiyeniz : " + toplamKasaTutari);
                        System.out.print("Lutfem cekeceginiz para tutarini giriniz : ");
                        cekilecekPara = scan.nextInt();
                        if (cekilecekPara > toplamKasaTutari) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            toplamKasaTutari -= cekilecekPara;
                            System.out.println("Guncel Bakiyeniz : " + toplamKasaTutari);
                        }

                    } else if (secim == 3) {
                        System.out.println("Bakiyeniz : " + toplamKasaTutari);
                    } else
                        System.out.println("Basariyla cikis yapildi...");
                } while (secim != 4);

            } else {
                dogru--;
                System.out.println("Kullanici adi veya sifre hatali..");
                if (dogru == 0) {
                    System.out.println("3 kez yanlis girdiniz.Hesabiniz bloke olmustur.");
                }
            }
        }
    }
}
