
public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myName = "Joey Faustino";
		int nameLength = myName.length();
		System.out.println(nameLength - 1);
		
		System.out.println(myName.substring(5));
		
		String lName = (myName.substring(5));
		
		String fName = (myName.substring(0, 4));
		
		System.out.println(fName + " " + lName);
		
		System.out.println("\\\n\\");
		System.out.println("");
		System.out.println("I \"love\" \nbooks.");
		
		System.out.println("");
		
		System.out.println("\"\\\\\\\\\\\\\"");
		
		System.out.println("");
		
		String x = ("I love books");
		//Capitalize the word "love" ONLY. 
		System.out.println(x.substring(2,6).toUpperCase());
		
		System.out.println("");
		
		System.out.println("All \"good\" men should come to the aid of the country.");
		
		System.out.println("");
		
		System.out.println("Hello\nHello again");
		
		System.out.println("a\\b\\c\"d\"");
		
		System.out.println("\\t is a tab, \\n is a new line, \\\" prints a \"quote\"");
		
	

	}	

}
