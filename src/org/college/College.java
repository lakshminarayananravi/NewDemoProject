package org.college;

public class College {
	
	private void collegeName() {
		System.out.println("College name is K.ramakrishnan college");

	}
	
	private void collegeCode() {
		System.out.println("College code is 8763830");

	}
	
	
	private void collegeRank() {
		System.out.println("College rank is 20");

	}
	
	public static void main(String[] args) {
		College clg=new College();
		clg.collegeName();
		clg.collegeCode();
		clg.collegeRank();
		
		Student sd=new Student();
		sd.studentName();
		sd.studentDept();
		sd.StudentId();
		
		
		Hostel hl=new Hostel();
		hl.hostelName();
		
		Dept d=new Dept();
		d.deptName();
		
	}
	
	

}
