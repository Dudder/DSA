import java.util.*;
/**
 * Created by Dudder on 2017.03.28..
 */
public class ComparableComparator<T extends Comparable<T>> implements Comparator<T> {
    @Override
    public int compare(T lhs, T rhs) {
        return lhs.compareTo(rhs);
    }
}
