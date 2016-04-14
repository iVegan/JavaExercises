import java.util.Scanner;

public class BaF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums;
		nums = new int[10];
		nums[0] = 5;
		nums[1] = 7;
		nums[2] = 200;
		nums[3] = 1024;
		nums[4] = 20;
		nums[5] = 22;
		nums[6] = 32;
		nums[7] = 501;
		nums[8] = 20;
		nums[9] = 0;
		System.out.print(nums[0]);
		System.out.println(" " + nums[1]);
		System.out.println(" " + nums[2]);
		System.out.println(" " + nums[3]);
		System.out.println(" " + nums[4]);
		System.out.println(" " + nums[5]);
		System.out.println(" " + nums[6]);
		System.out.println(" " + nums[7]);
		System.out.println(" " + nums[8]);
		System.out.println(" " + nums[9]);
		System.out.print("        Enter an integer");
		int newNumber = input.nextInt();
		if(newNumber == 5) {
			System.out.println("count = 1");
			}
		if(newNumber == 7) {
			System.out.println("count = 1");
			}
		if(newNumber == 200) {
			System.out.println("count = 1");
			}
		if(newNumber == 1024) {
			System.out.println("count = 1");
			}
		if(newNumber == 20) {
			System.out.println("count = 2");
			}
		if(newNumber == 22) {
			System.out.println("count = 1");
			}
		if(newNumber == 32) {
			System.out.println("count = 1");
			}
		if(newNumber == 501) {
			System.out.println("count = 1");
			}
		if(newNumber == 0) {
			System.out.println("count = 1");
			}
		}
	}

