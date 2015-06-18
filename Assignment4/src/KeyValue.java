

public class KeyValue {
	int m=0;
	int n=0;
	String[] keys;
	String[] values;
	int s=3;                        //Storing size of arrays as 3
	public KeyValue (){              // Default Constructor 
		keys=new String[3];         
		values=new String[3];




	}
	public KeyValue(int a ){          //Parameterised Constructor 
		keys=new String[a];
		values=new String[a];

	}
	public void put(String k,String v){
		//To check if the key exists or not
		if (m<keys.length & n<values.length){
			keys[m++]=k;
			values[n++]=v;
			m++;
			n++;


		}
		else {
			System.out.println("Spaces are full");
		}


	}



	public String get(String  key){
		//checking if key passed belongs to the keys array 
		boolean flag=false;

		int l=0;

		for (int i=0;i<3;i++)
		{
			if (keys[i].equals(key))
			{                                                        //if keys match 
				l=i;
				flag=true;
				break;
			}
		}
		if (flag==true){
			System.out.println("Entries Match.The value is :"+values[l]);
			return values[l];

		}
		else {
			System.out.println("no such entry in the keys array");
			return null;



		}

		
	}
	public String get(int  index){ //Passing index 

		if (index<s){      //if Passed no is less than the array size
			System.out.println("keys matched..The corresponding value is :"+values[index]);
		}
		else {
			System.out.println("type a lower value for index");


		}

		return null;

	}

	public void remove(String key){  //Method to remove key and value if parameter is matched to a value in the key array
		for (int i=0;i<3;i++){
			if (keys[i]==key){      //if the keys match 
				keys[i]=null;
				values[i]=null;       //Key and value set to null or deleted.




			}}

	}
	//public void sort(Boolean b, Boolean a){
	//if (b && a){                                     //if both boolean are true 
	//Arrays.sort(keys);                           //keys array is sorted in ascending order 
	//	for (int i=0;i<20;i++){
	//	System.out.println(keys[i]);
	//	}}

	//if (b && !a){                                  //condition
	//Arrays.sort(keys,Collections.reverseOrder()); //keys array sorted in descending order 
	//for (int i=0;i<20;i++){
	//	System.out.println(keys[i]);
	//}

	//}
	//if (!b && a){                                   //condition
	//Arrays.sort(values);                         //values sorted in ascending order 
	//for (int i=0;i<20;i++){
	//System.out.println(values[i]);
	//}
	//}
	//if (!b && !a){                                    //condition
	//Arrays.sort(values,Collections.reverseOrder());//values sorted in descending order
	//for (int i=0;i<20;i++){
	//System.out.println(keys[i]);
	//}

	//}			


	//}
	public void showAll(){                //Displaying both the arrays 
		System.out.println("The Keys List is shown below :");
		for (int i=0;i<3;i++){
			System.out.print(keys[i]+"\n");

		}
		System.out.println();
		System.out.println("The values  List is shown below :");
		for (int i=0;i<3;i++){
			System.out.print(values[i]+"\n");

		}System.out.println();

	}
	public Boolean isEmpty(){
		//checks if the given array is empty

		int temp=0;

		for (int i=0;i<3;i++){
			if ((keys[i]==null && values[i]==null)){   //Checks if entries are there in both the arrays 
				temp++;
			}}
		if (temp==3){                               //if count equals size array is empty 
			System.out.println("oohoo its empty");
		}
		else {
			System.out.println(" arrayss..It aint empty yet ");	
		}
		System.out.println();       			


		return null;

	}
	public void showSpaceAvailable(){                      //calculating slots available 
		int v=keys.length;                                //storing available slots in a integer
		int dd=s-v;                                        //subtracting available slots from total size
		System.out.println("Remaining slots in the  Keys array is :"+dd);

		int o=values.length;
		int ddd=s-o;
		System.out.println("Remaining slots in the  Keys array is :"+ddd);




	}



	public static void main(String[] args) {
		System.out.println("helloo");
		KeyValue kl=new KeyValue();
		//keyValue kll=new KeyValue(3);
		kl.put("k1","v1");
		kl.put("k2","v2");
		kl.put("k3","v3");

		kl.get("k1");
		kl.get(0);
		//kl.remove("k3");
		//kl.sort(true,true);
		kl.showAll();
		kl.isEmpty();
		kl.showSpaceAvailable();





	}

}
