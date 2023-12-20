import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
   /* public static void printFibonacci(int number, int num1, int num2) {
        int sum;
        if (number != 0) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.print(sum + " ");
            printFibonacci((number - 1), num1, num2);
        }
    }*/



    /*public static void main(String[] args) {
        int number, num1 = 1, num2 = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        number = input.nextInt();
        System.out.print(num1 + " " + num2 + " ");

        printFibonacci(number, num1, num2);
    }*/
    static int fib(int n){

        if( n== 1 || n ==2){
            return 1;
        }
        return fib(n -1) + fib(n-2);
    }
    public static void main(String[] args) {

        System.out.println(fib(5));
    }
}

