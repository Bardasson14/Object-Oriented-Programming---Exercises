import java.util.Scanner;

public class Exercicio01 {

    public static void imprime(Pessoa v[]){
        for (int i=0;i<v.length;i++){
                System.out.println("NOME: " + v[i].getNome());
                System.out.println("IDADE: " + v[i].getIdade());
            }
    }
    public static void main(String[] args) {
        //OrdenadorNome ordNome = new OrdenadorNome();
        //OrdenadorIdade ordIdade = new OrdenadorIdade();
        Scanner teclado = new Scanner(System.in);
        Pessoa v[] = Pessoa.lerInfo();
        //ordNome.ordena(v);
        //ordIdade.ordena(v);
        System.out.println("APÓS A ORDENAÇÃO");
        imprime(v);
    }
}