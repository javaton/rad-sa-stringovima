package stringovi;

import java.lang.annotation.Documented;
import java.text.NumberFormat;

public class Demo {

	public static void main(String[] args) {
		String s1 = "Danas je lep dan";
		String s2 = "Danas je suncan dan";
		
		StringBuffer bf = new StringBuffer();
		bf.append(s1);
		bf.append(". ");
		bf.append(s2);
		
		System.out.println(bf);
		
		bf.delete(5, 8);
		bf.insert(5, " nije");
		
	
		System.out.println(bf);
		System.out.println(bf.reverse());
	}

}
