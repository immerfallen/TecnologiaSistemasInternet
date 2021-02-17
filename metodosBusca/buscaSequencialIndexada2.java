/* 3. Com base no exercício 2, crie mais uma tabela índice e veja o comportamento do 
algoritmo. Qual foi mais eficiente? */


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class buscaSequencialIndexada2 {
    ArrayList<Integer> dados = new ArrayList<>();
    Map<Integer, Integer> tabelaIndexada = new HashMap<Integer, Integer>();
    Map<Integer, Integer> tabelaIndexada2 = new HashMap<Integer, Integer>();

    public  void BuscaSequencial(){
        Random random = new Random();
        for(int i=0;i<=1000;i++){
            dados.add(random.nextInt(1000));
        }
        Collections.sort(dados);

        for(int i = 0; i<1000;i+=100){
            tabelaIndexada.put(i, dados.get(i));
        }     
        
        for(int i= 2; i<=10;i+=2){
            tabelaIndexada2.put(i*100,tabelaIndexada.get(i*100));
        }
    }

    public int buscaTabelaIndexada(int elemento){
        int posicaoMaxima = buscaTabelaIndexada2(elemento);
        if(posicaoMaxima <0){
            return -1;
        }
        for(int i=(posicaoMaxima-200); i<=posicaoMaxima;i+=100){
            if(tabelaIndexada.get(i)>elemento){
                return i;
            }
        }
        return -1;
    }

    public int buscaTabelaIndexada2(int elemento){
        for(Integer chave : tabelaIndexada2.keySet()){
            if(tabelaIndexada2.get(chave) > elemento){
                return chave;
            }
        }
        return -1;
    }

    public int busca(int elemento){
        int posicaoMaxima = buscaTabelaIndexada(elemento);
        if(posicaoMaxima<0){
            return -1;
        }
        for(int i = (posicaoMaxima-100); i<posicaoMaxima;i++){
            if(dados.get(i)==elemento){
                return i;
            }
        }
        return -1;
    }
    

}

