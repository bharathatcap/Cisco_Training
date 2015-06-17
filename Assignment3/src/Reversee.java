
public class Reversee {

	public static void main(String[] args) {
		System.out.println("input string is ");
		
		int[] a ={1,2,4,6,7,8};
		for (int i=0;i<a.length;i++){
			System.out.print(a[i]);
		
			
			
		}
		System.out.println();
		
		System.out.println("reversed string is ");
		
		
			for (int i=(a.length)-1;i>=0;i--){
				
				System.out.print(a[i]);
				
			}
	}
}