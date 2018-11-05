package stringovi;

public class Demo {

	public static void main(String[] args) {
		// Instanciranje sa kljucnom recju new i vrednost kao ulazni parametar
		String s = new String("Tekst");
		//Odmah dodeljujemo vrednost String-u
		String s1 = "Tekst 2";
		System.out.println(s);
		System.out.println(s1);
//		Instanciranje iz niza karaktera
		char[] niz = {'d','a','n','a','s'};
		String s3 = new String(niz);
		System.out.println(s3);
//		Instaciranje iz dela niza
		String s4 = new String(niz, 2, 3);
		System.out.println(s4);
		////		Instanciranje iz niza bytova 
//		byte asci[] = {64,66,67,68};
//		String s4 = new String(asci);
//		System.out.println(s4);
	}

}
