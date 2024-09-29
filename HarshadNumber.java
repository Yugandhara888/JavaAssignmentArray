package JavaAssignment29;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Number = ");
		int m = sc.nextInt();
		int n = m;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		if (m % sum == 0) {
			System.out.println(m + " is Divisible By its sum ");
		} else {
			System.out.println("Number is Not Divisible By its sum");
		}
	}

}
