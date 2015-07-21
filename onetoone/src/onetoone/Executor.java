package onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Executor {
public static void main(String[] args) {
	SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
	Session session=factory.openSession();
	session.beginTransaction();
	Citizen citizen=new Citizen();
	citizen.setAge(40);
	citizen.setName("Sharath");
	Vehicle vehicle=new Vehicle();
	vehicle.setName("Honda");
	vehicle.setColour("white");
	
	citizen.setVehicle(vehicle);
	session.save(citizen);
	session.save(vehicle);
	
	session.getTransaction().commit();
	session.close();
	
}
}
