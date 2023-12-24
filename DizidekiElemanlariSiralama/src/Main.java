import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int sayi, temp;
        //Kullanıcıdan veri alma
        Scanner scan = new Scanner(System.in);
        System.out.println("Elaman sayısnı giriniz: ");
        int i = scan.nextInt();
        int[] arr = new int[i];
        for (int j=0; j< arr.length; j++){
            System.out.println( j +1  + ". Elemanı giriniz: ");
            arr[j] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //Verileri küçükten büyüğe sıralama
        for (int k= 0; k< arr.length; k++){
            for (int j=k; j<arr.length; j++){
                if (arr[k] > arr[j]) {
                    temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //Ekrana Yazma
        System.out.println(Arrays.toString(arr));
    }
}