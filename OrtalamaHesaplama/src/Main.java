// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] list = {15, 6, 88, 4, 6};
        double average = 0.0;
        double sum = 0.0;
        for(int i =0; i< list.length;i++){
            sum += list[i];
        }

        average = sum / list.length;
        System.out.println(average);
    }
}