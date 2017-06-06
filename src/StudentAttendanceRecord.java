
public class StudentAttendanceRecord {

	public static void main(String[] args) {
		System.out.println(checkRecord("PPALLL"));   

	}

	public static boolean checkRecord(String s) {

		int countA=0,countL=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='A')
				countA++;
			else if(i<s.length()-2 && s.charAt(i)=='L' && s.charAt(i+1)=='L' && s.charAt(i+2)=='L')
				countL++;
		}
		
		return (countA <=1 && countL==0);
	}

}
