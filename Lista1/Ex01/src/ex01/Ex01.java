package ex01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int d = teclado.nextInt();
        System.out.println("A + B = " + (a+b));
        System.out.println("A * B = " + (a*b));
        System.out.println("A + C = " + (a+c));
        System.out.println("A * C = " + (a*c));
        System.out.println("A + D = " + (a+d));
        System.out.println("A * D = " + (a*d));
        System.out.println("B + C = " + (b+c));
        System.out.println("B * C = " + (b*c));
        System.out.println("B + D = " + (b+d));
        System.out.println("B * D = " + (b*d));
        System.out.println("C + D = " + (c+d));
        System.out.println("C * D = " + (c*d));
    }
    
}
