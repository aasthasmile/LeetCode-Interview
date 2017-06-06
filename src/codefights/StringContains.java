package codefights;

public class StringContains {

	public static void main(String[] args) {
		System.out.println(strstr("CodefightsIsAwesome", "IsA"));
	}

	static int strstr(String s, String x) {
		if (!s.contains(x + ""))
			return -1;
		else
			return s.indexOf(x + "");
	}

}
