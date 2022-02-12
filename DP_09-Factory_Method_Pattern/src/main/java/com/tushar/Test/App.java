package com.tushar.Test;

import com.tushar.developer.Code_Developer;
import com.tushar.developer.Developer_Types;
import com.tushar.developer.factory.Certified_Code_Developer_Factory;
import com.tushar.developer.factory.Dev_Factory;
import com.tushar.developer.factory.FreeLance_Code_Developer_Factory;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "-----------------------developer factory methodTest---------" );
        Dev_Factory factory = new FreeLance_Code_Developer_Factory();
        Code_Developer developer =factory.getRequiredDeveloper(Developer_Types.JAVA);
    }
}
