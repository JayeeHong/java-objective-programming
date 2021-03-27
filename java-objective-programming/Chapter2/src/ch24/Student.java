package ch24;

import java.util.ArrayList;

public class Student {

	private int studentNumber;
	private String studentName;
	private ArrayList<Subject> studentScore;
	
	public Student(int studentNumber, String studentName) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		
		studentScore = new ArrayList<>();
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void addSubject(String subjectName, int subjectScore) {
		Subject score = new Subject(subjectName, subjectScore);
		studentScore.add(score);
	}
	
	public void showStudentInfo() {
		int total = 0;
		
		for(Subject studentScore : studentScore) {
			System.out.println("학생 " + studentName + "의 " + studentScore.getSubjectName() + " 과목 성적은 " + studentScore.getSubjectScore() + "입니다.");
			total += studentScore.getSubjectScore();
		}
		
		System.out.println("학생 " + studentName + "의 총점은 " + total + "입니다.");
		
	}
}
