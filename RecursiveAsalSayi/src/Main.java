import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static public boolean isAsal(int a, int b){
        //Bölümü varsa asal değildir
        if(a % b == 0)
            return false;
        //Bölümü yoksa asaldır
        if(b == 2)
            return true;
            return isAsal(a, b-1) ;
    }
    public static void main(String[] args) {
        //Kullanıcıdan veri alma
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();

        //Sonucu ekrana yazma
        if(isAsal(sayi, sayi/2)){
            System.out.println(sayi + " sayısı bir asal sayıdır.");
        }else {
            System.out.println(sayi + " sayısı bir asal sayı değildir.");
        }
    }
}