package a.level.Easy;

public class converToBase7 {

	public static void main(String[] args) {
		System.out.println(convertToBase7(100));
	}

	public static String convertToBase7(int num) {
		int number = Math.abs(num);
		
		StringBuilder sb=new StringBuilder();
		while (number != 0) {
			sb.append(number % 7);
			number = number / 7;
		}
		if(num==0)return "0";

		return (num<0)?sb.append("-").reverse().toString():sb.reverse().toString();

	}
}
