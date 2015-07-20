package org.demo;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
	public class ManageEmployee {

	  
	   public static void main(String[] args) {
		Workers e1=new Workers();  
		Vehicle vehicle=new Vehicle();
		vehicle.setName("Honda");
		vehicle.setVehicleno(47688);
		    e1.setName("bharath");  
		    e1.setEmpno(5672);  
		 
		   
		 //  Configuration cfg=new Configuration();  
		  //  cfg.configure("Hibernate.cfg.xml");//populates the data of the configuration file  
		      
		    //creating seession factory object  
		    SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();  
		      
		    //creating session object  
		    Session session=factory.openSession();  
		      
		    //creating transaction object  
		   session.beginTransaction();
		   session.save(e1);
		   session.save(vehicle);
		   Query query=session.createQuery("from Workers");
		
	List<Workers> mylist= (List<Workers>) query.list();
	for (Workers worker:mylist){
		System.out.println("Ouput from hql:THe employee id youe entered is "+worker.getEmpno());
	System.out.println("Ouput from hql:THe employee name youe entered is "+worker.getName());
	}

		   session.getTransaction().commit();
		   session.close();   
		   
		  
		   
		      
		}  
		}  
