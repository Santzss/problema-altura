import java.util.Scanner;

public class sistema {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N,H;

        System.out.println("=== Seja bem vindo ===");
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Quantos brinquedos ha no parque? ");
        N = sc.nextInt();
        int[] quantidadeBrinquedos = new int[N];
        System.out.println("Digite a sua altura: (90cm - 200cm)");
        H = sc.nextInt();


        System.out.println("Qual altura minima do(s) " + N + " brinquedo(s): ");
        for (int i = 0; i < N; i++) {
                quantidadeBrinquedos[i] = sc.nextInt();
        }

        int brinquedosLiberados = 0;

        for (int i = 0; i < N; i++) {
            if (H >= quantidadeBrinquedos[i]) {
                brinquedosLiberados++;
            }
        }

        System.out.println("Olá " + nome + " voce tem " + idade + " e esta liberado para brincar em: " + brinquedosLiberados + " brinquedo(s)! ");

        sc.close();
    }
}
