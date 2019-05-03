
public abstract class Ordenador {
    public abstract Pessoa compara(Pessoa Pessoa1, Pessoa Pessoa2);
    
    public void ordena(Pessoa v[]){
        int posmenor, i, j;
        Pessoa temp;
        for (i=0; i<(v.length-1); i++){
            posmenor = i;
            for (j= i+1; j<v.length;j++){
                Pessoa menor = compara(v[j], v[posmenor]);
                if (menor.equals(v[j])) posmenor = j;
            }    
            if (i!=posmenor){
                temp = v[i];
                v[i] = v[posmenor];
                v[posmenor] = temp;
            }
        }
    }
}
    
