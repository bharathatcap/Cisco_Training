
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Executor {
public static void main(String[] args) {
	SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
	Session session=factory.openSession();
	session.beginTransaction();
	Citizen citizen=new Citizen();
     citizen.setAge(24);
     citizen.setName("blah");
     Vehicle vehicle1=new Vehicle();
     vehicle1.setColour("White");
     vehicle1.setName("Honda");
     Vehicle vehicle2=new Vehicle();
     vehicle2.setColour("White");
     vehicle2.setName("Honda");
   citizen.getVehicle().add(vehicle1);
   citizen.getVehicle().add(vehicle2);
     session.save(citizen);
     session.getTransaction().commit();
     session.close();
}
}
