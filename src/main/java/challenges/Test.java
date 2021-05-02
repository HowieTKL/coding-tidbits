package challenges;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 1000000; ++i) {
			nums.add(i);
		}
		/*
		for (int i: nums) {
			System.out.println(i);
		}
		*/
		nums.parallelStream().forEach(System.out::println);
	}

}
