package exercises;

import java.util.Scanner;

public class doWhile2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String name;
		System.out.println("enter your name or s to exit");
		name = scan.nextLine();
		while (!name.equals("s")) {
			System.out.printf("welcome %s\n", name);
			System.out.println("enter your name or s to exit");
			name = scan.nextLine();

		}

	}

}
