import java.util.*;

public class MergeSort
{
    private Comparable[] sorted;

    public MergeSort(Comparable [] array)
    {
        sorted = new Comparable[array.length];
        sort(array,  0,  array.length - 1);
    }
    private void sort(Comparable [] array, int start, int end)
    {
        if( start < end )
        {
            int center = (start + end) / 2;
            sort(array, start, center);
            sort(array, center + 1, end);
            merge(array, start, center + 1, end);
        }
    }


    private void merge(Comparable[ ] a, int startL, int startR, int end )
    {
        int endL = startR - 1;
        int sortedi = startL;
        int x = end - startL + 1;

        while(startL <= endL && startR <= end)
            if(a[startL].compareTo(a[startR]) <= 0) {
                sorted[sortedi] = a[startL];
                sortedi++;
                startL++;
            }else {
                sorted[sortedi] = a[startR];
                sortedi++;
                startR++;
            }
        while(startL <= endL){
            sorted[sortedi] = a[startL];
            sortedi++;
            startL++;
        }
        while(startR <= end){
            sorted[sortedi] = a[startR];
            sortedi++;
            startR++;
        }
        for(int i = 0; i < x; i++, end--)
            a[end] = sorted[end];
    }

    public Comparable[] getSorted() {
        return sorted;
    }
}