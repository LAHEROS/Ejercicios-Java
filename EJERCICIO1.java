package CLASE1;

import java.util.Scanner;

public class EJERCICIO1 {
	public static void main(String[] args) {
		int a,b,c; double dis,rdi,x1,x2;
		Scanner lee = new Scanner(System.in);
		do {
			System.out.println("Ingrese valor de a");
			a=lee.nextInt();
		} while (a==0);
		System.out.println("Ingrese valor de b");
		b=lee.nextInt();
		System.out.println("Ingrese valor de c");
		c=lee.nextInt();
		dis=Math.pow(b, 2)-4*a*c;
		if (dis<0) {
			System.out.println("no existe solucion en los reales");
		} else {
			rdi=Math.sqrt(dis);
			x1=(-b+rdi)/(2*a);x2=(-b-rdi)/(2*a);
			System.out.println("x1="+x1+" ,x2="+x2);
		}
	}
}
