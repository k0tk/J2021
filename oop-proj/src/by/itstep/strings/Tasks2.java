package by.itstep.strings;

public class Tasks2 {
	
	// "dsadsaas"->"DgsDgsXg"
	public static String t1(String str,int step) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if(i % step == 0) {
				//UPPER
				result+=(str.charAt(i)+"").toUpperCase();
			}else {
				result+=(str.charAt(i)+"").toLowerCase();
			}	
		}
		return result;
	}
	
	
	public static String getText(String txt) {
		String result = "";
		char chars[]= txt.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			int code = (int) chars[i];
			if(Character.isLetter(chars[i])) {
				result=result + chars[i];
			}
		}
		
		
		return txt;
	}
	
	public static String t2(String txt) {
		txt = txt.trim().replace("\n", "").replace("\t", "");
		return	txt.trim().replace(" ", "");
		
	}
	
	public static String t3(String txt) {
		String result = "";
		txt=t2(txt);
		if(txt.length()>0) {
			result +=txt.charAt(0);
		}
		boolean next = false;
		for (int i = 0; i < txt.length(); i++) {
			char ch =txt.charAt(i);
			if( next) {
				next = true;
				result+=ch;
				next = false;
			}
			if( ch=='.'||ch=='?'||ch=='!') {
				next = true;
			}
		}
		
		return result;
	}
	//JAVA -> A V A J
	public static String getRevrtsString(String str) {
		String result = "";	
		str = str.toUpperCase();	
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);

		}
		if (str.equalsIgnoreCase(result)) {
			System.out.println("TREU");
		} else {
			System.out.println("FALSE");
		}
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i)  +" ");
		}
		
		return result;
	}
	// asd234qwrgjj@$3 4 -> l-6,d-5,s-3
	public static String getStat(String str) {
		String result = "";
		int letters=0,digits=0,specials=0;
		for (char ch : str.toCharArray()) {
			if(Character.isLetter(ch)) {
				letters++;
			}else if(Character.isDigit(ch)) {
			digits++;
			
		}else {
			specials++;
		}
		}
		return "L-"+letters+",D-"+digits+", S-"+specials;
	}
	// "Idsvcx vjdfi gudhf vdki nvas idjfdsf dcjvbjc juvhnd Hoaso pdk iosf. Sffdsfds las
	public static int wordsCount(String str) {	
		int counter = 0;
		boolean flag = false;
		
		for (char ch : str.toCharArray()) {
			if(flag && !Character.isLetter(ch)) {
				continue;
			}
			flag =false;
			if(ch == ' ' || ch== ',' || ch== ':') {
				counter++;
				flag = true;
			}
		}
			
		
		return counter+1;
	}
	// * hello Word * ,"JAVA"->JAVA hello Word JAVA
	public static String buildString(String pattern , String s) {
		
		return s;
	}
	//Target target text
    public static String replaseString(String str , char ch) {
    	String s = "Target target text";
    	
    	
    	
		return s;
	}
    public static void task1(String str) {
    	if(str != null) {
    		String result = "";
    		boolean b = false;
    		for (int i = 0; i < str.length(); i++) {
    			if(str.charAt(i)=='.') {
    				b= true;
    			}
				if(b && Character.isLetter(str.charAt(i))) {
					result +=(str.charAt(i)+"").toUpperCase();
					b=false;
				}else {
					result+=str.charAt(i);
				}
			}
    		System.out.println(result);
    	}
    }
    
	
	
	public static void main(String[] args) {
		String s = t1("asdasdasvff",3);
		System.out.println(s);
		
		
		String s2 = getText("zfis9vucxyvc7aq8e7q8w9783454543/.[23p4392dsdfsd");
		System.out.println(s2);
		
		String s4 = t2("asd as d a   \n   s  v  ff");
		System.out.println(s4);
		
		String s5 = t3("Idsvcxvjdfigudhfvdkinv.Iasidjfdsfdcjvbjcjuvhnd.Hoasopdkiosf! 2 x 2");
		System.out.println(s5);
		
		String s6 = getRevrtsString("hello world");
		System.out.println(s6);
		
		String s7 = getStat("asd234qwrgjj@$3  4");
		System.out.println(s7);
		int s8 = wordsCount("Idsvcx , vjdfi gudhf vdki nvas idjfdsf dcjvbjc juvhnd Hoaso pdk iosf. Sffdsfds las.");
		System.out.println(s8);
	}

}
