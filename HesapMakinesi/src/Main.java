import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static  int sum(int a, int b){
        int result = a + b;
        System.out.println("Toplam: " + result + "\n");

        return result;
    }

    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Çıkarma: " + result + "\n");
        return result;
    }

    static int times(int a, int b){
        if(b == 0){
            System.out.println("2. sayı sıfırdan farklı olmalı.");
            return 0;
        }
        int result = a * b;
        System.out.println("Çarpma: " + result + "\n");
        return result;
    }

    static int divided(int a, int b){
        int result = a / b;
        System.out.println("Bölüm: " + result + "\n");
        return result;
    }

    static int power(int a, int b){
        int result =1;
        for(int i=0;i<b;i++){
            result *=a;
        }
        System.out.println("Üssü: " + result + "\n");
        return result;
    }

    static int mod(int a, int b){
        return a % b;
    }

    static void calc(int a, int b){
        System.out.println("Çevresi: " + (2 * (a +b)));
        System.out.println("Alanı:" + (a * b));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama"
                + "6- Mod alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        while (true){
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz: ");
            select = scan.nextInt();

            if (select == 8)
                break;

            System.out.print("1. sayıyı giriniz: ");
            int a = scan.nextInt();
            System.out.print("2. sayıyı giriniz: ");
            int b = scan.nextInt();
            int result;
            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                case 5:
                    power(a,b);
                    break;
                case 6:
                    System.out.println("Mod işlemi: ");
                    break;
                case 7:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz.");
            }
        }

        System.out.println("Güle güle");
    }
}