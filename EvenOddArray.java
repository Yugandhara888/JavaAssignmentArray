package JavaAssignment29;
import java.util.Scanner;
public class EvenOddArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		int countOdd = 0;
		int countEven = 0;
		System.out.println("enter array 5 elements");
		for(int i = 0; i<array.length; i++) {
			array[i] = sc.nextInt();
			if(array[i]%2==0) {
				countEven++;
			}
			else if(array[i]%2==1) {
				countOdd++;
			}
		}
		System.out.println("Even Count = "+ countEven);
		System.out.println("Even Count = "+ countOdd);
		sc.close();
	}
}
