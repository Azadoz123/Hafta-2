import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if (i == value)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 10, 9, 1};
        int[] duplicate = new int[list.length];
        int startIndext = 0;
        for (int i = 0; i <list.length; i++){
            for (int j=0; j < list.length; j++){
                if( i != j && list[i] == list[j]){
                    if (!isFind(duplicate, list[i]) && (list[i] % 2 == 0)){
                        duplicate[startIndext++] = list[i];
                    }
                    break;
                }
            }
        }
        for(int value : duplicate)
            if(value != 0)
                System.out.println(value);
    }
}