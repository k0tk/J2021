package by.itstep.strings;

import java.util.Random;

public class Tasks {
	
	public static final String BASE ="QWERTYUIOPASDFGHJKLZXCVBNM";

	// test => TEST,TEST,TEST,TEST, 4
	static void t1(String str) {
		int size = str.length();
		str = str.toUpperCase();
		str = str + ", " + str + ", " + str + ", " + str;
		str = str + ", " + size;
		System.out.println(str);
	}

	static void t2(String str) {
		char first = str.charAt(0);
		char last = str.charAt(str.length() - 1);
		String result = first + (last + "");
		System.out.println(result.toLowerCase());

	}

	static void t3(String str) {

		if (str.contains("*")) {
			System.out.println("contains");
		} else {
			System.out.println("no contains");
		}

	}

	static void t4(String str) {
		if (str.length() > 5) {
			String result = str.substring(str.length() - 3) + str.substring(0, 3);

			System.out.println(result);
		} else {
			String res = "";
			for (int i = 0; i < str.length(); i++) {
				res += str.charAt(0) + " ";
			}
			System.out.println(res);
		}
	}

	static void t5(String str, String str2) {
		if (str.length() > str2.length()) {
			int size = str.length();
			int res = size - str2.length();
			System.out.print(str);
			System.out.println(" " + res);
		} else if (str.length() < str2.length()) {
			int size = str2.length();
			int res1 = size - str.length();
			System.out.print(str2);
			System.out.println(" " + res1);
		} else

		{
			System.out.println("������ �����");
		}
	}

	static void t6(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	static void t7(String str) {
		String revers = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revers += str.charAt(i);

		}
		if (str.equalsIgnoreCase(revers)) {
			System.out.println("TREU");
		} else {
			System.out.println("FALSE");
		}
	}

	static void t8(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				System.out.print((str.charAt(i) + "").toUpperCase());
			} else {
				System.out.print(((str.charAt(i) + "").toLowerCase()));
			}
		}
	}

	static void t9(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println();

	}

	static void t10(String str) {
		String numbers = "";
		for (char ch : str.toCharArray()) {
			if (ch >= 48 && ch <= 57) {
				numbers += ch;
			}

		}
		System.out.println(numbers);
	}

	static void t11(String str) {
		int sum = 0;
		for (char ch : str.toCharArray()) {
			if (ch >= 48 && ch <= 57) {
				int num = Integer.parseInt(ch + "");
				sum += num;
			}

		}
		System.out.println(sum);
	}

	static void t12(String str) {
		int sum = 0;
		for (char ch : str.toCharArray()) {
			if (ch == '*') {

				sum += ch;
			}
		}
		System.out.println(sum);
	}

	static void t13(String str) {
		int count = 0;
		String word = "java";

//		int l = str.indexOf(word) + word.length() - 1;
//
//		if (l != -1) {
//			count++;
//		}
//		str = str.substring(l + 1);

		int index = 0;

		while ((index = str.indexOf(word) + word.length() - 1 ) != -1) {
			count++;
			str = str.substring(index+1);
		}

		System.out.println(count);
	}
	
	
	//"QWERTYUIOPASDFGHJKLZXCVBNM"
	
	public static String getRandomWord( int wordSize) {
		StringBuilder sb = new StringBuilder(wordSize);
		String base ="QWERTYUIOPASDFGHJKLZXCVBNM";
		Random random = new Random();
		
		for (int i = 0; i < wordSize; i++) {
			int x =random.nextInt(base.length());
			sb.append(base.charAt(x));
		}
		
		return sb.toString();
	}
	
	
	public static String getRandomWord() {
		String base ="QWERTYUIOPASDFGHJKLZXCVBNM";
		int wordSize=(int)( Math.random()*base.length())+1;
		StringBuilder sb = new StringBuilder(wordSize);
		Random random = new Random();
		for (int i = 0; i < wordSize; i++) {
			int x =random.nextInt(base.length());
			sb.append(base.charAt(x));
		}
		
		return sb.toString();
	}
	
	
	
	
	
	

	public static void main(String[] args) {
//		t1("JAVA");
//		t2("JAVA");
//		t3("JAVA*");
//		t4("TEST");
//		t5("TEST", "TEST");
//		t6("TEST");
//		t7("LEFT");
//		t8("LEFT");
//		t9("LEFT");
//		t10("L1EFT23");
//		t11("L1EFT23");
//		t12("***qweqweqwdsa**sdf*sf*");
//		t13("jjavaisHere123java@$Kjav#$java");
		System.out.println(getRandomWord(5));
		System.out.println(getRandomWord());
		
		
		int age = 25;
		
		System.out.printf("My %d age %s is %d ", age,"TEST", 55);
		
		System.out.println(String.format("My %d age %s is %d ", age,"TEST", 55));
		
		String str2 = "My ".concat(age+"").concat(" age TEST is ").concat(55+ "");
		
	}
}
