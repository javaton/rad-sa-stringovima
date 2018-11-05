package stringovi;

public class Demo {

	public static void main(String[] args) {
		String s1  = "danas";
		String s4  = "Danas";
		String s2 = " je lep dan";
		String s3 = s1 +s2;
		System.out.println(s3);

//		System.out.println(s3.substring(0,5));
		System.out.println("Da li je jednako " 
					+ s1.equalsIgnoreCase(s4));
		
		System.out.println(s3.indexOf("an"));
		System.out.println(s3.lastIndexOf("an"));
		
		char[] niz = s3.toCharArray();
		System.out.println(niz.length);

	}

}
