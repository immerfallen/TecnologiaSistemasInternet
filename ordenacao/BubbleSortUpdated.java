import java.util.Arrays;

public class BubbleSortUpdated {

    public static void bubbleSort(int[] v){
        boolean troca = true;
        for(int i=0;i<v.length && troca;i++){
            for(int j=0;j<v.length-1;j++){
                if(v[j]>v[j+1]){
                    trocar(v,j,j+1);
                    troca = true;
                }
            }
        }
    }

    public static void trocar(int[] v,int a, int b){
        int aux = v[a];
        v[a] = v[b];
        v[b] = aux;


    }

    public static void main(String[] args){
        int[] v = {36,12,29,42,10,83};

        bubbleSort(v);
        System.out.println(Arrays.toString(v));

    }
}
