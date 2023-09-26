package com.rs.springmvccrud.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;


import com.rs.springmvccrud.dto.*;


@Repository
public class StudentDAO {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("stu");
	EntityManager em=emf.createEntityManager();
	
	public Student createStudent(Student stu) {
			try {
			em.getTransaction().begin();
			em.persist(stu);
			em.getTransaction().commit();
			return stu;
			} catch (Exception ex) {
	            if (em.getTransaction().isActive()) {
	                em.getTransaction().rollback();
	            }
	            throw ex;
	        }
	    }
	
	 public Student getStudentById(int id) {
	    	
	         return em.find(Student.class, id);
    
 }
     
 public List<Student> getAllStudent() {
 
	 		String jpql = "SELECT s FROM Student s";
 	        TypedQuery<Student> query = em.createQuery(jpql, Student.class);
 	        return query.getResultList();
 	    
 }
 
 
 public void deleteStudent(int id) {
 	Student student=getStudentById(id);
 			if(student!=null) {
     		em.getTransaction().begin();
     		em.remove(student);
     		em.getTransaction().commit();
     	}
        
         
    
        }
	public void close() {
		em.close();
		emf.close();
	}
	}
		
	


