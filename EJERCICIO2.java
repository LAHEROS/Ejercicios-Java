package CLASE1;

import java.util.Scanner;

public class EJERCICIO2 {
	static int com(int x, int y) {
		return (facto(x) / (facto(x - y) * facto(y)));
	}

	static int facto(int m) {
		int f, i;
		f = 1;
		for (i = 1; i <= m; i++) {
			f = f * i;
		}
		return f;
	}

	public static void main(String[] args) {
		int n,r;
		Scanner le = new Scanner(System.in);
		n=le.nextInt();
		r=le.nextInt();
		if ((n>=0)&&(n>0)&&(r>0)) {
			System.out.println("c= "+com(n,r));
		} else {
			System.out.println("Error");
		}
	}
}
