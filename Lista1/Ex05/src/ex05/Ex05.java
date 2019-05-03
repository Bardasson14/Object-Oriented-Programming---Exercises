package ex05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x1 = teclado.nextInt();
        int y1 = teclado.nextInt();
        int x2 = teclado.nextInt();
        int y2 = teclado.nextInt();
        int x3 = teclado.nextInt();
        int y3 = teclado.nextInt();
        int [][] m = new int[3][5];
        
        m[0][0] = x1;
        m[0][1] = y1;
        m[0][2] = 1;
        m[0][3] = x1;
        m[0][4] = y1;
        m[1][0] = x2;
        m[1][1] = y2;
        m[1][2] = 1;
        m[1][3] = x2;
        m[1][4] = y2;
        m[2][0] = x3;
        m[2][1] = y3;
        m[2][2] = 1;
        m[2][3] = x3;
        m[2][4] = y3;
        
        int det = m[0][0]*m[1][1] + m[0][1]*m[2][3] - (m[2][4] * m[1][3]) - (m[0][3]*m[2][1]) - (m[1][1] * m[0][2]); 
        
        if ((x1 == x2 && x2==x3)||(y1 == y2 && y2 == y3)||(det==0)){
            System.out.println("Não forma triângulo!");
        }
        
        else {
            
        }
    }
    
}
