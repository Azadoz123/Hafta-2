import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static public void Recursive(int a, int b, int c){
        int check = c;
        System.out.print(a +" ");
       //5'er 5'er azaltma
        if(a >= 0 && check == 0) {
            a -= 5;
            if(a <= 0)
                check = 1;
            Recursive(a, b, check);
        //5'er 5'er artırma
        } else if (check==1) {
            a += 5;
            //Aynı sayıya ulaşınca programı durdurma
            if(a == b)
                check = 2;
            Recursive(a, b, check);
        }
    }
    public static void main(String[] args) {

        //kullanıcıdan veri alma
        Scanner scan = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int a = scan.nextInt();
        Recursive(a, a, 0);
    }
}