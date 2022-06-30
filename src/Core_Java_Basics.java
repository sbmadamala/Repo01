
public class Core_Java_Basics {

	public static void main(String[] args) {
	int myNum= 5;
	String Name= "My Name is Satish";
	char Alp= 'r';
	double Fraction= 5.090;
	boolean Solution= true;
	System.out.println(myNum+" gives the grade I achieved in class 3");
	System.out.println(Name);
	//Arrays- Store multiple values
	int[] array= new int[5];
	array[0]=1;
	array[1]=5;
	array[2]=10;
	array[3]=15;
	array[4]=3;
	//for loop
	for(int i=0;i<array.length;i++)
	{
	System.out.println(array[i]);
	}
	int[] array2= {1,2,3,4,5,6,7};
	System.out.println(array2[3]);
	for(int j=0;j<array2.length;j++)
	{
		System.out.println(array2[j]);
	}
	//for loop enhanced by creating another variable by keeping the array on the right side
	for(int a:array2)
	{
		System.out.println(a);
	}
	String[] Names = {"Satish", "Sowjanya","Samardh"};
	for (int k=0;k<Names.length;k++) 
	{
		System.out.println(Names[k]);
	}
	//for loop enhanced by creating another variable by keeping the array on the right side
	for(String N:Names)
	{
		System.out.println(N);
	}
	
  }

}
