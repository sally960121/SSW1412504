import java.util.Scanner;

public class MyCalc {

	public static void main(String[] args) {
		
		choose();
		
		
	}
	static void choose() {
		System.out.println("ID: 1412504");
		System.out.println("Name: 송서원");
		
		System.out.println("1. Add two numbers");
		System.out.println("2. Subtract two numbers");
		System.out.println("3. Multiply two numbers");
		System.out.println("4. Quit");
		
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("choose> ");
		int choice = in.nextInt();
		
		System.out.println(">x: ");
		int number1 = in.nextInt();
		System.out.println(">y: ");
		int number2 = in.nextInt();
		
		if (choice == 1) {
			int result = add(number1, number2);
			
			System.out.println("Result: " + result);
			choose();
			}
		if (choice == 2) {
			int result = substract(number1, number2);
			System.out.println("Result: " + result);
			
			choose();
		}
		if(choice == 3) {
			int result = multiply(number1, number2);
			System.out.println("Result: " + result);
			choose();
		}
		if(choice == 4) {
			System.out.println("시스템 종료");
			System.exit(0);
			
		}
	}
	public static int add(int number1, int number2) {
		return number1+number2;
	}
	public static int substract(int number1, int number2) {
		return number1-number2;
	}
	public static int multiply(int number1, int number2) {
		return number1*number2;
	}
}
