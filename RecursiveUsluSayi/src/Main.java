import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static public int UsHesapla(int a, int b){
        //döngü burda sonlandırılır
        if( b== 1)
            return a;
        //Çarpma işlemi yapılır
        return a * UsHesapla(a, b-1);
    }

    public static void main(String[] args) {

        //Kullanıcıdan veri alma
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri girniz: ");
        int a = scan.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int b = scan.nextInt();

        //Sonucu yazdırma
        System.out.println("Sonuç: " + UsHesapla(a,b));
    }
}