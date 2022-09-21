package com.velocity.project;
// Author Karuna 
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizApp {
	
	
	Performance per  = new Performance();
    Scanner sc=new Scanner(System.in);
    int correctAnsCount=0;
    int wrongAnsCount=0;
    public void logic(){
        Question q1 = new Question("Which statement is true about Java?","A.Java is a sequence-dependent programming language ", "B. Java is a code dependent programming language ", "C. Java is a platform-dependent programming language ", "D. Java is a platform-independent programming language ");
        Question q2 = new Question("What is the extension of java code files?",  "A. .txt", "B. .pdf", "C. .sql", "D. .java");
        Question q3 = new Question("Who invented Java Programming? ", "A. Guido van Rossum", "B. James Gosling", "C. Dennis Ritchie", "D. Bjarne Stroustrup");
        Question q4 = new Question("Which one of the following is not a Java feature?", "A. Object-oriented", "B. Use of pointers", "C. Portable", "D. Dynamic and Extensible");
        Question q5 = new Question("Which of these cannot be used for a variable name in Java?", "A. identifier & keyword", "B. identifier", "C. Keyword", "D. none of the mentioned");
        Question q6 = new Question ("What is the size of float and double in java?","A.32 and 64","B.32 and 32","64 and 64","64 and 32");
        Question q7 = new Question ("Identify the return type of a method that does not return any value?","A.int","B.void","C.double","D.None") ;   
        Question q8 = new Question("An Interface with no fields or methods is known as a_____","A.Runnable Interface","B.Abstract Interface","C.Marker Interface","D.CharSequence Interface");
        Question q9 = new Question ("Which of the following is the correct syntax to create a variable in java","A.var name;","B.int name;","C.var name int;","D.All of these");
        Question q10 = new Question("Finally block is attached to?","A.Try-catch block","B.Class block","C.Method block","D.None of these");
        
        Map<Question,Character> hmap=new HashMap<>();
        hmap.put(q1,'D');
        hmap.put(q2,'D');
        hmap.put(q3,'B');
        hmap.put(q4,'B');
        hmap.put(q5,'C');
        hmap.put(q6,'A');
        hmap.put(q7,'B');
        hmap.put(q8,'C');
        hmap.put(q9,'B');
        hmap.put(q10,'A');

        for(Map.Entry<Question,Character> map:hmap.entrySet()){
            System.out.println(map.getKey().getQuestion());
            System.out.println(map.getKey().getOption1());
            System.out.println(map.getKey().getOption2());
            System.out.println(map.getKey().getOption3());
            System.out.println(map.getKey().getOption4());
            System.out.println("Enter Your Answer: ");
            Character ans=sc.next().charAt(0);

            int cans=Character.compare(ans,map.getValue());
            if(cans==0){
                System.out.println("Correct");
                correctAnsCount++;
            }
            else{
                System.out.println("Wrong");
                wrongAnsCount++;
            }

        }

        System.out.println();
        System.out.println("||================================================RESULT================================================||");
        System.out.println();
        System.out.println("|"+ "StudentName  : "  +  per.getStudentName() + "               ");
        System.out.println();
        System.out.println("|"+"Total Questions :               "+hmap.size()+ " |");
        System.out.println("|"+"Correct Answered Questions :     "+correctAnsCount+ " |");
        System.out.println("|"+"Wrong Answered Questions :       "+wrongAnsCount+ " |");
        int Score = correctAnsCount;
        per.setStudentScore(Score);
        System.out.println("|"+"Marks :                         "+ Score+" |");
        if(Score>=8){
			String p1 = "A";
			per.setStudentClass(p1);
            System.out.println("|"+"Grade : A" + "                          |");
        }
        else if(Score>=6){
        	String p2 = "B";
			per.setStudentClass(p2);
            System.out.println("|"+"Grade : B" + "                          |");
        }
        else if (Score>5){
        	String p3 = "C";
			per.setStudentClass(p3);
            System.out.println("|"+"Grade : C" + "                          |");
        }
        else { 
        	String p4 = "Fail";
        	per.setStudentClass(p4);
        	System.out.println("|"+"Grade : D - Fail" + "                       |");
        }
        
       
        UserInput userinput =new UserInput();
        userinput.insertParticipants(per.getStudentName(), per.getStudentScore(), per.getStudentClass());
    }
}
