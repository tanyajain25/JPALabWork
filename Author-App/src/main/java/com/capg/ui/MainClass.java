package com.capg.ui;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.service.AuthorService;


public class MainClass
{
//	 static EntityManagerFactory emf;
	
	public static void main(String[] args) 
	{
	     try {
	    	 AuthorService s =new AuthorService();
	    	 s.insertData();
	    	 s.findData();
	    	 s.updataData();
	    	 s.removeData();
	 		
	      } finally {
//	          emf.close();
	      }		
	}
	
}
