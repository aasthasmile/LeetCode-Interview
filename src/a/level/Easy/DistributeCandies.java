package a.level.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
	public static void main(String[] args) {
		int[] candies = new int[] { 1, 1, 2, 3, 3, 4, 4 };
		System.out.println(distributeCandies(candies));
	}

	/**
	 * We have to equally distribute the candies between the brother and sister
	 * such that if there are 2n candies then n candies goes to both and sister
	 * should win in getting highest number of varities of candies.
	 * 
	 * Varities of candies - hashSet(Store uniques) size. Equality =
	 * TotalnumberOfCandies/2; distribution of Equal Candies = Minimum of
	 * (Varities of candies ,Equality)
	 * 
	 * @param candies
	 * @return
	 */
	public static int distributeCandies(int[] candies) {
		Set<Integer> s = new HashSet<Integer>();
		// s.add(Arrays.asList(candies));
		for (int i = 0; i < candies.length; i++)
			s.add(candies[i]);

		return Math.min(s.size(), (candies.length / 2));
	}
}
