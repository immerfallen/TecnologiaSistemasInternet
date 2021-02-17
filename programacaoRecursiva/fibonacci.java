/*2. Implemente o cálculo de Fibonacci de maneira iterativa e 
compare com a implementação recursiva. Utilize o gerenciador de 
processos para comparar o consumo de memória e o processamento.  */


public class fibonacci {
    
    public static int iterativo(int n){
        int f = -1;
        int fibMenos1 =1;
        int fibMenos2 = 0;
        for(int i = 3; i<=n;i++){
            f = fibMenos1 + fibMenos2;
            fibMenos2 = fibMenos1;
            fibMenos1 = f;
        } 
        return f;
    }

    public static int recursivoBinario(int n){
        if(n==0 || n==1) return 0;
        if (n==2) return 1;
        return recursivoBinario(n-2) + recursivoBinario(n-1);
    }

    public static void main(String[] args){
        System.out.println(recursivoBinario(13));
    }

}
