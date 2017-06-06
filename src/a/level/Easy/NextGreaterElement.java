package a.level.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2,5});
	}

	/**
	 * Put the decreasing integers in the stack untill we get a number greater
	 * then that number eg-[5,4,3,2,1,6,7] . We keep on pushing elements in the
	 * stack untill we get the element 6 ,then we pop all elements and put
	 * (key,value) where (5,6),(4,6),(3,6),(2,6),(1,6) and similary (6,7).
	 **/
	public static int[] nextGreaterElement(int[] findNums, int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		Stack<Integer> st = new Stack<Integer>();

		for (int i = 0; i < nums.length; i++) {
			while (!st.isEmpty() && st.peek() < nums[i])
				map.put(st.pop(), nums[i]);
			st.push(nums[i]);
		}

		for (int i = 0; i < findNums.length; i++) {
			if (map.containsKey(findNums[i]))
				findNums[i] = map.get(findNums[i]);
			else
				findNums[i] = -1;
		}

		return findNums;

	}

}
