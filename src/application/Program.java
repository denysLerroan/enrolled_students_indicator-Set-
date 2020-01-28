package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.User;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<User> set = new HashSet<>();

		System.out.print("How many courses for this instructor? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("How many students for course " + i + "? ");
			int numberOfStudents = sc.nextInt();
			for (int j = 0; j < numberOfStudents; j++) {
				int userCode = sc.nextInt();
				set.add(new User(userCode));
			}
		}

		System.out.println("Total students: " + set.size());

		sc.close();
	}
}
