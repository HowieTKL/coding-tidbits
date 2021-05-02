package challenges;

import java.util.Optional;

/**
 * Binary search tree.
 * Left nodes are less than current node's value,
 * as defined by its associated compare function.
 * Right nodes are greater than or equal to the current node.
 * @param <T>
 */
public class BinarySearchTree2<T extends Comparable<T>> {
	private Optional<BinarySearchTree2<T>> left;
	private Optional<BinarySearchTree2<T>> right;
	private final Optional<T> v;
	
	public BinarySearchTree2(T value) {
		v = Optional.ofNullable(value);
	}
	
	public Optional<T> getValue() {
		return v;
	}
	
	public void insert(T value) {
		v.ifPresent(thisValue -> {
			if (thisValue.compareTo(value) < 0) {
				left.ifPresent(l -> l.insert(value));
			} else { // compare >= 0
				right.ifPresent(r -> r.insert(value));
			}
		});
	}

	public boolean contains(T v) {
		// TODO
		return false;
	}

	public boolean remove(T v) {
		// TODO
		return false;
	}
	
	private void toString(StringBuilder out) {
	}
	
}
