package ex03;
import java.util.Random;

public class Ex03 {
    
    public static String mutacao(String s){
        char vet[] = {'A','T','C','G'};
        Random aleatorio = new Random();
        int r1 = aleatorio.nextInt(4);
        int r2 = aleatorio.nextInt(s.length());
        while(Character.toString(vet[r1]).equals(s.substring(r2, r2+1))){
            r2 = aleatorio.nextInt(s.length());
        }
        String s1 = new String();
        if (r2==0){
            s1 = vet[r1] + s.substring(1, s.length());
            return s1;
        }
        s1 = s.substring(0, r2) + vet[r1] + s.substring(r2+1, s.length());
        return s1;
    }
    
     public static void recombinacao(String s1, String s2) {
        Random aleatorio = new Random();
        int pos = aleatorio.nextInt(s1.length());
        String temp = s1.substring(pos, s1.length());
        s1 = s1.substring(0, pos) + s2.substring(pos, s1.length());
        s2 = s2.substring(0, pos) + temp;
        System.out.println("RECOMBINAÇÃO DE A: " + s1);
        System.out.println("RECOMBINAÇÃO DE B: " + s2);
        String c = new String(s1);
        String d = new String(s2);
        int escolhido = aleatorio.nextInt(2);
        
        if (escolhido == 0)
            System.out.println("MUTAÇÃO DE A: " + mutacao(s1));
        else if (escolhido == 1)
            System.out.println("MUTAÇÃO DE B: " + mutacao(s2));
    }
    
    public static void main(String[] args) {
        String a = "ACTCGAT";
        String b = "GGTACTG";
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        recombinacao(a,b);
        
    }
}
