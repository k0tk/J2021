package by.itstep.strings;

public class SBTester {

	public static void main(String[] args) {
	
		int i =45;
		String s = "TEST";
		s= s+s+" EXTRA "+i+""+7 + " ADD";
		System.out.println(s);
		
		StringBuffer sbuff;
		StringBuilder sbuild = new StringBuilder();
		sbuild.append("This is Java again!").append(" EXTRA").append(7).append(3.3).append(i);
		
		String str = sbuild.toString();
		System.out.println(str);
		
		String str2	=sbuild.reverse().toString();
		System.out.println(str2);
		
		char ch =65;
		System.out.println(ch);
	}

}
