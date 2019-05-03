package exercicio02;

public class Exercicio02 {
    public static void main(String[] args) {
        Animal v[] = Animal.gerarVetor();
        for (int i=0; i<v.length;i++)
            v[i].fala();
    }
    
}
