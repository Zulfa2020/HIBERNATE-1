package com.nt.test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Employee;
import com.nt.utility.HibernateUtil;

public class CollectionMappingInsertTest {

	public static void main(String[] args) {
		//get Session object
		Session ses=HibernateUtil.getSession();
		Transaction tx=null;
		boolean flag=false;
		try {
			if(!ses.getTransaction().isActive())
				tx=ses.beginTransaction();
			//prepare object
			Employee emp=new Employee();
			emp.setEname("mahesh"); emp.setEadd("newyork");
			emp.setFriendsList(List.of("ram","sam", "som","allen"));
			emp.setRelativesList(List.of("rani","chandini","raji"));
			emp.setPhones(Set.of(4999999L,6888888L,67777777L));
			emp.setBankAccounts(Map.of("PNB",5545535L,"CANARA",14465545L,"HDFC",3555534L));
			//save object
			ses.save(emp);
			flag=true;
		}//try
		catch(HibernateException he) {
			he.printStackTrace();
			flag=false;
		}
		finally {
			//Tx mgmt
			if(flag) {
				tx.commit();
				System.out.println("record is saved");
			}
			else {
				tx.rollback();
				System.out.println("record is not saved");
			}
				//close SEssionFactory
			HibernateUtil.closeSessionFactory();
		}//finally

	}//main

}//class
