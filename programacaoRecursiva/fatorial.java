/* 1. Implemente o fatorial de maneira iterativa e compare com a implementação 
recursiva. Utilize o gerenciador de processos para comparar o consumo de memória 
e o processamento.*/

public class fatorial {
    public static int iterativo(int n){
        int resultado = 1;
        for(int i=resultado;i<=n;i++){
            resultado = i*resultado;
        }
        return resultado;
    }

    public static int recursivo(int n){
        if(n==0){
            return 1;
        }
        return n*recursivo(n-1);

    }

    public static void main(String[] args){
        System.out.println(recursivo(11));
    }

}
