package by.itstep.strings;

public class StringTester {

	public static void main(String[] args) {
		String str = "abc"; // ['a','b','c']
		str= str+"def";
		System.out.println(str);
		
		String emptyEStr = new String();
		System.out.println("Empty str ="+emptyEStr);
		
		String str2 = new String ("abc");
		
		char java[] = {'j','a','v','a'};
		String str3 = new String(java);
		System.out.println(str3);
		byte barr[]= {123,22,44,77};
		String str4 = new String(barr);
		System.out.println(str4);
		
		char chars[] = {'j','a','v','a',' ','2','E','E'};
		String str5 = new String(chars);
		System.out.println(str5);
		
		System.out.println("STR5 size is "+str5.length());
		char ch2 = str5.charAt(str5.length()-1);
		System.out.println("Char is "+ch2);
		
		 int result = str5.compareTo("java 2EE ");
		System.out.println("result is "+ result);
		
		if(result==0) {
			System.out.println("String is the same");
		}else if (result > 0){
			System.out.println("STR5<");
		}else {
			System.out.println("STR5>");
		}
		str5 = str5.concat("EXTRA STR");
		System.out.println(str5);
		
		boolean isContains = str5.contains("EXTRA");
		System.out.println("is Contains? "+isContains);
		
		String phoneNum1 = "+375297075555   ".trim();
		String phoneNum2 = "+375297074545  ".trim();
		String phoneNum3 = "+375337074555      ".trim();
		System.out.println(phoneNum1.endsWith("55"));
		System.out.println(phoneNum2.endsWith("55"));
		System.out.println(phoneNum3.endsWith("55"));
		
		System.out.println("startsWith:");
		System.out.println(phoneNum1.startsWith("+37529"));
		System.out.println(phoneNum2.startsWith("+37529"));
		System.out.println(phoneNum3.startsWith("+37529"));
		
		System.out.println("**********");
		System.out.println(str5);
		String str5_=str5;
		System.out.println(str5.equals(str5_));
		System.out.println(str5.equals("java 2eeeXTRA STR"));
		System.out.println(str5.equals("java 2EEEXTRA STR"));
		str5.equals("java 2EEEXTRA STR");
		
		
		System.out.println(str5.equalsIgnoreCase("java 2eeeXTRA STR"));
		String sub1 = str5.substring(6);
		System.out.println(sub1);
		String sub2 = str5.substring(3, 8);
		System.out.println(sub2);
		str5.toCharArray();
		str5.toUpperCase();
		str5.toLowerCase();
		
		int index1 =  str5.indexOf('a');
		int index2 =  str5.lastIndexOf('a');
		System.out.println(index1);
		System.out.println(index2);
		
		str5 = str5.replace('E', 'X');
		System.out.println(str5);

		
	}
	

}
