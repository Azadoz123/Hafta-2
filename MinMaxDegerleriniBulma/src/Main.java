import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 8, 3, 11, 5};
        int number, buyuk, kucuk;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir değer giriniz: ");
        number = scan.nextInt();
        buyuk = number;
        kucuk = number;
        Arrays.sort(arr);

        for (int i : arr){
            System.out.println(i);
        }

        for (int i=0; i<arr.length;i++){
            if( number < arr[i]){
                buyuk = arr[i];
                if(number == arr[i-1]){
                    kucuk = arr[i-2];
                }else {
                    kucuk = arr[i-1];
                }
                break;
            }


        }

        System.out.println("Büüuk değer: " + buyuk + "\nKüçük Değer: " + kucuk);

    }
}