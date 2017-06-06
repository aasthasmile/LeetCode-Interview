import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MedianSlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = new int[] { 1, 3, -1, -3, 5, 3, 6, 7 };
		int nums1[] = new int[] { 1, 4, 2, 3 };
		int k = 3;

		double[] result = medianSlidingWindow(nums1, k);

	}

	public static double[] medianSlidingWindow(int[] nums, int k) {

		List<Double> median = new ArrayList<>();

		for (int i = 0; i < nums.length - 2; i++) {
			double effectiveMedian = 0;
			PriorityQueue<Integer> minheap = new PriorityQueue<>(k);
			PriorityQueue<Integer> maxheap = new PriorityQueue<>(k, Collections.reverseOrder());
			for (int j = i; j < i + k && i+k<=nums.length; j++) {

				if (nums[j] > effectiveMedian)
					minheap.add(nums[j]);
				else
					maxheap.add(nums[j]);
			}
			if (minheap.size() > maxheap.size() + 1)
				maxheap.add(minheap.poll());

			else if (minheap.size() < maxheap.size() + 1)
				minheap.add(maxheap.poll());

			if (minheap.size() == maxheap.size())
				effectiveMedian = (minheap.peek() + maxheap.peek()) / 2;
			else if (minheap.size() > maxheap.size())
				effectiveMedian = minheap.peek();
			else
				effectiveMedian = maxheap.peek();

			System.out.println(effectiveMedian);
			median.add(effectiveMedian);

		}

		double[] d = new double[median.size()];

		for (int i = 0; i < d.length; i++) {
			d[i] = (double) median.get(i);
			//System.out.print(d[i]+" ");
		}

		return d;
	}
}
