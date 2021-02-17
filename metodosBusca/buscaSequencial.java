import java.util.ArrayList;

/*7. Implemente o algoritmo de busca sequencial, reordenando-o como elemento 
encontrado vindo uma posição para a frente. */


public class buscaSequencial {

    ArrayList<Integer> dados = new ArrayList<>();

    public int busca(int elemento){

        for(int i=0;i<dados.size();i++){
            if(dados.get(i) == elemento){
                if(i!=0) troca(i);
                
                return i;
            }
        }

        return -1;
    }

    public void troca(int posicao){
        int aux = dados.get(posicao-1);
        dados.set(posicao-1,dados.get(posicao));
        dados.set(posicao,aux);
    }
    
}
