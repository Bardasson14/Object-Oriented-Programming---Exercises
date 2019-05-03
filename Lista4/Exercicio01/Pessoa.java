import java.util.Scanner;

public class Pessoa {
    int idade;
    String nome;
   
    public static Pessoa[] lerInfo(){
        Scanner teclado = new Scanner(System.in);
        System.out.printf("TAMANHO DO VETOR: ");
        int n = Integer.parseInt(teclado.nextLine());
        Pessoa v[] = new Pessoa[n];
        for (int i=0; i<n; i++){
            System.out.printf("NOME: ");
            String nome = teclado.nextLine();
            System.out.printf("IDADE: ");
            int idade = Integer.parseInt(teclado.nextLine());
            v[i] = new Pessoa(idade, nome);
        }
        return v;
    }
    
    
    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
