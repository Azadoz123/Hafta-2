import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static  boolean isPalindrom(int sayi){
        int number  , n=0, newNumber =0, temp, lastNumber;
        number = sayi;
        temp =number;

        /*

        lastNumber = temp % 10;
        newNumber = (newNumber * 10) + lastNumber
        temp /= 10;

         */
        while (0<temp){
            temp=  temp / 10;
            n++;
        }
  //      System.out.println(n);

        temp =number;
        for(int i=0; i<n; i++){
            int a = temp%10;
            temp = temp/10;
            newNumber += a * Math.pow(10,(3-i));
        }
        if(number == newNumber){
            System.out.println(number + " bir palindrom sayıdır.");
            return true;
        }else {
            System.out.println(number + " bir palindrom sayı değildir.");
            return  false;
        }
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();
        isPalindrom(number);
    }
}