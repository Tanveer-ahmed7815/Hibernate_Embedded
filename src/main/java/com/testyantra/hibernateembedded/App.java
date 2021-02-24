package com.testyantra.hibernateembedded;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.testyantra.dtos.Address;
import com.testyantra.dtos.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentDB");
        
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        

        
        
        Address address = new Address();
        address.setAddressId(103);
        address.setLane("1st cross");
        address.setStreet("Banaswadi");
        address.setType("Temporary");
       
       
        
        Employee employee = new Employee();
        employee.setEmployeeId(101);
        employee.setEmployeeName("Syed");
        employee.setAddress(address);
       
        
        //em.persist(addressTwo);
        //no need to persist address as its not an entity in this case
        em.persist(employee);
        
        em.getTransaction().commit();
        
        em.close();
        
        emf.close();
    }
}
