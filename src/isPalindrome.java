

import java.util.Stack;

public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println("String "+n +" is Palindrome : "+isPalindromeStr(n));
	}

	public static boolean isPalindromeStr(int x) {

		if (x < 0||(x!=0 && x%10==0))
			return false;
		
		int remainder=0;
		while(x>remainder){
			remainder=remainder*10+x%10;
			x=x/10;
		}
		
		if(x==remainder)return true; else return false;

		
	}

}
