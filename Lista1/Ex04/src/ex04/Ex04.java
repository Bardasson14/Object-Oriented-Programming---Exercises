package ex04;

import java.util.Scanner;

public class Ex04 {
    
    public static void bhaskara(double a, double b, double c){
        double delta = (b*b)- 4*a*c;
        if (a==0||delta<0){
            System.out.println("ERRO!");
            return;
        }       
        double x1 = (-b+Math.sqrt(delta))/2*a;
        double x2 = (-b-Math.sqrt(delta))/2*a;
        System.out.printf("X1 = %.2f\n", x1);
        System.out.printf("X2 = %.2f\n", x2);
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = teclado.nextDouble();
        bhaskara(a,b,c);
    }
    
}
