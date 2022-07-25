import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
         */

        //Degiskenler tanimlandi.
        int n, r, toplam1 = 1, toplam2 =1, toplam3 = 1, nEksiR, kombinasyon;

        //Kullanicidan kombinasyon hesabi için N ve R degerleri alindi.
        //Degerler kombinasyon formulunde kullanilarak hesaplandi ve ekrana yazdirildi.
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("Kombinasyon Hesaplama");
        System.out.println("-------------------------");

        System.out.print("N Sayisini Giriniz : ");
        n = scan.nextInt();

        System.out.print("R Sayisini Giriniz : ");
        r = scan.nextInt();

        nEksiR = n - r;

        //N sayisinin R sayisindan buyuk olması gerektigi için if kullaniyoruz.
        if (n < r)
        {
            System.out.println("N Sayisi R Sayisindan Buyuk Olmalidir. \nLutfen Programi Tekrar Aciniz!");
        }
        else
        {
            for (int i = 1; i <= n; i++)
            {
                toplam1 *= i;
            }
            System.out.println(n + " Sayisinin Faktoriyeli : " + toplam1);

            for (int i = 1; i <= r; i++)
            {
                toplam2 *= i;
            }
            System.out.println(r + " Sayisinin Faktoriyeli : " + toplam2);

            for (int i = 1; i <= nEksiR; i++)
            {
                toplam3 *= i;
            }
            System.out.println(nEksiR + " Sayisinin Faktoriyeli : " + toplam3);

            kombinasyon = toplam1 / (toplam2 * toplam3);
            System.out.println("-------------------------");
            System.out.println(n + ", " + r + " Sayilarinin Kombinasyonu : " + kombinasyon);

        }
    }
}
