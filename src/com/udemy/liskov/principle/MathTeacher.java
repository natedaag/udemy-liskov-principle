package com.udemy.liskov.principle;

public class MathTeacher extends SchoolStaff implements CourseInstructor {

	@Override
	public void teach() {
		System.out.println("teaching Math");
	}



}
