package calculadora.feita.sem.oo;

import java.util.Scanner;

public class CalculadoraFeitaSemOO {

    public static double soma(double a, double b){
        return a + b;
    }
    
    public static double subtracao(double a, double b){
        return a - b;
    }
    
    public static double multiplicacao(double a, double b){
        return a*b;
    }
    
    public static double divisao(double a, double b){
        if (b!=0) return a / b;
        else {
            System.out.println("Digite outro operando: ");
            Scanner teclado = new Scanner(System.in);
            b = teclado.nextDouble();
            return divisao(a,b);
        }
    }
    
    public static void main(String[] args) {
        Double memState = 0.0;
        Scanner teclado = new Scanner(System.in);
            
        while (true){
            System.out.println("ESTADO DE MEMÓRIA ATUAL: " + memState);
            System.out.println("OPERAÇÕES: ");
            System.out.println("1) SOMA");
            System.out.println("2) SUBTRAÇÃO");
            System.out.println("3) MULTIPLICAÇÃO");
            System.out.println("4) DIVISÃO");
            int op = teclado.nextInt();
            if (op==1||op==2||op==3||op==4)
                System.out.println("Digite um operando: ");
            if (op==1){
                Double c = teclado.nextDouble();
                memState = soma(memState, c);
            }
            if (op == 2){
                Double c = teclado.nextDouble();
                memState = subtracao(memState, c);
            }
            if (op == 3){
                Double c = teclado.nextDouble();
                memState = multiplicacao(memState, c);
            }
            if (op == 4){
                Double c = teclado.nextDouble();
                memState = divisao(memState, c);
            }
            else if (op == 0)
                break;
        }
    }
    
}
