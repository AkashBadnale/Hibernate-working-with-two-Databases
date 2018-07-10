package com.ab.HB_two_DBs;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session   hsqlSession  = new  Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
    	Transaction hqlTx = hsqlSession.beginTransaction();
    	
    	List<Address>  listOfAddr = new ArrayList<>();
    	listOfAddr = hsqlSession.createQuery("from Address").getResultList();
    	
    	hsqlSession.flush();
    	hqlTx.commit();
    	hsqlSession.close();
    	
    	Session mysqlSession = new  Configuration().configure("hibernate.other.cfg.xml").buildSessionFactory().openSession();
    	Transaction mysqlTx = mysqlSession.beginTransaction();
    	
    	for(Address address : listOfAddr) {
    		mysqlSession.save(new Address(address.getHouseNo(),address.getStreetName(),address.getAreaName(),address.getPinCode(),address.getVillageName(),address.getDistrictName(),address.getStateName(),address.getCountryName()));
    	}
    	
    	mysqlSession.flush();
    	mysqlTx.commit();
    	mysqlSession.close();
    }//main
}//App
