
public class String_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is an object that represents the sequence of characters
		//Strings are defined in 2 ways- Literal and new key word
		//String- Literal. In this below condition, since the string is duplicate it is considered for 1 variable only
		String a= "Satish";
		String b= "Satish";
		//String- New Key Word. In this below condition, since even if the string is duplicate it is considered for 2 variables only
		String c= new String("Satish");
		String d= new String("Satish");
		//Split the string with spaces
		String Names= "Sowjanya Satish Samaradh ";
		String[] SplitNames= Names.split(" ");
		//System.out.println(SplitNames[0]);
		//System.out.println(SplitNames[1]);
		//System.out.println(SplitNames[2]);
		//Split the string with a name and remove spaces with trim method
		String Name= "Satish Sowjanya Samardh";
		String[] Splitted= Name.split("Sowjanya");
		System.out.println(Splitted[0]);
		System.out.println(Splitted[1]);
		System.out.println(Splitted[1].trim());//Trim the space
		//Print characterwise which means iterates with string
		for(int i=0;i<Name.length();i++)
		{
			System.out.println(Name.charAt(i));
		}
		//print in reverse order
		for(int j= Name.length()-1;j>=0;j--)
		{
			System.out.println(Name.charAt(j));
		}
	}

}
