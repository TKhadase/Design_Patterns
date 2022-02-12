package com.tushar.Test;

import com.tushar.DAO.DAO;
import com.tushar.DAO.factory.DAO_Factory;
import com.tushar.DAO.factory.DAO_Factory_generator;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "------------Abstract Factory Pattern-------------" );
        
        DAO_Factory factory = DAO_Factory_generator.getDAOFactory("Oracle");
        DAO dao=   factory.getDAO("Exam");
        dao.insert();
        dao.delete();
        dao.select();
        dao.update();
        
    }
}
