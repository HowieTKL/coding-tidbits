package challenges;

public class PalindromeDetector {

	public PalindromeDetector() {}

	public static void main(String[] args) {
		if (args.length > 0) {
			System.out.println(isPalindrome(args[0]));
			
			// inefficient but easy: s.equals(reverse(s)) 
		}
	}
	
	public static boolean isPalindrome(String s) {
		char[] ss = s.toCharArray();
		for (int i = 0; i < s.length() / 2; ++i) {
			System.out.println(ss[i] + " " + ss[s.length() - i - 1]);
			if (ss[i] != ss[s.length() - i - 1]) {
				return false;
			}
		}
		return true;
	}
}
