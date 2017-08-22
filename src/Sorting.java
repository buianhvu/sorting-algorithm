import java.util.Collections;
import java.util.Comparator;

/**
 * Created by BuiAnhVu on 7/7/2017.
 */
public  class Sorting {

    public static void insertionSort(int a[]){
        int i, j;
        int last;
        for(i = 1; i < a.length; i++){
            last = a[i];
            j = i;
            while(j > 0 && a[j-1] > last){
                a[j] = a[j-1];
                j = j - 1;
            }
            a[j] = last;
        }
    }
    public static  void selectionSort(int a[]){
        int min, i, j;
        for(i = 0; i <= a.length - 2; i++){
            min = i;
            for(j = i + 1; j <= a.length - 1; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            swap(a, i, min);
        }
    }


    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
