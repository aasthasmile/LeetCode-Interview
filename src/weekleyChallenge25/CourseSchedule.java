/**
 * 
 */
package weekleyChallenge25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
//import java.util.HashMap.EntrySet;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Aastha Jain
 *
 */

public class CourseSchedule {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i=10;
		while(i!=0){
			--i;
		}
		int x=i;
		System.out.println(x);

		// System.out.println(scheduleCourse(new int[][] { { 100, 200 }, { 200,
		// 1300 }, { 1000, 1250 }, { 2000, 3200 } }));
		System.out.println(scheduleCourse(new int[][] { { 7, 16 }, { 2, 3 }, { 3, 12 }, { 3, 14 }, { 10, 19 },
				{ 10, 16 }, { 6, 8 }, { 6, 11 }, { 3, 13 }, { 6, 16 } }));
	}

	public static int scheduleCourse(int[][] courses) {
		int r = courses.length, c = 0, ans = 0, l = r, temp = 0;

		if (r != 0) {
			c = courses[0].length;
		} else {
			return 0;
		}

		Arrays.sort(courses, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[1] - b[1];
			}
		});

		for (int[] is : courses) {
			System.out.println(is[0] + " " + is[1]);
		}

		PriorityQueue<int[]> heap = new PriorityQueue<int[]>(l, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return b[0] - a[0];
			}

		});

		
		heap.offer(courses[0]);
		temp += courses[0][0];
		for (int i = 1; i < l; i++) {
			int[] curr = heap.poll();
            
			if (temp + courses[i][0] <= courses[i][1]) {

				heap.offer(courses[i]);
				temp += courses[i][0];
			} else if (temp - curr[0] + courses[i][0] <= courses[i][1] && courses[i][0] < curr[0]) {
				temp -= curr[0];
				curr = courses[i];
				temp += courses[i][0];
			}

			heap.offer(curr);
		}
		ans = heap.size();

		return ans;

	}

}
