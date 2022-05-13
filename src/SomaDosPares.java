import java.util.Scanner;

public class SomaDosPares {
    public static void main(String[] args) {
        int numeroDigitado = 0, soma = 0;
        Scanner scan = new Scanner(System.in);

        while (numeroDigitado >= 0) {
            System.out.println("Informe um número Positivo");
            numeroDigitado = scan.nextInt();
            if (numeroDigitado % 2 == 0) {
                soma += numeroDigitado;
                System.out.println("A soma dos números positivos digitados é " + soma);
            } else  {
                System.out.println("[Programa Encerrado], o número digitado é Impar");
                break;
            }
        }
    }
}
