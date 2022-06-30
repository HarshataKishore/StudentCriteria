package com.example.demo.StudentCriteria;
	import java.time.LocalDate;
	import java.util.Date;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;
public class Dao 
{
    public static void main( String[] args )
    {
    		    Configuration con = new Configuration();
    	        con.configure();
    	        SessionFactory sef = con.buildSessionFactory();
    	        Session ses = sef.openSession();
    	        Transaction tr = ses.beginTransaction();
    			Student s = new Student("Padma", "16ME1A0364", "Mech", new Date(), LocalDate.of(2021, 10, 15));
    	        ses.save(s);
    	        tr.commit();
    	        ses.close();    	        
    		}
    	}
    
