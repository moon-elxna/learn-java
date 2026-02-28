package übung12;

public class StringMethoden {
	public static void main(String[] args) {
		//
		String s1 = "java";
		char ch1[] = {'j','a','v','a'};
		//
		System.out.println(s1.equals(ch1)); //false
		String s2 = new String(ch1);
		//
		System.out.println(s1 == s2); //false
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.compareTo(s2)); //0
		//
		System.out.println(s1.charAt(3)); //a
		System.out.println(s1.length()); //4
		//
		String s41 = "java ist ";
		String s42 = "auch eine Insel";
		String s4 = s41 + s42;
		System.out.println(s4); //java ist auch eine Insel
		//
		System.out.println(s4.length()); //24
		//
		System.out.println(s4.substring(9,12)); //auc
		//
		s4 = "\n      " + s4 + "      \t\n";
		System.out.println(s4); //      java ist auch eine Insel   
		//
		s4 = s4.trim();
		System.out.println(s4); //java ist auch eine Insel
		//
		s4 = s4.toUpperCase();
		System.out.println(s4); //JAVA IST AUCH EINE INSEL 
		//
		s4 = s4.replaceAll(" ", "");
		System.out.println(s4); //JAVAISTAUCHEINEINSEL
	}

}
