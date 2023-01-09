package Area;

import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double a , b , c;
		
		
		System.out.println("1. Kenari giriniz  :");
		a=scan.nextInt();
		
		System.out.println("2. Kenari giriniz  :");
		b=scan.nextInt();
		
		System.out.println("3. Kenari giriniz  :");
		c=scan.nextInt();
		
		System.out.println("Hipotenus : "  + c );
		
		double u ;
		u= (a+b+c) / 2 ;
		
		double cevre = 2*u ;
		
		double alan ;
		alan = Math.sqrt( u*(u-a)*(u-b)*(u-c));
		
		System.out.println("Ucgenin cevresi : "  + cevre);
		
		System.out.println("Ucgenin alani  : "  + alan );
		
	}

}
