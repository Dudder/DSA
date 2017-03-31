import java.util.Arrays;
import java.util.Random;
/**
 * Created by Dudder on 2017.03.28..
 */
public class Test {
//    ANSWERS:
//    QUICKSORT
//    length: 1000 time:0.11ms/list
//    length: 10000 time:1.1ms/list
//    length: 100000 time:17.2ms/list
//    length: 150000 time:27.9ms/list
//    length: 250000 time:55.7ms/list
//    O(n log n)
//
//    MERGESORT
//    length: 1000 time:0.11ms/list
//    length: 10000 time:2.2ms/list
//    length: 100000 time:29.3ms/list
//    length: 150000 time:48.7ms/list
//    length: 250000 time:93.7ms/list
//    O(n log n)

    final static int RAND_DATA_LENGTH = 250000;
    final static int EXECUTION_COUNT = 100;
    static long total_time = 0;

    public static void main(String[] args){

        //testQuickSort();
        testMergeSort();
    }

    public static void testQuickSort(){

        for (int i = 0; i <EXECUTION_COUNT ; i++) {
            Comparable[] array = createRandomData(RAND_DATA_LENGTH);
            long start = System.currentTimeMillis();
            QuickSort q = new QuickSort(array);
            long stop = System.currentTimeMillis();
            total_time += (stop-start);
        }
        System.out.println(total_time);
    }

    public static void testMergeSort(){

        for (int i = 0; i <EXECUTION_COUNT ; i++) {
            Comparable[] array = createRandomData(RAND_DATA_LENGTH);
            long start = System.currentTimeMillis();
            MergeSort q = new MergeSort(array);
            long stop = System.currentTimeMillis();
            total_time += (stop-start);
        }
        System.out.println(total_time);
    }

    public static Comparable[] createRandomData(int length){
        Random r = new Random();
        Comparable[] array = new Comparable[length];
        for (int i = 0; i <array.length ; i++) {
            array[i] = r.nextInt(length*10);
        }
        return array;
    }
}
