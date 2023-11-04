import java.util.*;

public class main{
    public static void main (String arg[]){
        Scanner scn = new Scanner (System.in);
        System.out.println("Digite o tamanho do vetor");
        int tamanho = scn.nextInt();
        int[] vetor = new int[tamanho];
        System.out.println("Digite os valores a serem adicionados");
        for (int i = 0; i<tamanho; i++){
            int valor = scn.nextInt();
            vetor[i]=valor;
        }
        System.out.print("O vetor criado tem os elementos: ");
        for (int i = 0; i<tamanho; i++){
            System.out.print(vetor[i]+ "; ");
        }
            System.out.println("");
        System.out.println(descobrirPar(vetor, tamanho));
    }
    public static String descobrirPar (int[] vetor, int tamanho){
       int[] vetorPar = new int[tamanho];
        for (int i = 0; i<tamanho; i++){
            if (vetor[i]%2==0){
                vetorPar[i]=vetor[i];
            } 
        }
        System.out.print("Os valores pares sao: ");
        for (int i = 0; i<tamanho; i++){
            if (vetorPar[i]!=0){
            System.out.print(vetorPar[i]+ "; ");
        } 
        
    } return "";   
}   
}