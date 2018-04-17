package com.udemy.liskov.principle;

public class SchoolStaff {
	
	String name;
	
	protected void makeAnnouncements() {
		System.out.println("making announcements");
	}
	protected void takeAttendance() {
		System.out.println("taking attendance");
	}
	protected void collectPaperWork() {
		System.out.println("collecting paperwork");
	}
	protected void conductHallDuties() {
		System.out.println("conducting hall duties");
	}
	public void performOtherResponsibilities() {
		makeAnnouncements();
		takeAttendance();
		collectPaperWork();
		conductHallDuties();
		performOtherResponsibilities();
	}

}
