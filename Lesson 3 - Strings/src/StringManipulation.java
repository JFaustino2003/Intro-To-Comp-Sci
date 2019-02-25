
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
	

	}	

}
