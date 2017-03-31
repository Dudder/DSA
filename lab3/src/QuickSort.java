import java.util.Random;
/**
 * Created by Dudder on 2017.03.28..
 */
public class QuickSort extends ComparableComparator {

    private Comparable[] sorted;
    private Random rand;

    public QuickSort (Comparable[] array){
        sort(array,0,array.length-1);
        sorted = array;
    }
    private void sort(Comparable[] array,int left,int right){
        int index = divide(array,left,right);
        if(left<index-1){
            sort(array,left,index-1);
        }
        if (index<right){
            sort(array,index,right);
        }
    }
    private int divide(Comparable array[],int left, int right){
        Comparable pivot = array[(left+right)/2];
        while(left<=right) {
            while (compare(array[left], pivot) < 0) {
                left++;
            }
            while (compare(array[right], pivot) > 0) {
                right--;
            }
            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private void swap(Comparable[] array,int left, int right){
        Comparable tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }
    public Comparable[] getSorted(){
        return sorted;
    }
}
