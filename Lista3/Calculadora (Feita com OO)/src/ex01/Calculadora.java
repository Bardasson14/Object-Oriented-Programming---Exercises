package ex01;

import java.util.Scanner;

public class Calculadora {
    private double memoryState;
    
    public void soma(double a){
        this.setMemoryState(a + this.getMemoryState());
    }
    
    public void subtracao(double a){
        this.setMemoryState(this.getMemoryState() - a);
    }
    
    public void multiplicacao(double a){
        this.setMemoryState(this.getMemoryState() * a);
    }
    
    public void divisao(double a){
        while (a==0){
            System.out.println("Digite outro operando: ");
            Scanner teclado = new Scanner(System.in);
            a = teclado.nextDouble();
        }
        this.setMemoryState(this.getMemoryState()/a);
    }
    
    public void cleanMemory(){
        this.setMemoryState(0);
    }

    public void menu(){
        while (true) {
            System.out.println("ESTADO DE MEMÓRIA: " + this.getMemoryState());
            System.out.println("------------------");
            System.out.println("     OPERAÇÕES    ");
            System.out.println("------------------");
            System.out.println("1)SOMA");
            System.out.println("2)SUBTRAÇÃO");
            System.out.println("3)MULTIPLICAÇÃO");
            System.out.println("4)DIVISÃO");
            System.out.println("5)LIMPAR MEMÓRIA");
            System.out.println("0)SAIR");
            
            Scanner teclado = new Scanner(System.in);
            int op = teclado.nextInt();
            if (op == 0)
                break;
            if (op == 5)
                cleanMemory();
            
            if (op == 1){
                System.out.println("Digite um operando: ");
                double a = teclado.nextDouble();
                soma(a);
            }
            if (op == 2){
                System.out.println("Digite um operando: ");
                double a = teclado.nextDouble();
                subtracao(a);
            }
            if (op == 3){
                System.out.println("Digite um operando: ");
                double a = teclado.nextDouble();
                multiplicacao(a);
            }
            if (op == 4){
                System.out.println("Digite um operando: ");
                double a = teclado.nextDouble();
                divisao(a);
            }
            
        }
    }
    
    
    public double getMemoryState() {
        return memoryState;
    }

    public void setMemoryState(double memoryState) {
        this.memoryState = memoryState;
    }
    
    
}

