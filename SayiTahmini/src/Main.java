import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
//        double number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0, selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);

        while (right < 5){
            System.out.println("Lütfen tahminizi girniz: ");
            selected = input.nextInt();

            if(selected <0 || selected > 99){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                continue;
            }
            if(selected == number){
                isWin = true;
                System.out.println("Tebrikler doğru tahmin ettiniz");
                break;
            }else {
                wrong[right] = selected;
                right++;
                System.out.println("Hatalı bir sayı girdiniz.");
                if(selected > number){
                    System.out.println(selected + " sayısı gizli sayıdan büyüktür.");
                }else {
                    System.out.println(selected + " sayısı gizli sayıdan küçüktür.");
                }
                System.out.println("Kalan hakkınız: " + (5 - right));
            }
        }
        if(!isWin){
            System.out.println("Kaybettiniz.");
            System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
        }
    }
}