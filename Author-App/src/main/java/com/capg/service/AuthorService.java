package com.capg.service;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.dto.Author;


public class AuthorService
{
	
private static EntityManagerFactory emf=  Persistence.createEntityManagerFactory("pu");

	
	public void insertData()
	{
		
		EntityManager em= emf.createEntityManager();
		
		  Author authorObj =new Author();
		
		  authorObj.setAuthorFirstName("Amit");
		  authorObj.setAuthorMiddleName("Kumar");
		  authorObj.setAuthorLastName("Jain");
		  authorObj.setAuthorPhoneNo(989989899);
		  
	      System.out.println("Transaction started");
	      em.getTransaction().begin();
	      
	      em.persist(authorObj);
		  System.out.println("Persist");
		 
	      em.getTransaction().commit();
	      em.close();
	      System.out.println("--------------------");
      
		
	}
	
	public void findData()
	{
		EntityManager em= emf.createEntityManager();
	
		Author obj =em.find(Author.class, 141);
		  
		  System.out.println("Name-"+" "+obj.getAuthorFirstName()); 
		  
		  Author obj1 =em.find(Author.class, 201);     // find(classname, primarykey)
		  
		  System.out.println("Name-"+" "+obj1.getAuthorFirstName()); 
		  
	}
	
	public void updataData()
	{
		EntityManager em= emf.createEntityManager();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("For Updations in Databse");
		
		System.out.println("Enter Student_Id");
		String s = sc.next();
		int id= Integer.parseInt(s);
		
		System.out.println("Enter Column Name for the updation");
		String columnName= sc.next();
		
		Author obj = em.find(Author.class, id);
		
		em.getTransaction().begin();
		System.out.println("Transaction Started");
		
		if(columnName.equalsIgnoreCase("sName"))
		{
			System.out.println("Enter Student Name");
			String name= sc.next();
			obj.setAuthorFirstName(name);
			
		}
		
		if(columnName.equalsIgnoreCase("phoneNo"))
		{
			System.out.println("Enter Student PhoneNo");
			int no= sc.nextInt();
			obj.setAuthorPhoneNo(787878787);
			
		}
		
		em.getTransaction().commit();
		
		em.close();
		System.out.println("Updation Done----");
				
	}
	
	public void removeData()
	{
		
        EntityManager em= emf.createEntityManager();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("For Deletion from Databse");
		
		System.out.println("Enter Student_Id");
		String s = sc.next();
		int id= Integer.parseInt(s);

		Author obj = em.find(Author.class, id);
		
		em.getTransaction().begin();
		System.out.println("Transaction Started");
		
		if(id==obj.getAuthorId())
		{
			em.remove(obj);
			
		}
	
		em.getTransaction().commit();
		
		em.close();
		System.out.println("Deletion Done----");
	}
	
}
