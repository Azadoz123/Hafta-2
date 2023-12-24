// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[][] arr  = {{2, 3, 4}, {5, 6, 4}};
        //Yeni dizi oluşturma
        int[][] newArr = new int[arr[0].length][arr.length];
        //Eski dizideki değerleri transpozesini alarak yeniz diziye aktarma
        for (int i = 0; i< arr.length; i++){
            for (int j =0; j< arr[i].length;j++){
                newArr[j][i] = arr[i][j];
            }
        }
        //Ekrana yazdırma
        for (int[] k : newArr){
            for (int l : k)
                System.out.print(l + " ");
            System.out.println();
        }
    }
}