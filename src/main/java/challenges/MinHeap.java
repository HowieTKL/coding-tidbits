package challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * Completeness: Tree nodes are filled top to bottom, left to right...
 *      2
 *     / \
 *    3   9
 *   / \  |
 *  6   4 10
 *  
 *  Min heap property: parent is smaller (for min heap) than its children, i.e. root node is
 *  the minimum value.
 */
public class MinHeap {
	private List<Integer> heap = new ArrayList<>();

	private MinHeap() {}
	
	public List<Integer> build(List<Integer> array) {
		for (int i = 0; i < array.size(); ++i) {
			int iLeft = i * 2 + 1;
			int iRight = i * 2 + 2;
			
			if (iLeft < array.size() && array.get(i) > array.get(iLeft)) {
				siftDown(i, iLeft);
			}
			if (iRight < array.size() && array.get(i) > array.get(iRight)) {
				siftDown(i, iRight);
			}
		}
		return heap;
	}
	
	private List<Integer> siftDown(int current, int target) {
		if (current > target && heap.get(current) > heap.get(target)) {
			swap(current, target);
		}
		return heap;
	}
	
	private void swap(int i, int j) {
		int tmp = heap.get(i);
		heap.set(i, heap.get(j));
		heap.set(j, tmp);
	}
	
	public static void main(String[] args) {
	}
	
	
	

}
