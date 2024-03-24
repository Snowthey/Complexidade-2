public class Fatorial {

    int FatorialIterativo(int N){
        int cont = 1;
        int fat = 1;

        do{
            fat = fat * cont;
            cont++;
        } while (cont <= N);

        return N;
    }

    int FatorialRecursivo(int N){
        if(N <= 1){
            return 1;
        } else{
            return (N * FatorialRecursivo(N - 1));
        }

    }
}
