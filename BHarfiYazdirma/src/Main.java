import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[7][4];
        for(int i=0; i<arr.length;i++){
            for (int j=0; j<arr[0].length; j++){
                if(i==0 || i==3 || i==6){
                    arr[i][j] = " * ";
                } else if (j==0 || j==3) {
                    arr[i][j] = " * ";
                }else {
                    arr[i][j] = "   ";
                }
            }
        }


        for (String[] row: arr){
            for (String col : row){
                System.out.print(col);
            }
        System.out.println();
        }
    }
}