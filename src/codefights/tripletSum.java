package codefights;
import java.util.Arrays;

public class tripletSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	boolean tripletSum(int x, int[] a) {
		
		if(a.length<3)
			return false;
		
		if(a.length==3 && a[0]+a[1]+a[2]==x)
			return true;
		
		Arrays.sort(a);
		int j = 0, k = 0;
		boolean flag = false;
		
		for (int i = 0; i < a.length - 3; i++) {
			if (i == 0 || a[i] > a[i - 1]) {
				j = i + 1;
				k = a.length - 1;
			}

			while (j < k) {
				if (a[i] + a[j] + a[k] == x) {
					flag = true;

					j++;
					k--;

					while (j < k && a[j] == a[j - 1])
						j++;
					while (j < k && a[k] == a[k + 1])
						k--;
				} else if (a[i] + a[j] + a[k] < x)
					j++;
				else
					k--;
			}
		}

		return flag;

	}

}
