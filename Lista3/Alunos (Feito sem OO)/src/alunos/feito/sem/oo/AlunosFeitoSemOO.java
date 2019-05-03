package alunos.feito.sem.oo;

import java.util.Scanner;

public class AlunosFeitoSemOO {
    
    public static void sortIdade(int[] idades, String[] nomes){
        int i, j, min;
        for (i=0; i<idades.length;i++){
            min = i;
            for (j=i+1; j<idades.length;j++)
                if (idades[j]<idades[min])
                    min = j;
            if (min!=i){
                int temp = idades[i];
                idades[i] = idades[min];
                idades[min] = temp;
                String temp2 = nomes[i];
                nomes[i] = nomes[min];
                nomes[min] = temp2;
            }
        }
    }
    
    public static void sortAlfabetico(int[] idades, String[] nomes){
        int i, j, min;
        for (i=0; i<nomes.length;i++){
            min = i;
            for (j=i+1; j<nomes.length;j++)
                if (nomes[j].compareToIgnoreCase(nomes[min])<0)
                    min = j;
            if (min!=i){
                int temp = idades[i];
                idades[i] = idades[min];
                idades[min] = temp;
                String temp2 = nomes[i];
                nomes[i] = nomes[min];
                nomes[min] = temp2;
            }
        }
    }
    
    public static void imprimeVetores(int[] idades, String[] nomes){
        for(int i=0; i<10; i++){
            System.out.println("NOME: " + nomes[i]);
            System.out.println("IDADE: " + idades[i]);
        }
    }
    
    public static void main(String[] args) {
        String nomes [] = new String[10];
        int idades [] = new int[10];
        Scanner teclado = new Scanner(System.in);
        for (int i=0; i<10; i++){
            nomes[i] = teclado.nextLine();
            idades[i] = Integer.parseInt(teclado.nextLine());                   //APENAS TECLADO.NEXTINT() NÃO CONSOME O \n
        }

	imprimeVetores(idades, nomes);
        System.out.println("ORDENADO POR IDADE: ");
        sortIdade(idades, nomes);
        imprimeVetores(idades, nomes);
	System.out.println("ORDENADO ALFABETICAMENTE: ");
        sortAlfabetico(idades, nomes);
	imprimeVetores(idades, nomes);        
    }
    
}
