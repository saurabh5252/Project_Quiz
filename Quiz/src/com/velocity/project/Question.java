package com.velocity.project;

public class Question {
	private String Question;
	private String Option1;
	private String Option2;
	private String Option3;
	private String Option4;

	
	
	public Question(String question, String Option1, String Option2, String Option3, String Option4) {

		Question = question;
		this.Option1 = Option1;
		this.Option2 = Option2;
		this.Option3 = Option3;
		this.Option4 = Option4;

	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public String getOption1() {
		return Option1;
	}

	public void setOption1(String option1) {
		Option1 = option1;
	}

	public String getOption2() {
		return Option2;
	}

	public void setOption2(String option2) {
		Option2 = option2;
	}

	public String getOption3() {
		return Option3;
	}

	public void setOption3(String option3) {
		Option3 = option3;
	}

	public String getOption4() {
		return Option4;
	}

	public void setOption4(String option4) {
		Option4 = option4;
	}

	@Override
	public String toString() {
		return "Question ["+ "Question=" + Question + ", Option1=" + Option1 + ", Option2=" + Option2 + ", Option3="
				+ Option3 + ", Option4=" + Option4 + "]";
	}



}
