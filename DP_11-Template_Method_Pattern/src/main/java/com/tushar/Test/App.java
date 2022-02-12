package com.tushar.Test;

import com.tushar.recruitment.RecruitmentProcess;
import com.tushar.recruitment.factory.RecruitmentFactory;

public class App 
{
    public static void main( String[] args )
    {
    	  System.out.println( "------------Template Pattern-------------" );
    	  RecruitmentProcess recruit = RecruitmentFactory.getInstance("JAVA");
    	  recruit.doRecruitment();
    }
}
