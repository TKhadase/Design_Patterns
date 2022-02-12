package com.tushar.recruitment;

public abstract class RecruitmentProcess {

	public boolean checkEducation() {
		System.out.println("RecruitmentProcess.checkEducation()");
		return true;
	}
	
	public boolean checkDocument() {
		System.out.println("RecruitmentProcess.checkDocument()");
		return true;
	}
	
	public abstract boolean WrittenExam();
	public abstract boolean OralExam();
	
	public boolean HR_Discussion() {
		System.out.println("RecruitmentProcess.HR_Discussion()");
		return true;
	}
	
	public boolean doRecruitment() {
		checkEducation() ;
		checkDocument();
		WrittenExam();
		OralExam();
		 HR_Discussion();
		return true;
	}
	
}
