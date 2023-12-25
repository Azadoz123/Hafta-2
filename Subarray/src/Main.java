// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr ={1, -2, 4, -5, 1};
        int count=0;
        int sum =0;
        for (int i= 0; i< arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                for (int k = j; k < j + i + 1; k++) {
                    sum += arr[k];

          //          System.out.print(arr[k] + " ");
                }
                if(sum < 0) {
                    System.out.print(sum);
                    count++;
                }
                sum=0;
              /*  if(arr[j] < 0)
                System.out.print(arr[j]);
                if( (j < (arr.length-1)) && (arr[j] + arr[j+1]) < 0)
                    System.out.println( arr[j] +"/" + arr[j+1]);
            }*/

            }
            System.out.println();
        }
        System.out.println(count);
    }
}