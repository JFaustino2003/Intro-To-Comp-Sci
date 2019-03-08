
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
		
		String word = "Birthday";
		
		System.out.println("");
		
		System.out.println(word.toUpperCase());
		
		String word2 = "it's my party";
		
		System.out.println(word2.substring(0,4) + " a \"" + word2.substring(8).toUpperCase() + "\"");
		
		String word3 = "\"whose a whats it\"";
		
		System.out.println(word3.substring(1,6).toUpperCase() + "\nis " + word3.substring(9,13).toUpperCase()); 
		
		String word4 = "Every Way The Wind Blows";
		
		System.out.println(word4.substring(0,5).toLowerCase() + " " + word4.substring(6,9).toUpperCase() + word4.substring(9,13).toLowerCase() + " \\" + word4.substring(14,18).toUpperCase() + "\\ " + word4.substring(19).toLowerCase() + " 4");
		
		String word5 = "Peter Piper Picked A Peck Of Pickled Peppers";
		
		System.out.println(word5.substring(19,20) + " " + word5.substring(21,36).toLowerCase() + " " + "\t" + word5.substring(37).toLowerCase() + " " + word5.substring(0,5) + "\t" + word5.substring(12,18).toLowerCase());
		
		String word6 = "word has 4 letters";
		
		System.out.println ("\"" + word6.substring(9,10) + "\"" + " " + word6.substring(11,18) + " " + word6.substring(5,8) + " " + "\"9\"" + " " + word6.substring(11,18));
		
		String word7 = "if SUBSTRING is used";
		
		String x = "SUBSTRING";
		
		System.out.println(word7.substring(3,12).toLowerCase() + " " + word7.substring(13,15) + " " + x.length());
		
		String word8 = "Jim, Jacky, Johny, Jill";
		
		String y = "Jim";
		
		String z = "Jacky";
		
		String a = "Johnny";
		
		String b = "Jill";
		
		System.out.println(word8.substring(0,3).toLowerCase() + "\\" + y.length() + "\n" + word8.substring(5,10).toUpperCase() + "\\" + z.length() + "\n" + word8.substring(12,17).toLowerCase() + "\\" + a.length() + "\n" + word8.substring(19,23).toUpperCase() + "\\" + b.length());
	}

}
