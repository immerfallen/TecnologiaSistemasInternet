import java.util.Arrays;

public class EncontraMaiorNumeroVetor {
    
    public static void main(String[] args){
        int[] v = {5,6,3,4,5};
        diferenca(v);        
        isOrdenado(v);
        System.out.println(isOrdenado(v));

        
    }

    public static void diferenca(int[] v){
        int maior;
        int menor;
        int diferenca = 0;
        maior = menor = v[0];
        for(int i=0;i<v.length;i++){                                     
                if(maior<v[i]){
                    maior=v[i];                                      
                }
                if(menor>v[i]){
                    menor = v[i];
                }            
        }
        diferenca = maior-menor;
        System.out.println(diferenca);
    }

    public static boolean isOrdenado(int[] v){
        int j=0;
        
        for(int i=0;i<v.length;i++){  
            j=i+1;                
                if(v[i]<v[j]){
                    return true;
                }
                else{
                    return false;
                }
                
            
        }


        return true;
    }
}
