package com.tushar.recruitment;

public class PHP_Recruitment extends RecruitmentProcess {

	@Override
	public boolean WrittenExam() {
		System.out.println("PHP_Recruitment.WrittenExam()");
		return true;
	}

	@Override
	public boolean OralExam() {
		System.out.println("PHP_Recruitment.OralExam()");
		return true;
	}

}
