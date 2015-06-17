

public class TicketFare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float adult_fare=600;
		double child_fare=0.7*adult_fare;
		int cAdult=10;
		int cChild=12;
		double totalAdultFare=10*adult_fare;
		double totalChildFare=12*child_fare;
		double total_fare=totalAdultFare+totalChildFare;
		double tax=0.14*total_fare;
		
		System.out.println("Total children's fare is :"+totalChildFare);
		System.out.println("Total adults's fare is :"+totalAdultFare);
		System.out.println("Total fare is :"+total_fare+tax);
		
	
	}

}
