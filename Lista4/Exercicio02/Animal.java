package exercicio02;

import static java.lang.System.exit;
import java.util.Scanner;

public abstract class Animal {
    public abstract void fala();
    
    public static Animal[] gerarVetor(){
        Scanner teclado = new Scanner(System.in);
        Animal v[] = new Animal[10];
        for (int i=0; i<10; i++){
            System.out.println("");
            System.out.println("APERTE A TECLA CORRESPONDENTE: ");
            System.out.println("1 - INSTANCIA CÃO\n2 - INSTANCIA GATO\n3 - INSTANCIA HOMEM\nOUTRA TECLA - ENCERRA EXECUÇÃO");
            System.out.println("");
            int op = Integer.parseInt(teclado.nextLine());
            if (op == 1)
                v[i] = new Cão();
            else if (op == 2)
                v[i] = new Gato();
            else if (op == 3)
                v[i] = new Homem();
            else 
                exit(0);
        }
        return v;
    }
}
