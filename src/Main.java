import java.util.Collections;
import java.util.Comparator;

/**
 * Created by BuiAnhVu on 7/7/2017.
 */
public class Main {
    public static void main(String arg[]){
        int[] a = new int[]{9, 1, 6, 7, 8, 0, 5, 2, 3, 4};
        System.out.println("Before sorting: ");
        printArr(a);
        Sorting.insertionSort(a);
        System.out.println("Insertion sort");
        printArr(a);
    }
    static void printArr(int a[]){
        for(int i = 0 ; i < a.length; i++){
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }

}
