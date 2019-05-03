package ex02;
import java.util.Scanner;

public class Ex02 {
    
    public static void sortIdade (Aluno[] vetor) {
        int i, j, min;
        for (i = 0; i < vetor.length-1; i++) {
          min = i;
          for (j = i+1; j < vetor.length; j++)
            if (vetor[j].getIdade() < vetor[min].getIdade()) 
                min = j;
          
          if (i!=min){
            Aluno aux = new Aluno(vetor[i].getNome(), vetor[i].getIdade());
            vetor[i] = vetor[min];
            vetor[min] = aux;
          }
        }
    }
    
    
    public static void sortAlfabetico(Aluno[] vetor) {
        int i, j, min;
        Aluno aux;

        for (i = 0; i < vetor.length-1; i++) {
          min = i;
          for (j = i+1; j < vetor.length; j++) {
            if ((vetor[j].getNome()).compareToIgnoreCase(vetor[min].getNome())<0) 
                min = j;
         }
          if (i!=min){
            aux = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = aux;
          }
        }
    }

    public static void imprime(Aluno [] vetor) {
	    for (int i=0; i<vetor.length;i++){
            System.out.println(vetor[i].getNome());
            System.out.println(vetor[i].getIdade());
        }
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno v[] = new Aluno[10];
        for (int i=0; i<10; i++){
            String nome = teclado.nextLine();
            int idade = Integer.parseInt(teclado.nextLine());                   //APENAS TECLADO.NEXTINT() NÃO CONSOME O \n
            v[i] = new Aluno(nome, idade);
             
        }

	    imprime(v);        
      System.out.println("ORDENADO POR IDADE: ");
            sortIdade(v);
      imprime(v);        
      System.out.println("ORDENADO ALFABETICAMENTE: ");
            sortAlfabetico(v);
      imprime(v);        

        }
        
  }
