/**
 * 
 */
package a.level.Medium;

import java.util.Scanner;

/**
 * Rahul and Ankit are the only two waiters in Royal Restaurant. Today, the
 * restaurant received N orders. The amount of tips may differ when handled by
 * different waiters, if Rahul takes the ith order, he would be tipped Ai rupees
 * and if Ankit takes this order, the tip would be Bi rupees. In order to
 * maximize the total tip value they decided to distribute the order among
 * themselves. One order will be handled by one person only. Also, due to time
 * constraints Rahul cannot take more than X orders and Ankit cannot take more
 * than Y orders. It is guaranteed that X + Y is greater than or equal to N,
 * which means that all the orders can be handled by either Rahul or Ankit. Find
 * out the maximum possible amount of total tip money after processing all the
 * orders.
 * 
 * 
 * Input:
 * 
 * • The first line contains one integer, number of test cases. • The second
 * line contains three integers N, X, Y. • The third line contains N integers.
 * The ith integer represents Ai. • The fourth line contains N integers. The ith
 * integer represents Bi.
 *
 */
public class MaximumTipCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int Testcases = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < Testcases; i++) {
			String[] orders = sc.nextLine().split(" ");
			int total_orders = Integer.parseInt(orders[0]);
			int x_orders = Integer.parseInt(orders[1]);
			int y_orders = Integer.parseInt(orders[2]);

			int x_tips[] = new int[total_orders];
			int y_tips[] = new int[total_orders];
			for (int ii = 0; ii < total_orders; ii++) {
				x_tips[ii] = sc.nextInt();
			}
			for (int ii = 0; ii < total_orders; ii++) {
				y_tips[ii] = sc.nextInt();
			}

			int maxprofit = 0;
			for (int k = 0; k < total_orders; k++) {

				if (x_tips[k] >= y_tips[k] && x_orders > 0) {
					x_orders--;
					maxprofit += x_tips[k];
				} else if (y_tips[k] > x_tips[k] && y_orders > 0) {
					y_orders--;
					maxprofit += y_tips[k];
				} else if (x_orders > 0) {
					maxprofit += x_tips[k];
				} else if (y_orders > 0) {
					maxprofit += y_tips[k];
				}

			}
			System.out.println("Ankit and Rahul Max Profit will be :" + maxprofit);
			if (sc.hasNextLine()) 
				sc.nextLine();
			
		}
	}

}
