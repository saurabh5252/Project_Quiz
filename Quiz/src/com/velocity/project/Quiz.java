package com.velocity.project;

 public class Quiz{
	  class Quiz{
	
		Performance per  = new Performance();
	    Scanner sc=new Scanner(System.in);
	    int correctAnsCount=0;
	    int wrongAnsCount=0;
	    public void logic(){
	        Questions q1 = new Questions(" Which statement is true about Java?","A.Java is a sequence-dependent programming language ", "B. Java is a code dependent programming language ", "C. Java is a platform-dependent programming language ", "D. Java is a platform-independent programming language ");
	        Questions q2 = new Questions("What is the extension of java code files?",  "A. .txt", "B. .pdf", "C. .sql", "D. .java");
	        Questions q3 = new Questions("Who invented Java Programming? ", "A. Guido van Rossum", "B. James Gosling", "C. Dennis Ritchie", "D. Bjarne Stroustrup");
	        Questions q4 = new Questions("Which one of the following is not a Java feature?", "A. Object-oriented", "B. Use of pointers", "C. Portable", "D. Dynamic and Extensible");
	        Questions q5 = new Questions("Which of these cannot be used for a variable name in Java?", "A. identifier & keyword", "B. identifier", "C. Keyword", "D. none of the mentioned");
            Questions q6 = new Questions ("What is the size of float and double in java?","A.32 and 64","B.32 and 32","64 and 64","64 and 32");
            Questions q7 = new Questions ("Identify the return type of a method that does not return any value?","A.int","B.void","C.double","D.None") ;   
            Questions q8 = new 	Questions("An Interface with no fields or methods is known as a_____","A.Runnable Interface","B.Abstract Interface","C.Marker Interface","D.CharSequence Interface");
            Questions q9 = new Questions ("Which of the following is the correct syntax to create a variable in java","A.var name;","B.int name;","C.var name int;","D.All of these");
            Questions q10 = new Questions("Finally block is attached to?","A.Try-catch block","B.Class block","C.Method block","D.None of these");
            
	        Map<Questions,Character> hmap=new HashMap<>();
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

	        for(Map.Entry<Questions,Character> map:hmap.entrySet()){
	            System.out.println(map.getKey().getQuestion());
	            System.out.println(map.getKey().getOption1());
	            System.out.println(map.getKey().getOption2());
	            System.out.println(map.getKey().getOption3());
	            System.out.println(map.getKey().getOption4());
//				System.out.println("Enter a Name :");
//				String StudentName = sc.next();
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
	        System.out.println("||~~~~~~~~~~~~~*** RESULT ***~~~~~~~~~~~~||");
	        System.out.println();
	        System.out.println("|"+ "StudentName  : "  +  per.getStudentName() + "            |");
	        System.out.println();
	        System.out.println("|"+"Total Questions :                "+hmap.size()+ " |");
	        System.out.println("|"+"Correct Answered Questions :     "+correctAnsCount+ " |");
	        System.out.println("|"+"Wrong Answered Questions :       "+wrongAnsCount+ " |");
	        int Score = correctAnsCount;
	        per.setStudentScore(Score);
	        System.out.println("|"+"Marks :                     "+Score+" |");
	        if(Score>8){
				String p1 = "A";
				per.setStudentClass(p1);
	            System.out.println("|"+"Grade : A+" + " |");
	        }
	        else if(Score>6){
	        	String p2 = "B";
				per.setStudentClass(p2);
	            System.out.println("|"+"Grade : Very Low" + " |");
	        }
	        else if (S){
	        	String p3 = "Medium";
				per.setStudentClass(p3);
	            System.out.println("|"+"Grade : Medium"+ " |");
	        }
	        
	        UserInput userinput =new UserInput();
	        userinput.insertParticipants(per.getStudentName(), per.getStudentScore(), per.getStudentClass());
	    }
	
}
}
