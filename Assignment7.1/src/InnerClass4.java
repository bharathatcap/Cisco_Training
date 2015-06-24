
 class sample {
	void Display(){
		System.out.println("Hello");
		
	}
	public class InnerClass4 {
		 public  void main(String[] args){
		//Anonymous Class without a name 
		InnerClass4 ic=new InnerClass4 () { ///Creating anonymous object 
			void Display(){
		
			System.out.println("Hello this is from inner class");
		}
		};
		

	}}}


