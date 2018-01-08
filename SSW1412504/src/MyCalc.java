import java.util.Scanner;

public class MyCalc {

	public static void main(String[] args) {
		
		choose();
		
		
	}
	static void choose() {
		System.out.println("ID: 1412504");
		System.out.println("Name: ¼Û¼­¿ø");
		
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
	
	}
	static int add(int number1, int number2) {
		return number1+number2;
	}
		
}
