package com.velocity.project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("|**|   Welcome To The Quiz Competition   |**|");
		System.out.println();
		System.out.println("Presented By Group *L*");
		System.out.println();
		System.out.println("Enter a Name :");
		System.out.println();
		//System.out.println("============================================");
		String StudentName = sc.next();
		System.out.println();
		System.out.println("============================================");
		System.out.println();
		Performance per = new Performance();
		per.setStudentName(StudentName);
		QuizApp q = new QuizApp();
		q.logic();

	}

}
