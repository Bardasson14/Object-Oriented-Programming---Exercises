public class OrdenadorNome extends Ordenador {
    
    public OrdenadorNome() {
        super();
    }
    
    @Override
    public Pessoa compara(Pessoa Pessoa1, Pessoa Pessoa2){
        if ((Pessoa1.getNome().compareToIgnoreCase(Pessoa2.getNome()))<0)
            return Pessoa1;
        else
            return Pessoa2;
    }
}
