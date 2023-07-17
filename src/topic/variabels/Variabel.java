package topic.variabels;

public class Variabel {
	
	float a ;
	static int b = 10;

	public static void main(String[] args) {
		Variabel v = new Variabel();
		int c = 90 ;
		//instance vari always called by object.variabel
		System.out.println(v.a);
		// without creating object of class we can access the variabel
		System.out.println(b);
		System.out.println(c);

	}
}
