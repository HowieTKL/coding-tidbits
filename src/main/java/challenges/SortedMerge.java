package challenges;

import java.lang.reflect.Array;

/**
 * Two sorted lists -> new sorted list
 * @param <T> Type of list elements
 */ 
public class SortedMerge<T extends Comparable<T>> {

	public SortedMerge() {}

	public T[] sort(T[] a, T[] b) {
		@SuppressWarnings("unchecked")
		T[] result = (T[]) Array.newInstance(a.getClass().getComponentType(), a.length + b.length);
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < a.length && j < b.length) {
			if (a[i].compareTo(b[j]) < 0) {
				result[k] = a[i];
				++i;
			} else {
				result[k] = b[j];
				++j;
			}
			++k;
		}
		
		while (i < a.length) {
			result[k] = a[i];
			++i;
			++k;
		}
		
		while (j < b.length) {
			result[k] = b[j];
			++j;
			++k;
		}

		return result;
	}

}
