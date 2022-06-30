
public class Methods_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods_Demo a= new Methods_Demo();
		String Name= a.getData();
		System.out.println(Name);
		//Call the method defined in another class
		Method_Different_Class b= new Method_Different_Class();
		String Names= b.getUserData();
		System.out.println(Names);
		getData2();

	}
	//getData-Create a method outside the executed code so that user can call the methods wherever required
	public String getData()
	{
		System.out.println("Welcome India");
		//This method getData returns some value
		return "Cricket";
	}
	//Static- Use the class without creating the object for that class
	public static String getData2()
	{
		System.out.println("Welcome to Telangana");
		//This method getData returns some value
		return "Elections";
	}


}
