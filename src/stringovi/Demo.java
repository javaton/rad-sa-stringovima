package stringovi;

public class Demo {

	public static void main(String[] args) {
		String s1  = "Danas";
		String s2 = "               je lep dan";
//		String s3 = s1 + petnaesti +s2; ne moze
//		String s3 = s1 + 15 +s2; ok
		String s3 = s1 +s2;
		System.out.println(s3);
//		Uzimanje dela stringa iz reci
		String s4 = s3.substring(13);
		System.out.println(s4);
		String s5 = s3.substring(2, 5);
		System.out.println(s5);
//		Zamena odredjenog karaktera
		String s6 = s1.replace("na", "o");
		System.out.println(s6);
//		Odsecanje razmaka pre i posle reci
		String s7 = s2.trim();
		System.out.println(s7);
//		Povecanje svih slova
		String s8 = s1.toUpperCase();
		System.out.println(s8);
//		Smanjivanje svih slova u stringu
		String s9 = s1.toLowerCase();
		System.out.println(s9);
//		Duzina Stringa
		System.out.println("Duzina stringa je " +s3.length());
		
		System.out.println("Vidimo se za pola sata!");
	}

}
