
public class StringsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("a\\b\\c\"d\"");
		
		System.out.println("");
		
		System.out.print("\\t is a tab, \\n is a new line, \\\" prints a \"quote\"");
		
		System.out.println("");
		
		System.out.print("\"line one\" \n\\line\ttwo\\");

		System.out.println("");
		
		System.out.print("\\\\denotes a single line comment \n \\*denotes a multiline comment*\\");
		
		System.out.println("");
		
		System.out.print("\"\\\\\"\\\"\" \n \t \\\"\\\"\"\\ \n \\\"\"\"\"\\");
		
		System.out.println("");
		
		String word = "Birthday";
		
		System.out.println("");
		
		System.out.println(word.toUpperCase());
		
		String word2 = "it's my party";
		
		System.out.println(word2.substring(0,4) + " a \"" + word2.substring(8).toUpperCase() + "\"");
		
		String word3 = "\"whose a whats it\"";
		
		System.out.println(word3.substring(1,6).toUpperCase() + "\nis " + word3.substring(9,13).toUpperCase()); 
		
		String word4 = "Every Way The Wind Blows";
		
		System.out.println(word4.substring(0,5).toLowerCase() + " " + word4.substring(6,9).toUpperCase() + word4.substring(9,13).toLowerCase() + " \\" + word4.substring(14,18).toUpperCase() + "\\ " + word4.substring(19).toLowerCase() + " 4");
	}

}
