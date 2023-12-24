// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //Sayı daha önce sayılmış mı kontrol et
    public static boolean isFind(int[] arr, int value){
        for (int i=0; i<arr.length;i++) {
            if (value == arr[i])
                return true;
        }
        return false;
    }
    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] newArr = new int[arr.length];
        int number =0;
        //
        for (int i=0; i<arr.length;i++){
            if (!isFind(newArr, arr[i])){
                int k= 0;
                //Sayının adeti bulma
             for (int j=0; j<arr.length;j++){
                 if(arr[i] == arr[j])
                     k++;
             }
             //Sayılan sayıyı unutmamak için yeni diziye eklem
             newArr[number++] = arr[i];
            // Sonucu ekrana basma
             System.out.println(arr[i] +" sayısı " + k +" kere tekrar edildi." );
            }
        }
    }
}