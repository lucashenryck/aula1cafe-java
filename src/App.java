import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int[] notas = criarVetor(10, 10);
        mostrarVetor(notas);
    }
    public static void mostrarVetor(int[] vetor){
        for(int i = 0; i < vetor.length; i++){
            System.out.println("[" + i + "]" + vetor[i]);
        }
    }
    public static int[] criarVetor(int tamanho, int max){
        int[] vetor = new int[tamanho];
        Random r = new Random();
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = r.nextInt(max);
        }
        return vetor;
    } 
}
