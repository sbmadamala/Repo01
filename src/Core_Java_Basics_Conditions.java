import java.util.ArrayList;

public class Core_Java_Basics_Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array2= {1,2,3,4,5,6,7};
		//print the multiple by 2 from the array and check if array has multiple of 2
		for(int i=0;i<array2.length;i++)
		{
			if(array2[i]%2==0)
			{
				System.out.println(array2[i]+" is multiple of 2");
				break;
			}
			else
			{
				System.out.println(array2[i]+" is not multiple of 2");
			}
		}
		//ArrayList vs Array (Size is fixed and values are defined at initial stage only)
		//String Arraylist
			ArrayList<String> a= new ArrayList<String>();
			a.add("Satish");
			a.add("Sowjanya");
			a.add("Samardh");
			
			System.out.println(a.get(0));
			
			
			
	}

}
