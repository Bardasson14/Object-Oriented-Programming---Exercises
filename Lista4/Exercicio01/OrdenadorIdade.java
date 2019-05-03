public class OrdenadorIdade extends Ordenador {
    
    public OrdenadorIdade(){
        super();
    }

    @Override
    public Pessoa compara(Pessoa Pessoa1, Pessoa Pessoa2){
        if (Pessoa1.getIdade() < Pessoa2.getIdade()){
            return Pessoa1;
        }
        else{
            return Pessoa2;
        }
    }
}

