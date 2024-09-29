package JavaAssignment29;

import java.util.Scanner;

public class MaxElement {
	static int arr[] = new int[5];
	static int max = arr[0];
	static double avg;
	static int sum;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 5 elements for array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
			if (arr[i] > max) {
				max = arr[i];

			}
		}
		avg = (double) sum / arr.length;

		System.out.println("the maximum element in array is:" + max);
		System.out.println(" and average = " + avg);
	}

}
