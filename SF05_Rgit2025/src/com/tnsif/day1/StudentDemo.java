package com.tnsif.day1;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 String name,usn,branch;
		 long mob;
		 int age;
		 System.out.println("Enter name: ");
		 name = sc.next();
		 System.out.println("Enter usn: ");
		 usn = sc.next();
		 
		 sc.nextLine();
		 System.out.println("Enter branch :");
		 branch = sc.nextLine();
		 System.out.println("Enter MobileNumber");
		 mob= sc.nextLong();
		 System.out.println("Enter Age:");
		 age = sc.nextInt();
		 
		 
		Student obj = new Student();
		
		obj.setName(name);
		obj.setUsn(usn);
		obj.setBranch(branch);
		obj.setMob(mob);
		obj.setAge(age);
		
		
		System.out.println(obj);
		

	}

}
