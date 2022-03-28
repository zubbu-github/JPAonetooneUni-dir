package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AssosiationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
      EntityManager em = factory.createEntityManager();
      em.getTransaction().begin();
      
      Student student = new Student();
      student.setName("Zubeir");
      
      Address address1 = new Address();
      address1.setStreet("Devinagar");
      address1.setCity("Ballari");
      address1.setState("Karnataka");
      
      student.setAddress(address1);
      em.persist(student);
      em.getTransaction().commit();
      
      System.out.println("one to one association added in database");
      em.close();
      factory.close();
	}

}
