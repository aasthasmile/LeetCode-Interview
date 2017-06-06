import java.util.Set;
import java.util.TreeSet;

public class intersectionTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] intersection(int[] nums1, int[] nums2) {

		Set<Integer> list = new TreeSet<Integer>();

		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j])
					list.add(nums1[i]);
			}
		}
		int[] third = new int[list.size()];
		int i = 0;
		for (Integer num : list) {
			third[i++] = num;
		}

		return third;
	}
}
