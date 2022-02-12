package com.tushar.recruitment.factory;

import com.tushar.recruitment.JAVA_Recruitment;
import com.tushar.recruitment.PHP_Recruitment;
import com.tushar.recruitment.RecruitmentProcess;

public class RecruitmentFactory {

	public static RecruitmentProcess getInstance(String type) {
		if (type.equalsIgnoreCase("JAVA"))
			return new JAVA_Recruitment();
		else if (type.equalsIgnoreCase("PHP"))
			return new PHP_Recruitment();
		else throw new IllegalArgumentException("INVALID Recruitment Techno.");
	}
}
