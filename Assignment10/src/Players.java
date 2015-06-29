




//Class comparable implements Comparable 
public class Players implements Comparable<Players> {
	private String name;
	private int rollno;
	//Parameterized Constructor for initializing value to name
	public Players(String names){
		this.name=names;

	}
	public Players(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	//OverRiding toString() Method 		
	public String toString(){
		return this.name;
	}
	//OverRiding compareTo Method
	public int compareTo(Players object) {

		return this.name.compareTo(object.toString()); //Compares name with the parameter passed 

	}
	//OverRiding HashCode Function
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((name == null) ? 0 : name.hashCode());
		return result;
	}
	//OverRiding equals Function	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Players other = (Players) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



}
