package polymorphisam;

import java.security.PublicKey;

public class CTB {
public static void main(String[] args) {
	add (10,20);
	add (10,20,30);
}
	public static void add (int a,int b) {
	
		int c=a+b;
		System.out.println(c);
	}
		public static void add(int a,int b,int c) {
			int d=a+b+c;
		System.out.println(d);
	}

}
