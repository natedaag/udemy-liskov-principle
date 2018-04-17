package com.udemy.liskov.principle;

public class ScienceTeacher extends SchoolStaff implements CourseInstructor {

	@Override
	public void teach() {
		System.out.println("teaching science");
	}
	
}
