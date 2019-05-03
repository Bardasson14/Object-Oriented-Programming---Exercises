package ex02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Tempo gasto(h): ");
        double tempoGasto = teclado.nextDouble();
        System.out.println("Velocidade média (km/h): ");
        double velMedia = teclado.nextDouble();
        double litrosUsados = (tempoGasto * velMedia)/12;
        System.out.printf("Velocidade média: %.2f km/h\n", velMedia);
        System.out.printf("Distância percorrida: %.2f km\n", tempoGasto*velMedia);
        System.out.printf("Tempo gasto: %.2f h\n", tempoGasto);
        System.out.printf("Litros usados: %.2f l\n", litrosUsados);
    }
    
}
