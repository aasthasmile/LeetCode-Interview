package a.level.Easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class kdiffpairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array :");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		System.out.println("Enter the array elements :");
		for (int a = 0; a < arr.length; a++) {
			arr[a]=sc.nextInt();
		}
		
		System.out.println("Enter the k value :");
		int k=sc.nextInt();
		
		System.out.println("There are :"+findPairs(arr,k));
	}

	public static int findPairs(int[] nums, int k) {

	 List<String> list=new ArrayList<>();	
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(Math.abs(nums[i] -nums[j])==k) {
				System.out.println(nums[i]+""+nums[j]);	
				if(!list.contains(nums[i]+""+nums[j])&& !list.contains((nums[j]+""+nums[i])))
				list.add(nums[i]+""+nums[j]);	
			
				}
			}
		}
		return list.size();
	}

}
