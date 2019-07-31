package pack1;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter user 1 details:");
		String u1= sc.nextLine();
		System.out.println("Enter user 2 details:");
		String u2= sc.nextLine();
		
		String a1[]=u1.split(",");
		User user1= new User(a1[0],a1[1]); 
		String a2[]=u2.split(",");
		User user2= new User(a2[0],a2[1]); 
		System.out.println("\nUser 1");
		System.out.println(user1);
		System.out.println("\nUser 2");
		System.out.println(user2);
		
		if(user1.equals(user2)) {
			System.out.println("\nUser 1 is same as User 2");
		}
		else {
			System.out.println("\nUser 1 and User 2 are different");
		}
		sc.close();
	}

}
