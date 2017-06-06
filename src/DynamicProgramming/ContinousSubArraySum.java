package DynamicProgramming;

import java.awt.Checkbox;

public class ContinousSubArraySum {

	public static void main(String[] args) {

		int nums[] = new int[] { 23, 2, 6, 4, 7 };
		int k = 0;
		boolean var=checkSubarraySum(nums, k);
		System.out.println(var);
	}

	public static boolean checkSubarraySum(int[] nums, int k) {
		// TODO Auto-generated method stub
		boolean flag=false;
		
		if(nums.length<=1) return false;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0 && nums[i+1]==0)
				flag=true;
		}
			
		if(k==0) return false;
		if(k<0) k=-k;

		
		int max_now = 0;
		int maxTotal = 0;
		
		for (int i = 0; i < nums.length; i++) {
			max_now = max_now + nums[i];

			 if (max_now > maxTotal && max_now % 6 == 0) {
				maxTotal = max_now;
				flag = true;
			}

		}

		
		return flag;
	}

}
