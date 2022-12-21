package ch02.ex02;

public class C04String {
	public static void main(String[] args) {
		String s = "|" + " a happy ".trim() + "|";
		s = s.concat(" dog");
		s = s.substring(2);
		System.out.println(s);
		
		s = "hello";
		System.out.printf("%c\n", s.charAt(1));
		
		int i = "apple".codePointAt(0);
		i = "a".hashCode();
		i = "b".hashCode();
		i = "b".compareTo("a");
		i = "a".compareTo("b");
		i = "A".compareTo("a");
		i = "A".compareToIgnoreCase("a");
		i = s.indexOf("l");
		i = s.lastIndexOf("l");
		i = s.length();		
		System.out.println(i);
		
		s = "develop";
		boolean b = s.startsWith("de");
		b = s.endsWith("lop");
		b = s.equals("develop");
		b = s.equals("Develop");
		b = s.equalsIgnoreCase("Develop");
		b = "".isEmpty();
		b = s.matches("[a-zA-Z]*");
		b = s.matches("[0-9]*");
		System.out.println(b);		
	}
}

//|a happy| dog
// happy| dog