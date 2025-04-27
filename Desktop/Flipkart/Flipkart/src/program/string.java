package program;

public class string {
	

	public static void main(String args[])
	
	{
		String str = "Hellow John";
		System.out.println(str);
		String reversestring="";
		String[] word=str.split(" ");
		
		for (String w:word) {
			String reverseword="";
			
			for (int i=w.length()-1;i>=0;i--) {
				reverseword=reverseword+w.charAt(i);
			}
			reversestring=reversestring+reverseword+" ";
		}
		
		System.out.println(reversestring);
	}
	
	

}
