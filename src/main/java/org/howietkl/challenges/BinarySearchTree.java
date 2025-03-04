package org.howietkl.challenges;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
	private int value;
	private BinarySearchTree left, right;
	
	public BinarySearchTree(int v) {
		this.value = v;
	}
	
	public void insert(int v) {
		if (v < value) {
			if (left == null) {
				left = new BinarySearchTree(v);
			} else {
				left.insert(v);
			}
		} else {
			if (right == null) {
				right = new BinarySearchTree(v);
			} else {
				right.insert(v);
			}
		}
	}
	
	public BinarySearchTree remove(int v) {
		if (v < value) {
			if (left != null) {
				left.remove(v);
			}
		} else if (v > value) {
			if (right != null) {
				right.remove(v);
			}
		} else { // v == value
			if (left != null && right != null) {
				value = right.getMin();
				right = right.remove(value);
			} else if (left != null) {
				return left;
			} else if (right != null) {
				return right;
			} else {
				return null;
			}
		}
		return this;
	}
	
	private int getMin() {
		return (left != null) ? left.getMin() : value;
	}
	
	// Depth First Search
	public boolean dfs(List<Integer> results, int target) {
		if (results != null) {
			results.add(value);
		}
		if (target == value) {
			return true;
		}
		if (left != null && right != null) {
			return left.dfs(results, target) || right.dfs(results, target);
		}
		if (left != null) {
			return left.dfs(results, target);
		}
		if (right != null) {
			return right.dfs(results, target);
		}
		return false;
	}

	// Breadth First Search
	public boolean bfs(List<Integer> results, int target) {
		if (results != null) {
			results.add(value);
		}
		if (target == value) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		List<Integer> results = new ArrayList<>();
		BinarySearchTree root = new BinarySearchTree(5);
		root.insert(3);
		root.insert(6);
		root.insert(1);
		root.insert(1);
		root.insert(1);
		root.insert(1);
		root.insert(1);
		root.insert(1);
		root = root.remove(5);
		System.out.println(root.dfs(results, -1) + " " + results);
		System.out.println();
	}	

}
