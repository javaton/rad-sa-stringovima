package stringovi;

import java.lang.annotation.Documented;
import java.text.NumberFormat;

public class Demo {

	public static void main(String[] args) {
		String s1 = "Danas je lep dan";
		String s2 = "Danas je suncan dan";
		boolean b = s1.regionMatches(0, s2, 0, 9);
		System.out.println(b);
		
		System.out.println(s1.startsWith(" je", 5));
		System.out.println(s1.endsWith("suncan dan"));
		
		System.out.println(s2.compareTo(s1));
//		
//		Integer i = Integer.valueOf("58D");
//		String s6 = String.valueOf(i);
		
		double d = 100.0/3;
		System.out.println(d);
		
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(5);
		String s = nf.format(d);
		System.out.println(s);
	}

}
