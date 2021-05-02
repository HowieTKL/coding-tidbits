package challenges;

public class ReverseArray {

	public static void main(String[] args) {
		int[] data = { 1, 2 };
		reverse(data);
		print(data);
		
	}
	
	static void reverse(int[] data) {
		for (int i = 0; i < data.length / 2; ++i) {
			int swapIndex = data.length - 1 - i; 
			data[i] ^= data[swapIndex];
			data[swapIndex] ^= data[i];
			data[i] ^= data[swapIndex];
		}
	}
	
	static void print(int[] data) {
		for (int i = 0; i < data.length; ++i) {
			System.out.print(" " + data[i]);
		}
		System.out.println();
	}
	
	
}
